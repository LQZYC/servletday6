<%@ page import="cn.itcast.servletday6.listeners.MyBean" %>
<%--
  Created by IntelliJ IDEA.
  User: lq-pc
  Date: 15/4/9
  Time: 下午4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%session.setAttribute("mytest",new MyBean());%>

</body>
</html>
