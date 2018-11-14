<%-- 
    Document   : Home
    Created on : Nov 2, 2018, 11:04:23 AM
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
        <title>Farm LungRun | Home</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">

    </head>

    <body>


        <jsp:include page="include/nav.jsp?page=Home"/>

        <!-- Product Catagories Area Start -->
        <div class="products-catagories-area clearfix">
            <div class="amado-pro-catagory clearfix">

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="img/V_1001.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>From 35฿</p>
                            <h4>Tomato</h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop.html">
                        <img src="img/V_1002.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>From 28฿</p>
                            <h4>Carrot</h4>
                        </div>
                    </a>
                </div>

                <!--                     Single Catagory 
                                    <div class="single-products-catagory clearfix">
                                        <a href="shop.html">
                                            <img src="img/bg-img/3.jpg" alt="">
                                             Hover Content 
                                            <div class="hover-content">
                                                <div class="line"></div>
                                                <p>From $180</p>
                                                <h4>Modern Chair</h4>
                                            </div>
                                        </a>
                                    </div>
                
                                     Single Catagory 
                                    <div class="single-products-catagory clearfix">
                                        <a href="shop.html">
                                            <img src="img/bg-img/4.jpg" alt="">
                                             Hover Content 
                                            <div class="hover-content">
                                                <div class="line"></div>
                                                <p>From $180</p>
                                                <h4>Night Stand</h4>
                                            </div>
                                        </a>
                                    </div>
                
                                     Single Catagory 
                                    <div class="single-products-catagory clearfix">
                                        <a href="shop.html">
                                            <img src="img/bg-img/5.jpg" alt="">
                                             Hover Content 
                                            <div>
                                                <div class="line"></div>
                                                <p>From $18</p>
                                                <h4>Plant Pot</h4>
                                            </div>
                                        </a>
                                    </div>-->

                <c:forEach items="${product}" var="p" varStatus="n">
                    <div class="single-products-catagory clearfix">
                        <a href="shop.html">
                            <img src="img/${p.productid}.png" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From ${p.productprice}</p>
                                <h4>${p.productname}</h4>
                            </div>
                        </a>
                    </div>
                </c:forEach>

            </div>
        </div>
        <!-- Product Catagories Area End -->
    </div>
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
    <jsp:include page="include/footer.jsp?page=Home"/>
</body>
</html>
