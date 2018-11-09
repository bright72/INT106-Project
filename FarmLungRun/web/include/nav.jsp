<%-- 
    Document   : nav
    Created on : Nov 9, 2018, 11:17:05 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <!-- Search Wrapper Area Start -->
    <div id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true" class="modal fade">
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Customer login</h5>
                    <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
                </div>
                <div class="modal-body">
                    <form action="Login" method="post">
                        <div class="form-group">
                            <input id="email-modal" type="text" name="username" placeholder="username" class="form-control">
                        </div>
                        <div class="form-group">
                            <input id="password-modal" type="password" name="password" placeholder="password" class="form-control">
                        </div>
                        <p class="text-center">
                            <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                        </p>
                    </form>
                    <p class="text-center text-muted">Not registered yet?</p>
                    <div class="text-center">
                        <button type="submit" id="basket-overview" data-toggle="modal" class="btn btn-primary" data-target="#register-modal"><i class="fa fa-user-md"></i> Register</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="register-modal" tabindex="-1" role="dialog" aria-labelledby="Register" aria-hidden="true" class="modal fade">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Customer Register</h5>
                    <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
                </div>
                <div class="modal-body">
                    <h1>New account</h1>
                    <p class="lead">Not our registered customer yet?</p>
                    <p class="text-muted">If you have any questions, please feel free to <a href="contact.html">contact us</a>, our customer service center is working for you 24/7.</p>
                    <hr>
                    <form action="Register" method="post">
                        <div class="form-group">                                  
                            <label for="name">Username</label>
                            <input name="username" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input name="password" type="password" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="fname">First Name</label>
                            <input name="fname" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="lname">Last Name</label>
                            <input name="lname" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="address">Address</label>
                            <input name="address" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="province">Province</label>
                            <input name="province" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="country">Country</label>
                            <input name="country" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="postalcode">Postal Code</label>
                            <input name="postalcode" type="text" class="form-control" required>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary"><i class="fa fa-user-md"></i> Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
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
                <a href="index.html"><img src="img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>


        <!-- Header Area Start -->
        <header class="header-area clearfix">
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div class="logo">
                <!-- <a href="index.html"><img src="img/core-img/logo.png" alt=""></a> -->
                <a href="index.html" style="text-underline-position: unset"><h1>Farm LungRun</h1></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                    <li class="active"><a href="index.html">Home</a></li>
                    <li><a href="shop.html">Shop</a></li>
                    <li><a href="cart.html">Cart</a></li>
                    <li><a href="checkout.html">Checkout</a></li>
                </ul>
            </nav>
            <!-- Button Group -->
<<<<<<< HEAD
            <c:if test="${sessionScope.account == null}">
                <div class="amado-btn-group mt-30 mb-100">
                    <a href="#" class="btn amado-btn mb-15 navbar-collapse collapse d-none d-lg-block " id="basket-overview" data-toggle="modal" data-target="#login-modal">Login</a>

                    <a href="#" class="btn amado-btn mb-15 navbar-collapse collapse d-none d-lg-block " id="basket-overview" data-toggle="modal" data-target="#register-modal">Register</a>
                </div>
            </c:if> 

            <c:if test="${sessionScope.account != null}">
                <hr><br>
                <div>Hello ${sessionScope.account.username}</div>
                <div class="amado-btn-group mt-30 mb-100">
                    <a href="Logout" class="btn amado-btn mb-15 navbar-collapse collapse d-none d-lg-block " id="basket-overview">Logout</a>
                </div>
            </c:if> 

=======
            <div class="amado-btn-group mt-30 mb-100">
                <a href="#" class="btn amado-btn mb-15 navbar-collapse collapse d-none d-lg-block " id="basket-overview" data-toggle="modal" data-target="#login-modal">Login</a>
                <a href="#" class="btn amado-btn mb-15 navbar-collapse collapse d-none d-lg-block " id="basket-overview" data-toggle="modal" data-target="#register-modal">Register</a>
            </div>
>>>>>>> 63d220598643656e7e1d00b52713ad2f015b9e13
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="cart.html" class="cart-nav"><img src="img/core-img/cart.png" alt=""> Cart <span>(0)</span></a>
                <a href="#" class="search-nav"><img src="img/core-img/search.png" alt=""> Search</a>
            </div>
        </header>
        <!-- Header Area End -->
</html>
