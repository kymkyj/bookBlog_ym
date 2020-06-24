<%--
  Created by IntelliJ IDEA.
  User: kim-youngmin
  Date: 2020/06/22
  Time: 11:31 오후
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/test.css"/>
</head>
<body>
<form method="post" action="" class="login">
    <div class="layer">
        <div>
            <label for="login">Email:</label>
            <input type="text" name="login" id="login" value="">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" value="">
        </div>
        <div>
            <input type="button" class="login-button" value="Login">
        </div>
    <p class="forgot-password"><a href="">Forgot your password?</a></p>
    </div>
</form>


</body>
</html>
