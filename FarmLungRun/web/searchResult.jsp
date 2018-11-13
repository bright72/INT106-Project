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
        <link rel="icon" href="img/core-img/favicon.ico">
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <jsp:include page="include/nav.jsp"/>
        <br>   
        <div style="margin-top: 5%; width: auto"><h1>${message}</h1>
            <br>
            <c:if test="${param.search=='true'}">

                <c:forEach items="${foundProduct}" var="fp" varStatus="fc">
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6 single-product-wrapper" style="width: auto">
                        <!-- Product Image -->
                        <div class="product-img"">
                            <img src="img/product-img/product5.jpg" alt="">
                            <!-- Hover Thumb -->
                            <img style="transform: scale(1.5)" class="hover-img" src="img/product-img/product5.jpg" alt="">
                        </div>

                        <!-- Product Description -->
                        <div style="width: auto" class="product-description d-flex align-items-center justify-content-between">
                            <!-- Product Meta Data -->
                            <div class="product-meta-data">
                                <a href="product-details.html">
                                    <div class="line"></div>
                                    <p style="margin: auto" class="product-price">${fp.productprice} ฿</p>
                                    <p style="margin: auto">${fp.producttype}</p>
                                    <h6 style="margin: auto">${fp.productname}</h6>
                                </a>
                            </div>           
                        </div>
                    </div>
                </c:forEach>
            </c:if>
        </div>
    </body>
</html>
