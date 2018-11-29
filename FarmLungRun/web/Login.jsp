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
        <title>Farm LungRun | Login</title>
        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/LOGO.PNG">
        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
    </head>
    <body>
        <div style="padding:5%">
            <div class="modal-content"  >
                <div class="modal-header">
                    <h5 class="modal-title">Customer login</h5>
                    <a href="Home">
                        <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
                    </a>
                </div>
                <div class="modal-body">
                    <form action="Login" method="post">
                        <div class="form-group">
                            <input id="email-modal" type="text" name="username" placeholder="username" class="form-control" pattern="[A-Za-z0-9-_]{4,}">
                        </div>
                        <div class="form-group">
                            <input id="password-modal" type="password" name="password" placeholder="password" class="form-control" pattern="[A-Za-z0-9-_]{4,}">
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
                        <a href="Register"><button class="btn btn-primary"><i class="fa fa-user-md"></i> Register</button></a>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="include/footer.jsp?page=Home"/>
    </body>
</html>
