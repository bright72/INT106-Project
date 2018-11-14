<%-- 
    Document   : cart
    Created on : Nov 2, 2018, 11:05:32 AM
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
        <title>Farm LungRun | Cart</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">

    </head>

    <body>
        <jsp:include page="include/nav.jsp?page=Cart"/>

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="cart-title mt-50">
                            <h2>Shopping Cart</h2>
                        </div>

                        <div class="cart-table clearfix">
                            <table class="table table-responsive">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>Name</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="cart_product_img">
                                            <a href="#"><img src="img/E_4001.png" alt="Product"></a>
                                        </td>
                                        <td class="cart_product_desc">
                                            <h5>Egg</h5>
                                        </td>
                                        <td class="price">
                                            <span>90฿</span>
                                        </td>
                                        <td class="qty">
                                            <div class="qty-btn d-flex">
                                                <p>Qty</p>
                                                <div class="quantity">
                                                    <span class="qty-minus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty) & amp; & amp; qty & gt; 1) effect.value--; return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                    <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="quantity" value="1">
                                                    <span class="qty-plus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty)) effect.value++; return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>

                                <c:forEach items="${product}" var="p" varStatus="n">
                                    <tbody>
                                        <tr>
                                            <td class="cart_product_img">
                                                <a href="#"><img src="img/${p.productcode}.png" alt="${p.productcode}"></a>
                                            </td>
                                            <td class="cart_product_desc">
                                                <h5>${p.productname}</h5>
                                            </td>
                                            <td class="price">
                                                <span>${p.productprice}</span>
                                            </td>
                                            <td class="qty">
                                                <div class="qty-btn d-flex">
                                                    <p>Qty</p>
                                                    <div class="quantity">
                                                        <form action="/Cart" method ="post">
                                                            <span class="qty-minus" onclick="var effect = document.getElementById('qty3'); var qty = effect.value; if (!isNaN(qty) & amp; & amp; qty & gt; 1) effect.value--; return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                            <input type="number" class="qty-text" id="qty3" step="1" min="1" max="300" name="quantity" value="">
                                                            <span class="qty-plus" onclick="var effect = document.getElementById('qty3'); var qty = effect.value; if (!isNaN(qty)) effect.value++; return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </c:forEach>
                            </table>
                        </div>
                    </div>
                    <div class="col-12 col-lg-4">
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">
                                <li><span>subtotal:</span> <span>140฿</span></li>
                                <li><span>delivery:</span> <span>Free</span></li>
                                <li><span>total:</span> <span>140.00฿</span></li>
                            </ul>
                            <div class="cart-btn mt-100">
                                <a href="Checkout" class="btn amado-btn w-100">Checkout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </body>

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

    <jsp:include page="include/footer.jsp?page=Cart"/>

</html>  
