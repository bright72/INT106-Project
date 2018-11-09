<%-- 
    Document   : Home
    Created on : Nov 2, 2018, 11:04:23 AM
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
                            <img src="img/bg-img/1.jpg" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From $180</p>
                                <h4>Modern Chair</h4>
                            </div>
                        </a>
                    </div>

                    <!-- Single Catagory -->
                    <div class="single-products-catagory clearfix">
                        <a href="shop.html">
                            <img src="img/bg-img/2.jpg" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From $180</p>
                                <h4>Minimalistic Plant Pot</h4>
                            </div>
                        </a>
                    </div>

                    <!-- Single Catagory -->
                    <div class="single-products-catagory clearfix">
                        <a href="shop.html">
                            <img src="img/bg-img/3.jpg" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From $180</p>
                                <h4>Modern Chair</h4>
                            </div>
                        </a>
                    </div>

                    <!-- Single Catagory -->
                    <div class="single-products-catagory clearfix">
                        <a href="shop.html">
                            <img src="img/bg-img/4.jpg" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From $180</p>
                                <h4>Night Stand</h4>
                            </div>
                        </a>
                    </div>

                    <!-- Single Catagory -->
                    <div class="single-products-catagory clearfix">
                        <a href="shop.html">
                            <img src="img/bg-img/5.jpg" alt="">
                            <!-- Hover Content -->
                            <div class="hover-content">
                                <div class="line"></div>
                                <p>From $18</p>
                                <h4>Plant Pot</h4>
                            </div>
                        </a>
                    </div>

                    <c:forEach items="${product}" var="p" varStatus="n">
                        <div class="single-products-catagory clearfix">
                            <a href="shop.html">
                                <img src="img/bg-img/9.jp g" alt="">
                                <!-- Hover Content -->
                                <div class="hover-content">
                                    <div class="line"></div>
                                    <p>From ${price}</p>
                                    <h4>${productname}</h4>
                                </div>
                            </a>
                        </div>
                    </c:forEach>

                </div>
            </div>
            <!-- Product Catagories Area End -->
        </div>
        <!-- ##### Main Content Wrapper End ##### -->

        <!-- ##### Footer Area Start ##### -->
        <footer class="footer_area clearfix">
            <div class="container">
                <div class="row align-items-center">
                    <!-- Single Widget Area -->
                    <div class="col-12 col-lg-4">
                        <div class="single_widget_area">
                            <!-- Logo -->
                            <div class ="footer-logo mr-50">
                                <!-- <a href="index.html"><img src="img/core-img/logo2.png" alt=""></a> -->
                                <h1 style="color: white">Farm LungRun</h1>
                            </div>
                            <!-- Copywrite Text -->
                            <p class="copywrite"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | FarmLungRun by <a href="https://colorlib.com" target="_blank">INT303 FarmLungRun Group</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                        </div>
                    </div>
                    <!-- Single Widget Area -->
                    <div class="col-12 col-lg-8">
                        <div class="single_widget_area">
                            <!-- Footer Menu -->
                            <div class="footer_menu">
                                <nav class="navbar navbar-expand-lg justify-content-end">
                                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                    <div class="collapse navbar-collapse" id="footerNavContent">
                                        <ul class="navbar-nav ml-auto">
                                            <li class="nav-item active">
                                                <a class="nav-link" href="index.html">Home</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="shop.html">Shop</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="cart.html">Cart</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="checkout.html">Checkout</a>
                                            </li>
                                        </ul>
                                    </div>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- ##### Footer Area End ##### -->

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
