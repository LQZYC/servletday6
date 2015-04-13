package cn.itcast.servletday6.chat;

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
@WebServlet(name = "ListInfo" ,value ="/chat/ListInfo")
public class ListInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forwardPath = "/WEB-INF/chat/chatRoom.jsp";
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            forwardPath = "/WEB-INF/chat/Logon.jsp";
        }
        request.getRequestDispatcher(forwardPath).forward(request,response);
        return;
    }
}
