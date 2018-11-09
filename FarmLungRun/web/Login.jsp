<%-- 
    Document   : Login
    Created on : Nov 9, 2018, 5:56:13 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="Login" method="post">
            username : <input type="text" name="username" required>
            password : <input type="text" name="password" required>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
