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

        <!-- Title  -->
        <title>Farm LungRun | Home</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/LOGO.PNG">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">

    </head>

    <body>


        <jsp:include page="include/nav.jsp?page=Home"/>

        <!-- Product Catagories Area Start -->
        <div class="products-catagories-area clearfix">
            <div class="amado-pro-catagory clearfix">

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="Shop">
                        <img src="img/banner/1.jpg" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>Visit our store</p>
                            <h4>Store</h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="Product?productCode=V_1005">
                        <img src="img/banner/2.jpg" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>Only 35฿</p>
                            <h4>Fresh Pumpkin</h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="About">
                        <img src="img/banner/3.jpg" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>about us</p>
                            <h4>Our farm</h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="Shop?catagories=Dairy Product">
                        <img src="img/banner/4.jpg" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>Start from 58฿</p>
                            <h4>Dairy</h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="Shop?catagories=meat">
                        <img src="img/banner/5.jpg" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>Start from 139฿</p>
                            <h4>Raw Meat</h4>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="Shop?catagories=fruit">
                        <img src="img/banner/6.jpg" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <p>Making dessert from our fruits</p>
                            <h4>Fruits</h4>
                        </div>
                    </a>
                </div>

            </div>
        </div>
        <!-- Product Catagories Area End -->

        <!--         Product Catagories Area Start 
                <div class="products-catagories-area clearfix">
                    <div class="amado-pro-catagory clearfix">
        
        <c:forEach items="${product}" var="p" varStatus="n">
            <div class="single-products-catagory clearfix">
                <a href="shop.html">
                    <a href="Product?productCode=${p.productcode}"><img src="img/${p.productcode}.png" alt=""></a>
                     Hover Content 
                    <div class="hover-content">
                        <div class="line"></div>
                        <p>From ${p.productprice} ฿</p>
                        <h4>${p.productname}</h4>
                    </div>
                </a>
            </div>
        </c:forEach>

    </div>
</div>-->
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
