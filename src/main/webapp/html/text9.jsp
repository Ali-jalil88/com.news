<%--
  Created by IntelliJ IDEA.
  User: Ali Jalil
  Date: 03-Aug-20
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ALI AL_Arkawazi 9 </title>
    <link rel="stylesheet" href="text9.css">
<style>
    body{
        background-image: linear-gradient(to right,red , #2600ff);
        margin-top:0px !important;
    }
input[value="GET STARTED"]:hover {
background-blend-mode: color;
    background: #deff15;
    width: 90px;
    height: 50px;
}
    .h1{
        text-align: center;
     }
.button:hover{
    background-blend-mode: color;
    background: rebeccapurple;
    text-align: center;
    width: 90px;
    height: 50px;
}
    .button1:hover{
        background-blend-mode: color;
        background: rebeccapurple;
        target-name: modal;
        width: 90px;
        height: 50px;

    }
</style>
</head>
<body>



<div id="ALI 9">
    <button class="button" style="color: red">Sing Up</button>
    <button class="button1">Log in</button>
    <br><br><br>
    <h1 class="h1" style="color: darkorange">Sing Up For Free</h1>
<br><br>
    <input type="text"  placeholder="First_Name" style="color: black">
<input type="text" placeholder="Last_Name">
<br><br>
<input type="email" placeholder="Email">
<br><br>
<input type="password" placeholder="Password">
<br><br>
    <input type="text" placeholder="Gender">
    <select autofocus disabled>
    <option>Male</option>
    <option>female</option>
</select>
    <br><br><br>
<input type="submit" value="GET STARTED">

</div>
</body>
</html>
