<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: lq-pc
  Date: 15/4/9
  Time: 上午11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
<body>
    <%--<jsp:useBean id="myDate" class="java.util.Date" scope="page"></jsp:useBean>--%>
    <%--<%pageContext.setAttribute("myDate",new java.util.Date());%>--%>
<%--hi--%>
    <%--<jsp:getProperty name="myDate" property="year" />--%>

    <%--<jsp:setProperty name="myDate" property="year" value="100"/>--%>

    <%--<%=((Date)pageContext.findAttribute("myDate")).getYear()%>--%>

    <%--<jsp:useBean id="mydate1" class="java.util.Date" scope="session">--%>
      <%--<jsp:getProperty name="myDate" property="year"/>--%>
    <%--</jsp:useBean>--%>
<%--<jsp:setProperty name="mydate1" property="year" value='<%=Integer.parseInt(request.getParameter("year"))%>'/>--%>
    <%--<jsp:getProperty name="mydate1" property="year"></jsp:getProperty>--%>
    <%--<jsp:setProperty name="mydate1" property="year" param="myear"/>--%>
      <%--<jsp:getProperty name="mydate1" property="year"></jsp:getProperty>--%>

    <%--<jsp:setProperty name="mydate1" property="year"/>--%>
    <%--<jsp:getProperty name="mydate1" property="year"></jsp:getProperty>--%>

  <jsp:forward page="/chat/RegisterUI"></jsp:forward>
      </body>
  </head>
</html>
