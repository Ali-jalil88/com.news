<%--
  Created by IntelliJ IDEA.
  User: Ali Jalil
  Date: 03-Aug-20
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ALI AL_Arkawazi 8 </title>
    <link rel="stylesheet" href="text8.css">
    <style>
body{
    background-image: linear-gradient(to right,red , #2600ff);
    margin-top: 150px !important;
}
        .register-left .font{
            width: 5%;
        }
        .register-left{
text-align: match-parent;
            color: #fff;
            padding: 30px;
        }
        .register-left p{
            padding: 20px 20px 0;
        }
        .register-left .but-primary{
            border-radius: 1.5rem;
            border: none;
            width: 120px;
            background: #f8f8f8;
            font-weight: 600;
            color: #555;
            margin-top: 20px;
            padding: 10px;
        }
        .register-left .but-primary:hover{
            background: #000;
        }
        .register-right{
text-align: center;
        }
        .register-form{
            text-align: center;
        }
        .register-right{
            border: none;
            background: #f8f8f8;
            border-top-left-radius: 1% 1%;
            border-bottom-left-radius: 1% 1%;
            padding: 10px;
        }
    </style>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md10 offset=md-1">
            <div class="row">
                <div class="col-md-5 register-left">
                    <img src="https://e1.pngegg.com/pngimages/597/240/png-clipart-black-glass-layer-style-black-down-arrow-illustration.png" class="font">
                    <h1>Ali Jalil </h1>
                   <h2><p>subscribe on this page</p></h2>
                    <button type="button" class="but but-primary">click</button>
                    <div class="col-mad-10 register-right">
                        <h2>Register Here</h2>
                        <div class="register-form">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="UserName">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Name">
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" placeholder="Email">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Password">
                            </div>
                            <button type="button" class="but but-primary">Register</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
