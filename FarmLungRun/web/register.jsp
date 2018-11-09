<%-- 
    Document   : register
    Created on : Nov 6, 2018, 4:38:36 PM
    Author     : SARUNSUMETPANICH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Register" method="post"> 
            username: <input type="text" name="username" required>
            password: <input type="text" name="password" required>
            fname: <input type="text" name="fname" required>
            lname: <input type="text" name="lname" required>
            address: <input type="text" name="address" required>
            province: <input type="text" name="province" required>
            countrycode: <input type="text" name="country" required>
            postalcode: <input type="text" name="postalcode" required>
            
            <input type="submit" value="submit">
        </form>
    </body>
</html>
