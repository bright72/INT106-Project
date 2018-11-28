<%-- 
    Document   : about
    Created on : Nov 2, 2018, 11:05:38 AM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Farm LungRun | About</title></title>
    <!-- Favicon  -->
    <!-- <link rel="icon" href="img/core-img/favicon.ico"> -->
    <link rel="icon" href="img/LOGO.PNG">
    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">   
</head>

<body>
    <div>
        <jsp:include page="include/nav.jsp?page=About"/>        
        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">             
                    <div class="checkout_details_area mt-50 clearfix">
                        <div class="cart-title">
                            <h2>About Page</h2>
                        </div>
                        <div>
                            <h5>Our story</h5>
                            <p>We founded in 2018</p>
                            <p>FarmLungRun made by Run Earn Bright</p>
                            <br>
                            <h5>Location</h5>                           
                            <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d969.2712508088918!2d100.493081!3d13.652593!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x2fd829cd26be9e23!2sSchool+of+Information+Technology%2C+KMUTT!5e0!3m2!1sen!2sus!4v1543401179656" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>                            
                        </div>
                    </div>                        
                </div>                
            </div>
        </div>
    </div> 
</div>
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
<jsp:include page="include/footer.jsp?page=About"/>
</body>
</html>
