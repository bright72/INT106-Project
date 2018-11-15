<%-- 
    Document   : Register
    Created on : Nov 11, 2018, 10:06:20 PM
    Author     : Dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">

    </head>
    <body>

        <c:if test="${success == null}">
            <div class="modal-dialog ">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Customer Register</h5>
                        <a href="Home">
                            <button type="button" class="close" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </a>
                    </div> 

                    <div class="modal-body">
                        <h1>New account</h1>
                        <p class="lead">Not our registered customer yet?</p>                 
                        <hr>
                        <form action="Register" method="post">
                            <p style="color: red">${message}</p>
                            <div class="form-group">                                  
                                <label for="name">Username</label>
                                <input placeholder="Username length more than 4" name="username" type="text" class="form-control" required>                          
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input placeholder="Password length more than 4" name="password" type="password" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="fname">First Name</label>
                                <input name="fname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="lname">Last Name</label>
                                <input name="lname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="address">Address</label>
                                <input name="address" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label for="province">Province</label>
                                <input name="province" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label for="country">Country</label>
                                <input name="country" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label for="postalcode">Postal Code</label>
                                <input name="postalcode" type="text" class="form-control" >
                            </div>
                            <div class="text-center" >
                                <button type="submit" class="btn btn-primary"><i class="fa fa-user-md"></i> Register</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>                    
        </c:if>

        <c:if test="${success != null}">
<!--            <div class="modal-dialog ">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Success Register</h5>
                        <a href="Home">
                            <button type="button" class="close" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <hr><br>
                            <div class="text-center" >
                              <a href="Home">  <button class="btn btn-primary"><i class="home"></i> Go to Home Page</button></a>
                            </div>
                        </a>
                    </div>
                </div>
            </div>-->
<div class="modal-dialog modal-sm">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Success Register</h5>
              <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
              <p class="text-center text-muted">Welcome to Our Farm</p>
              <div class="text-center">
                  <a href="Home"> <button type="submit" class="btn btn-primary">Go to Home Page</button></a>
                  </div>
            </div>
          </div>
        </div>
        </c:if>

        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    </body>
</html>
