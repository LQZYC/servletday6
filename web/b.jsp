<%@ page import="cn.HTMLFilter" %>
<%--
  Created by IntelliJ IDEA.
  User: lq-pc
  Date: 15/4/9
  Time: 下午4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="xxx" uri="/WEB-INF/xx.tld"%>
<html>
<head>
    <title></title>
</head>
<body>
<%--${pageContext.request.contextPath}<br>--%>
<%--${pageContext.response.characterEncoding}<br>--%>
<%--${pageContext.servletContext.minorVersion}<br>--%>
<%--${pageContext.servletContext.contextPath}<br>--%>
<%--<%pageContext.setAttribute("key1","value1");%>--%>
<%--<%request.setAttribute("key2","value2");%>--%>
<%--<%session.setAttribute("key3","value3");%>--%>
<%--<%application.setAttribute("key4","value4");%>--%>
<%--<hr>--%>
<%--${pageScope}<br>--%>
<%--${pageScope.size()}<br>--%>
<%--<hr>--%>
<%--${requestScope}<br>--%>
<%--${requestScope.size()}<br>--%>
<%--<hr>--%>
<%--${sessionScope}<br>--%>
<%--${sessionScope.size()}<br>--%>
<%--<hr>--%>
<%--${applicationScope}<br>--%>
<%--${applicationScope.size()}--%>
<%--<hr>--%>
<%--${param.username} : ${paramValues.username[0]}--%>
<%--<hr>--%>
<%--${header}<br>--%>
<%--${header.connection} ${headerValues.connection[0]}<br>--%>
<%--<hr>--%>
<%--${cookie}<br>--%>
<%--${cookie.JSESSIONID.value}<br>--%>
<%--<hr>--%>
<%--${initParam.corp}<br>--%>
<%pageContext.setAttribute("content", "<meta http-equiv='Refresh' content='0;url=http://www.baidu.com'/>");%>
<%--${xxx:trans(content) }--%>
<%HTMLFilter.filter("123")%>
</body>
</html>
