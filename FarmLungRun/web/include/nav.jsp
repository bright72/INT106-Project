<%-- 
    Document   : nav
    Created on : Nov 9, 2018, 11:17:05 PM
    Author     : SARUNSUMETPANICH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="Search" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword..." pattern="[A-Za-z0-9-_]{1,}">
                            <button type="submit"><img src="img/core-img/search.png" alt=""></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search Wrapper Area End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav (max width 767px)-->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="amado-navbar-brand">
                <a href="Home.jsp"><img src="img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>
        <!-- Header Area Start -->
        <header class="header-area clearfix" >
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div style="padding: 5%">
                <a href="Home"><img src="img/LOGO.PNG" alt="img/LOGO.PNG"></a>
                <a href="Home" style="text-underline-position: unset"><h1>Farm LungRun</h1></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav" style="width: 5%">
                <c:if test="${sessionScope.account == null}">
                    <div class="amado-btn-group ">
                        <a href="Login" class="btn amado-btn navbar-collapse d-lg-block" id="basket-overview" >Login</a> <br>

                        <a href="Register" class="btn amado-btn navbar-collapse d-lg-block" id="basket-overview" >Register</a>
                        <hr>
                    </div>
                </c:if> 
                <c:if test="${sessionScope.account != null}">
                    <a href="AccountDetail"> <div style="text-align: center" class="hover active amado-btn navbar-collapse d-lg-block " id="basket-overview" >Hello ${sessionScope.account.fname}</div></a><br>

                    <div class="amado-btn-group ">
                        <a href="Logout" class="btn amado-btn navbar-collapse d-lg-block" id="basket-overview">Logout</a><br>
                    </div><br>
                </c:if> 
                <ul>
                    <c:if test="${param.page == 'Home'}">
                        <li class="active">
                        </c:if>
                        <c:if test="${param.page != 'Home'}">
                        <li>
                        </c:if>
                        <a href="Home">Home</a></li>

                    <c:if test="${param.page == 'Shop'}">
                        <li class="active">
                        </c:if>
                        <c:if test="${param.page != 'Shop'}">
                        <li>
                        </c:if>
                        <a href="Shop">Shop</a></li>

                    <c:if test="${param.page == 'History'}">
                        <li class="active">
                        </c:if>
                        <c:if test="${param.page != 'History'}">
                        <li>
                        </c:if>
                        <a href="History">History</a></li>

                    <c:if test="${param.page == 'About'}">
                        <li class="active">
                        </c:if>
                        <c:if test="${param.page != 'About'}">
                        <li>
                        </c:if>
                        <a href="About">About</a></li>

                </ul>
            </nav>
            <!-- Button Group -->
            <hr><br>
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <c:if test="${cart != null}">
                    <a href="Cart" class="cart-nav"><img src="img/core-img/cart.png" alt=""> Cart <span>(${cart.totalQuantity})</span></a>
                    </c:if>
                    <c:if test="${cart == null}">
                    <a href="Cart" class="cart-nav"><img src="img/core-img/cart.png" alt=""> Cart <span>(0)</span></a>
                    </c:if>
                <a href="#" class="search-nav"><img src="img/core-img/search.png" alt=""> Search</a>
            </div>
        </header>
</html>
