<%-- 
    Document   : Test
    Created on : Nov 16, 2018, 11:48:41 AM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="UpdateCart" method="get">
            <div class="quantity">

                <!--                                                    <span class="qty-minus" onclick="var effect = document.getElementById('qty');
                                                                            var qty = effect.value;
                                                                            if (!isNaN(qty))
                                                                                effect.value--;
                                                                            return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>-->
                <input type="number" class="qty-text" id="qty" step="1" min="1" max="100" name="quantity" value="${p.quantity}" disable>
                <input hidden value="${p.product.productcode}" name="productcode">
                <!--<span class="qty-plus" onclick="var effect = document.getElementById('qty');
                        var qty = effect.value;
                        if (!isNaN(qty))
                            effect.value++;
                        return false;"><i class="fa fa-plus" aria-hidden="true"></i></span> -->

            </div>
            <br>
            <input type="submit" value="update" id="submit">
        </form>
    </body>
</html>
