<%@ page import="cn.itcast.servletday6.domain.User" %>
<%@ page import="java.util.Vector" %>
<%--
  Created by IntelliJ IDEA.
  User: lq-pc
  Date: 15/4/10
  Time: 下午8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
<>
  <meta http-equiv="refresh" content="2">
    <title></title>
</head>
<body>
<a href="${pageContext.request.contextPath}/chat/logoff">注销</a>
<%Vector<HttpSession> sessions = (Vector<HttpSession>) pageContext.findAttribute("userSessions");%>
<%for (int i =0;i<sessions.size();i++){%>
  <%=((User)sessions.get(i).getAttribute("user")).getName()%><a href="${pageContext.request.contextPath}/chat/KickOut?username=<%=((User)sessions.get(i).getAttribute("user")).getName()%>">踢出去</a>
<%}%>
</body>
</html>
