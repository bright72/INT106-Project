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
            <jsp:include page="include/nav.jsp?page=Checkout"/>
            <div class="cart-table-area section-padding-100">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12 col-lg-8">
                            <div class="checkout_details_area mt-50 clearfix">
                                <div class="cart-title">
                                    <h2>Checkout</h2>
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
                        <div class="col-12 col-lg-4">
                            <div class="cart-summary">
                                <h5>Cart Total</h5>
                                <ul class="summary-table">
                                    <li><span>subtotal:</span> <span>${cart.totalPrice}฿</span></li>
                                    <li><span>delivery:</span> <span>Free</span></li>
                                    <li><span>total:</span> <span style="color: green">${cart.totalPrice}฿</span></li>
                                </ul>
                                <div class="payment-method">
                                    <!-- Paypal -->
                                    <div class="custom-control custom-checkbox mr-sm-2">
                                        <input type="checkbox" class="custom-control-input" id="paypal" checked="true" disabled="">
                                        <label class="custom-control-label" for="paypal">Credit Card <img class="ml-15" src="img/core-img/paypal.png" alt=""></label>
                                    </div>
                                    <p style="color:red;">${message_checkout}</p>
                                </div>    

                                <div><input maxlength="13" type="text" placeholder="Card number"></div> <br>
                                <div><input style="width: 30%" maxlength="3" type="text" placeholder="CVC">
                                    <input style="width: 15%" maxlength="2" type="text" placeholder="MM"> / 
                                    <input style="width: 15%" maxlength="2" type="text" placeholder="YY"></div> <br>

                                <form action="Checkout" method="post">

                                    <div class="col-13 mb-3 ">                                    
                                        <textarea name="comment" class="form-control w-100" id="comment" cols="10" rows="3" placeholder="Leave a comment about your order"></textarea>
                                    </div>
                                    <div class="cart-btn">
                                        <input type="submit"class="btn amado-btn w-100"value="Checkout">
                                    </div>

                                </form>
                            </div>
                        </div> 
                    </div>                
                </div>
            </div>
        </div>
        <jsp:include page="include/footer.jsp?page=Checkout"/>
        </body>

    </c:if>

    <c:if test="${success != null}">
        <body style="background-color: #565656" >
        
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Success Checkout</h5>                    
                    </div>
                    <div class="modal-body">
                        <p class="text-center text-muted">Your order has been successful!</p>
                        <div class="text-center">
                            <a href="History"> <button type="submit" class="btn btn-primary">See my order</button></a>                    
                        </div>
                    </div>
                </div>
            </div>
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
</body>
</html>
