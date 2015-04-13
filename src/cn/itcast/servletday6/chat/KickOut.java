package cn.itcast.servletday6.chat;

import cn.itcast.servletday6.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Vector;

/**
 * User %{USER}
 * Date %{DATE}
 * Time %{TIME}
 */
@WebServlet(name = "KickOut", value = "/chat/KickOut")
public class KickOut extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        System.out.println(username);
        if (username==null){
            response.sendRedirect(request.getContextPath()+"/chat/ListInfo");
            return;
        }
        System.out.println(request.getRemoteAddr());
//           if (request.getRemoteAddr().equals("10.11.114.248")){
               Vector<HttpSession> userSessions = (Vector<HttpSession>) getServletContext().getAttribute("userSessions");
               for (int i = 0 ;i<userSessions.size();i++){
                   if (((User)(userSessions.get(i).getAttribute("user"))).getName().equals(username)){
                       userSessions.get(i).invalidate();
                       break;
                   }
               }
//           }
        response.sendRedirect(request.getContextPath()+"/chat/ListInfo");
    }
}
