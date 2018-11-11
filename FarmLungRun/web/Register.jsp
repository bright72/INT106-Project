<%-- 
    Document   : Register
    Created on : Nov 11, 2018, 10:06:20 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="register-modal" tabindex="-1" role="dialog" aria-labelledby="Register" aria-hidden="true" class="modal fade">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Customer Register</h5>
                    <!--<button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>-->
                </div>
                <div class="modal-body">
                    <h1>New account</h1>
                    <p class="lead">Not our registered customer yet?</p>                 
                    <hr>
                    <form action="Register" method="post">
                        <div class="form-group">                                  
                            <label for="name">Username</label>
                            <input name="username" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input name="password" type="password" class="form-control" required>
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
                            <input name="address" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="province">Province</label>
                            <input name="province" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="country">Country</label>
                            <input name="country" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="postalcode">Postal Code</label>
                            <input name="postalcode" type="text" class="form-control" required>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary"><i class="fa fa-user-md"></i> Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
