<%-- 
    Document   : Login
    Created on : Nov 9, 2018, 5:56:13 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">

    </head>
    <body style="background-color: #565656">
        <!--        <h1>Login</h1>
                <form action="Login" method="post">
                    username : <input type="text" name="username" required>
                    password : <input type="text" name="password" required>
                    <input type="submit" value="Login">
                </form>-->


        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Customer login</h5>
                    <a href="Home">
                        <button type="button" class="close" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </a>
                    <!--<button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>-->
                </div>
                <div class="modal-body">
                    <form action="Login" method="post">
                        <div class="form-group">
                            <input id="email-modal" type="text" name="username" placeholder="username" class="form-control">
                        </div>
                        <div class="form-group">
                            <input id="password-modal" type="password" name="password" placeholder="password" class="form-control">
                        </div>
                        <div style="color: red" class="text-center">
                            ${message}
                        </div> <br>
                        <p class="text-center">
                            <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                        </p>
                    </form>
                    <p class="text-center text-muted">Not registered yet?</p>
                    <div class="text-center">
                        <!--<button type="submit" class="btn btn-primary" href="Register"><i class="fa fa-user-md"></i> Register</button>-->
                        <a href="Register"><button class="btn btn-primary"><i class="fa fa-user-md"></i> Register</button></a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
