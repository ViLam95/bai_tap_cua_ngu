<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: viquoclam
  Date: 24/05/2023
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<h1>Xin đừng buông tay anh </h1>
    <%
        String username = request.getParameter("username");
        Date onTime = (Date)request.getAttribute("onTime");
    %>
<h3>Hi <%=username%></h3>
<h3>Login time: <%=onTime%></h3>
</body>
</html>