<%--
  Created by IntelliJ IDEA.
  User: Ali Jalil
  Date: 28-Jul-20
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ziko</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
<div class="HELLO">
<br><br><br><br>
<form action="${pageContext.request.contextPath}/controller" method="post">
    <label> Name</label>
    <input type="text" name="name" size="50" placeholder="Enter name"/><br><br>
    <label>Last_Name</label>
    <input type="text"  name="last_name" placeholder=" Enter Last_Name" size="45"/><br><br>
    <label>Login</label>
    <input type="text" name="login" size="50" placeholder="Enter login"/><br><br>
    <label>Password</label>
    <input type="password" name="pass"  placeholder="Enter password" size="47"/><br><br>
    <label>Email</label>
    <input type="text" name="email" size="50" placeholder="Enter email"/><br><br><br><br>
    <input type="text" name="command" size="50" value="command_create_user" hidden/>
    <input type="submit" size="50" value="register"><br><br><br><br>
</form>
</div>
<a href="${pageContext.request.contextPath}/controller">click</a>
</body>
</html>
