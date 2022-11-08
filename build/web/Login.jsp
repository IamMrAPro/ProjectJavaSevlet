<%-- 
    Document   : Login
    Created on : Oct 23, 2022, 8:22:02 PM
    Author     : anhha
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/login.css">
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
    <script src="js/fontAwesome.js"></script>

    <!-- Bootstrap 5 -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <%
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("username")) {
                    request.setAttribute("u_name", cooky.getValue());
                }
                if (cooky.getName().equals("password")) {
                    request.setAttribute("u_pass", cooky.getValue());
                }
                if (cooky.getName().equals("remember")) {
                    request.setAttribute("r_pass", cooky.getValue());
                }
            }
        }
    %>

</head>
<body>
    <div class="Popup" id="myModal">
        <div class="Popup-body">
            <div class="Pop-title">
                <h2>Login</h2>
            </div>
            <form action="login" method="post">
                <div class="Set-pop">
                    <c:if test="${ms1 ne null}">
                        <p class="alert alert-danger">${ms1}</p>
                    </c:if>
                    <div class="options">
                        <input id="user-name" type="text" name="username" placeholder="Email or User Name" value="${u_name}" required>
                    </div>
                    <div class="options">
                        <input id="user-pass" type="password" name="password" placeholder="Password" value="${u_pass}" required>
                        <i class="fa-regular fa-eye-slash showPass"></i>
                    </div>
                    <div class="save-pass">
                        <label class="save-pass-container">Remember password
                            <input type="checkbox" name="remember" <c:if test="${r_pass eq 'on'}">checked</c:if>>
                            <span class="checkmark"></span>
                        </label>
                    </div>
                    <div class="options">
                        <button class="opt-btn" type="submit" name="created">Go</button>
                    </div>
                    <div class="options-divider"></div>
                    <div class="options">
                        <div class="auth-actions">
                            <a href="SignUp.jsp">Register a new account</a>
                            <a href="forgot">Forgot password?</a>
                        </div>    
                    </div>
                </div>
            </form>
        </div>
    </div>

   
</body>
</html>