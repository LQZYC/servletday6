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
@WebServlet(name = "ResgisterUI",value = "/chat/RegisterUI")
public class ResgisterUI extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("msg","请输入您的注册信息");
        request.getRequestDispatcher("/WEB-INF/chat/register.jsp").forward(request,response);
    }
}
