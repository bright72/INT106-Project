
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
        <title>Farm LungRun | Order History</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/LOGO.PNG">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
    </head>

    <body>
        <jsp:include page="include/nav.jsp?page=History"/>

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="cart-title mt-50">
                            <h2>Orders History</h2>
                        </div>

                        <div class="cart-table clearfix">
                            <table class="table table-responsive">
                                <thead>
                                    <tr style="text-align: center">
                                        <th>Orders ID</th>
                                        <th>Date</th>
                                        <th>Total Price</th>                   
                                    </tr>
                                </thead>


                                <c:forEach items="${accountorders}" var="o" varStatus="n">
                                    <tbody>
                                        <tr style="text-align: center">
                                            <td class="orders_id">
                                                <h5>${o.orderid}</h5>
                                            </td>
                                            <td class="orders_date">
                                                <h5>${o.orderdate}</h5>
                                            </td>
                                            <td class="orders_totalPrice">
                                                <h5>${o.totalprice} ฿</h5>
                                            </td>
                                            <td>
                                                <a href="HistoryDetail?orderid=${o.orderid}"><button class="btn amado-btn w-100">View order detail</button></a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </c:forEach>                                
                            </table>
                            <div style="text-align: center">
                                <c:if test="${sessionScope.accountorders == null}">
                                    <h3 style="color: grey">${message}</h3>
                                </c:if>
                            </div>
                        </div>
                    </div>
                    <!--                    <div class="col-12 col-lg-4">
                                            <div class="cart-summary">
                                                <h5>Cart Total</h5>
                                                <ul class="summary-table">
                                                    <li><span>subtotal:</span> <span>${sessionScope.cart == null ? "0 " : " "}${cart.totalPrice}฿</span></li>
                                                    <li><span>delivery:</span> <span>Free</span></li>
                                                    <li><span>total:</span> <span>${sessionScope.cart == null ? "0 " : " "}${cart.totalPrice}฿</span></li>
                                                </ul>             
                                                <div class="cart-btn">
                    <c:if test="${cart==null}">
                        <p style="color: red;">${message_checkout}</p>
                        <a href="Checkout" class="btn amado-btn w-100">Checkout</a>
                    </c:if>
                    <c:if test="${cart!=null}">
                        <a href="checkout.jsp" class="btn amado-btn w-100">Checkout</a>
                    </c:if>
                </div>
            </div>
        </div>-->
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

