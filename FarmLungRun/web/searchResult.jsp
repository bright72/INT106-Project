<%-- 
    Document   : searchResult
    Created on : Nov 11, 2018, 1:36:37 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>

        <!-- Favicon  -->
        <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
        <link rel="icon" href="img/LOGO.PNG">
        <title>Farm LungRun | Search</title>
        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
    </head>
    <body>
        <div>
            <jsp:include page="include/nav.jsp"/>
            <br>   
            <div class="single-product-area clearfix">
                <div class="container-fluid">
                    <c:if test="${param.search!='true'}">
                        <div style="margin-top: 5%; width: auto"><h1 style="color: red">${message}</h1></div>
                        <br>
                    </c:if>
                    <div>
                        <c:if test="${param.search=='true'}">
                            <div style="margin: 3%"><h1>${message}</h1>
                                <hr>
                                <br>                        
                                <div class="row">
                                    <c:forEach items="${foundProduct}" var="fp" varStatus="fc">                           
                                        <!-- Single Product Area -->
                                        <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                                            <div class="single-product-wrapper">
                                                <!-- Product Image -->
                                                <div class="product-img">
                                                    <a href="Product?productCode=${fp.productcode}">
                                                        <img src="img/${fp.productcode}.png" alt="img/${fp.productcode}.png">
                                                        <!-- Hover Thumb -->
                                                        <img class="hover-img" src="img/${fp.productcode}.png" alt="img/${fp.productcode}.png">
                                                    </a>
                                                </div>
                                                <!-- Product Description -->
                                                <div class="product-description d-flex align-items-center justify-content-between">
                                                    <!-- Product Meta Data -->
                                                    <div class="product-meta-data">
                                                        <div class="line"></div>
                                                        <p class="product-price">${fp.productprice}</p>
                                                        <a href="product-details.html">
                                                            <h6>${fp.productname}</h6>
                                                        </a>
                                                    </div>
                                                    <!-- Ratings & Cart -->
                                                    
                                                        <div class="cart">
                                                            <a href="AddToCart?productCode=${fp.productcode}&&quantity=1&&page=shop" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                                        </div>
                                                    
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>                                
                                </div>
                            </div>
                        </div>
                    </c:if>
                </div>
            </div>
        </div>
        <jsp:include page="include/footer.jsp"/>
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
