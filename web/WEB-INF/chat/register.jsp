<%--
  Created by IntelliJ IDEA.
  User: lq-pc
  Date: 15/4/10
  Time: 下午3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>请输入用户信息</title>
</head>
<body>
${requestScope.get("msg")}
<form action="${pageContext.request.contextPath}/chat/Register" method="post">
用户名：<input type="text" name="username"><br>
密码： <input type="password" name="password"><br>
确认密码： <input type="password" name="password2"><br>
<input type="submit" name="注册"><a href="${pageContext.request.contextPath}/chat/LogonUI">登陆</a>
</form>
</body>
</html>
