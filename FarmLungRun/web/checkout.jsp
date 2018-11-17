<%-- 
    Document   : checkout
    Created on : Nov 2, 2018, 11:05:26 AM
    Author     : INT303
--%>

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

                            <form action="Checkout" method="post">
                                <div class="row">                                  

                                    <div class="col-12 mb-4">
                                        <textarea type="text" class="form-control" placeholder="Address" value="Address"></textarea>                                        
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <input type="text" class="form-control" id="city" placeholder="Province" name="Province">
                                    </div>                                    
                                    <div class="col-md-6 mb-3">
                                        <input type="text" class="form-control" id="zipCode" placeholder="PostalCode" name="PostalCode">
                                    </div>                
                                    <div class="col-12 mb-3">
                                        <input name="country" type="text" class="form-control" placeholder="Country">
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="col-12 col-lg-4">
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">
                                <li><span>subtotal:</span> <span>140.00 ฿</span></li>
                                <li><span>delivery:</span> <span>Free</span></li>
                                <li><span>total:</span> <span>140.00 ฿</span></li>
                            </ul>
                            <div class="payment-method">
                                <!-- Paypal -->
                                <div class="custom-control custom-checkbox mr-sm-2">
                                    <input type="checkbox" class="custom-control-input" id="paypal" checked="true" disabled="">
                                    <label class="custom-control-label" for="paypal">Credit Card <img class="ml-15" src="img/core-img/paypal.png" alt=""></label>
                                </div>
                                <p style="color:red;">${message_checkout}</p>
                            </div>           
                            <form action="Checkout" method="post">
                                <input type="number" placeholder="Card number">
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
    <!-- ##### Main Content Wrapper End ##### -->

    <jsp:include page="include/footer.jsp?page=Checkout"/>

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
