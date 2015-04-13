package cn.itcast.servletday6.chat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User %{USER}
 * Date %{DATE}
 * Time %{TIME}
 */
@WebServlet(name = "LogonUI" ,value = "/chat/LogonUI")
public class LogonUI extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("msg","请输入您的登陆信息");
    request.getRequestDispatcher("/WEB-INF/chat/Logon.jsp").forward(request,response);
    }
}
