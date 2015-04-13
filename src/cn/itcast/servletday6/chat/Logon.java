package cn.itcast.servletday6.chat;

import cn.itcast.servletday6.chat.dto.UserDao;
import cn.itcast.servletday6.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.Vector;

/**
 * User %{USER}
 * Date %{DATE}
 * Time %{TIME}
 */
@WebServlet(name = "Logon",value = "/chat/Logon")
public class Logon extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
System.out.println(username +"  "+password);
        if (password==null||username.trim().equals("")||(password.length()<3)){
            request.setAttribute("msg", "填写的信息有错误，请重新填写");
            request.getRequestDispatcher("/WEB-INF/chat/Logon.jsp").forward(request,response);
            return;
        }

        User dbUser = UserDao.getInstance().findByName(username);
        if (dbUser == null){
            request.setAttribute("msg", "用户不存在，请重新填写");
            request.getRequestDispatcher("/WEB-INF/chat/Logon.jsp").forward(request,response);
            return;
        }
        if (!password.equals(dbUser.getPassword())){
            request.setAttribute("msg", "密码错误，请重新填写");
            request.getRequestDispatcher("/WEB-INF/chat/Logon.jsp").forward(request,response);
            return;
        }

        Vector<HttpSession> userSessions = (Vector<HttpSession>) getServletContext().getAttribute("userSessions");
        for (int i = 0 ;i<userSessions.size();i++){
            if (((User)(userSessions.get(i).getAttribute("user"))).getName().equals(dbUser.getName())){
                userSessions.get(i).invalidate();
                break;
            }
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", dbUser);

        //Vector<HttpSession> userSessions = (Vector<HttpSession>) getServletContext().getAttribute("userSessions");
        userSessions.add(session);
        response.sendRedirect(request.getContextPath()+"/chat/ListInfo");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
