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
    </head>
    <body>
        <jsp:include page="include/nav.jsp"/>
        <br>
        <h1>Hey ${message}</h1>
        <br>
        <c:if test="${param.search=='true'}">
            <table>
                <thead>
                    <tr>
                        <td>#</td>
                        <td>ProductCode</td>
                        <td>ProductName</td>
                        <td>ProductPrice</td>
                        <td>ProductType</td>
                    </tr>
                </thead>
                <c:forEach items="${foundProduct}" var="fp" varStatus="fc">
                    <tr> 
                        <td>${fc.count}</td>
                        <td>${fp.productcode}</td>
                        <td>${fp.productname}</td>
                        <td>${fp.productprice}</td>
                        <td>${fp.producttype}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
