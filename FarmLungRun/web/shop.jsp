<%-- 
    Document   : shop
    Created on : Nov 11, 2018, 2:26:18 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en th">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <!-- Title  -->
        <title>Farm LungRun | Shop</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/LOGO.PNG">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="css/style.css">

    </head>

    <body>
        <jsp:include page="include/nav.jsp?page=Shop"/>

        <div class="shop_sidebar_area">
            <!-- ##### Single Widget ##### -->
            <div class="widget catagory mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Catagories</h6>
                <!--  Catagories  -->
                <div class="catagories-menu">
                    <ul>
                        <form action="Shop">
                            <li class="${param.catagories == null ? "active" : ""}"><a href="Shop">All</a></li>
                            <li class="${param.catagories == "vegetables" ? "active" : ""}"><a href="Shop?catagories=vegetables">Vegetables</a></li>
                            <li class="${param.catagories == "fruit" ? "active" : ""}"><a href="Shop?catagories=fruit">Fruits</a></li>
                            <li class="${param.catagories == "meat" ? "active" : ""}"><a href="Shop?catagories=meat">Meat</a></li>
                            <li class="${param.catagories == "dairy" ? "active" : ""}"><a href="Shop?catagories=dairy">Dairy</a></li>
                            <li class="${param.catagories == "eggs" ? "active" : ""}"><a href="Shop?catagories=eggs">Eggs</a></li>
                            <li class="${param.catagories == "mushrooms" ? "active" : ""}"><a href="Shop?catagories=mushrooms">Mushrooms</a></li>
                        </form>
                    </ul>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget price mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Price Range</h6>

                <div class="widget-desc">
                    <form action="Shop">
                        <select name="range">
                            <option value="0" >All Price</option>
                            <option value="1" ${param.range == "1" ? "selected" : ""} >1-50฿</option>
                            <option value="2" ${param.range == "2" ? "selected" : ""}>51-100฿</option>
                            <option value="3" ${param.range == "3" ? "selected" : ""}>101-200฿</option>
                            <option value="4" ${param.range == "4" ? "selected" : ""}>More than 200฿</option>
                        </select>
                        <br><br><br>
                        <input class="btn btn-warning" style="color: white; height: 42px; width: 80px;" type="submit" value="Search">
                    </form>
                </div>
            </div>
        </div>

        <div class="amado_product_area section-padding-100" style="padding:1%">
            <div class="container-fluid" style="width: 109%">
                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">
                            <!-- Total Products -->
                            <div class="total-products">
                                <h3>Product</h3> 
                            </div>

                        </div>
                    </div>
                </div>

                <div class="row">
                    <c:forEach  items="${product}" var="p" varStatus="n">

                        <!-- Single Product Area -->

                        <div class="col-12 col-sm-6 col-md-12 col-xl-6" style="margin: auto">
                            <div class="single-product-wrapper">
                                <!-- Product Image -->
                                <div class="product-img">
                                    <a href="Product?productCode=${p.productcode}">
                                    <img src="img/${p.productcode}.png" alt="">
                                    <!-- Hover Thumb -->
                                    <img class="hover-img" style="transform: scale(1.0)" src="img/${p.productcode}.png" alt="">
                                    </a>
                                </div>

                                <!-- Product Description -->
                                <div class="product-description d-flex align-items-center justify-content-between">
                                    <!-- Product Meta Data -->
                                    <div class="product-meta-data">
                                        <div class="line"></div>
                                        <p class="product-price">${p.productprice} ฿</p>
                                        <a href="product-details.html">
                                            <h6>${p.productname}</h6>
                                        </a>
                                    </div>
                                    <!-- Ratings & Cart -->
                                    <div class="ratings-cart text-right">                   
                                        <div class="cart">
                                            <a href="AddToCart?productCode=${p.productcode}" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>                
                <div class="row">
                    <div class="col-12">
                        <!-- Pagination -->
                        <nav aria-label="navigation">
                            <ul class="pagination justify-content-end mt-50">
                                <li class="page-item active"><a class="page-link" href="#">01</a></li>
                                <li class="page-item"><a class="page-link" href="#">02</a></li>
                                <li class="page-item"><a class="page-link" href="#">03</a></li>
                                <li class="page-item"><a class="page-link" href="#">04</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>   
        </div>
    </div>

    <!-- ##### Main Content Wrapper End ##### -->

    <jsp:include page="include/footer.jsp?page=Shop"/>

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
