package cn.itcast.servletday6.chat;

import cn.itcast.servletday6.chat.dto.UserDao;
import cn.itcast.servletday6.domain.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import javax.lang.model.element.Name;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.ValidationEvent;
import java.io.IOException;
import java.util.Vector;

/**
 * User %{USER}
 * Date %{DATE}
 * Time %{TIME}
 */
@WebServlet(name = "Register",value = "/chat/Register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
        if (password==null||username.trim().equals("")||(password.length()<3)||!password.equals(password2)){
            request.setAttribute("msg", "填写的信息有错误，请重新填写");
            request.getRequestDispatcher("/WEB-INF/chat/register.jsp").forward(request,response);
            return;
        }

//        if (!username.matches("^(d|[a-zA-Z]|[\u4e00-\u9fa5])(1,10)$")){
//            request.setAttribute("msg", "填写的信息有错误，请重新填写");
//            request.getRequestDispatcher("/WEB-INF/chat/register.jsp").forward(request,response);
//            return;
//        }

        User dbUser = UserDao.getInstance().findByName(username);
        if (dbUser!=null){
            request.setAttribute("msg", "用户已被注册，请重新填写");
            request.getRequestDispatcher("/WEB-INF/chat/register.jsp").forward(request,response);
            return;
        }
        User user = new User(username,password);
        UserDao.getInstance().addUser(user);

        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        Vector<HttpSession> userSessions = (Vector<HttpSession>)getServletContext().getAttribute("userSessions");
        userSessions.add(session);

        response.sendRedirect(request.getContextPath()+"/chat/ListInfo");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
