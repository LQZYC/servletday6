<%--
  Created by IntelliJ IDEA.
  User: lq-pc
  Date: 15/4/11
  Time: 下午6:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath}/chat/Logon" method="post">
 用户名： <input type="text" name="username" ><br>
  密码：  <input type="text" name="password" ><br>
  <input type="submit" name="登陆"><a href="${pageContext.request.contextPath}/chat/RegisterUI">注册</a>
  <br>
</form>
</body>
</html>
