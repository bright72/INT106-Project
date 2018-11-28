<%-- 
    Document   : checkout
    Created on : Nov 2, 2018, 11:05:26 AM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en th">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title  -->
        <title>Farm LungRun | Checkout</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/LOGO.PNG">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        
    </head>
    <c:if test="${success == null}">
        <body>  
            <div>
            <jsp:include page="include/nav.jsp?page=Checkout"/>               
            <div class="cart-table-area section-padding-100">
                <div class="container-fluid">
                    <div class="row">             
                        <div class="checkout_details_area mt-50 clearfix">
                            <div class="cart-title">
                                <h2>My Account</h2>
                            </div>
                            <div>
                                <h5>Your Address information</h5>
                                <p>${sessionScope.account.fname} ${sessionScope.account.lname}</p>
                                <p>${sessionScope.account.address}</p>
                                <p>${sessionScope.account.province}, ${sessionScope.account.country}, ${sessionScope.account.postalcode}</p>
                            </div>
                            <br>
                            <form action="UpdateAddress" method="post">                                
                                <h5>If your address is incorrect, please update new address below.</h5>
                                <div>${message}</div>
                                <div class="row">                                
                                    <div class="col-12 mb-4">
                                        <textarea type="text" class="form-control" placeholder="Address" value="Address" name="Address" required></textarea>                                        
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <input type="text" class="form-control" id="city" placeholder="Province" name="Province" required>
                                    </div>                                    
                                    <div class="col-md-6 mb-3">
                                        <input type="text" class="form-control" id="zipCode" placeholder="PostalCode" name="PostalCode" required>
                                    </div>                
                                    <div class="col-12 mb-3">
                                        <input name="Country" type="text" class="form-control" placeholder="Country" required>
                                    </div>
                                </div>
                                <div class="cart-btn">
                                    <input type="submit"class="btn amado-btn w-100"value="Update My Address">
                                </div>
                            </form>
                        </div>                        
                    </div>                
                </div>
            </div> 
            </div>
        <jsp:include page="include/footer.jsp?page=Checkout"/>         
    </body>   
</c:if> 

<!-- ##### Main Content Wrapper End ##### -->

<!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
<script src="js/jquery/jquery-2.2.4.min.js"></script>
<!-- Popper js -->
<script src="js/popper.min.js"></script>
<!-- Bootstrap js -->
<script src="js/bootstrap.min.js"></script>
<!-- Plugins js -->
<script src="js/plugins.js"></script>
<!-- Active js -->
<script src="js/active.js"></script>
</html>
