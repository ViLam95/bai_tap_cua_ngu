<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: viquoclam
  Date: 24/05/2023
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
    <h1>Nơi tình yêu bắt đầu</h1>
    <%
        String username = request.getAttribute("username").toString();
        Date loginTime = (Date)request.getAttribute("loginTime");
    %>
    <h3>Hi <%=username%></h3>
    <h3>Login time: <%=loginTime%></h3>
</body>
</html>
