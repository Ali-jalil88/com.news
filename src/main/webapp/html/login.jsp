<%--
  Created by IntelliJ IDEA.
  User: Ali Jalil
  Date: 28-Jul-20
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>

<a href="test.jsp">test</a>
<br>
<div class="HI">HI</div>
<form action="${pageContext.request.contextPath}/controller" method="post">
    <label>Login</label>
    <input type="text" name="name" placeholder="enter login"><br>
    <label>password</label>
    <input type="password" name="password" placeholder="enter password"><br>
    <input type="text" name="command" value="command_login_user" hidden/><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
