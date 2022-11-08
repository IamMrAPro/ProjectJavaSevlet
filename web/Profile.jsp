<%-- 
    Document   : Home
    Created on : Oct 25, 2022, 7:52:04 AM
    Author     : anhha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="stylesheet"
              href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.0/css/fontawesome.min.css" />
        <!-- Title -->
        <title>Nikki - Blog &amp; Magazine Template</title>

        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="style.css">
        <style>
            body{
                overflow-x: hidden;
            }
            .gradient-custom {
                /* fallback for old browsers */
                background: #f6d365;

                /* Chrome 10-25, Safari 5.1-6 */
                background: -webkit-linear-gradient(to right bottom, rgba(246, 211, 101, 1), rgba(253, 160, 133, 1));

                /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
                background: linear-gradient(to right bottom, rgba(246, 211, 101, 1), rgba(253, 160, 133, 1))
            }
        </style>

    </head>

    <body>

        <section>
            <!-- ##### Header Area Start ##### -->
            <header class="header-area">
                <!-- Navbar Area -->
                <div class="nikki-main-menu">
                    <div class="classy-nav-container breakpoint-off">
                        <div class="container-fluid">
                            <!-- Menu -->
                            <nav class="classy-navbar justify-content-between" id="nikkiNav">

                                <!-- Nav brand -->
                                <a href="home" class="nav-brand"><img src="img/core-img/logo.png" alt=""></a>

                                <!-- Navbar Toggler -->
                                <div class="classy-navbar-toggler">
                                    <span class="navbarToggler"><span></span><span></span><span></span></span>
                                </div>

                                <!-- Menu -->
                                <div class="classy-menu">

                                    <!-- close btn -->
                                    <div class="classycloseIcon">
                                        <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                                    </div>

                                    <!-- Nav Start -->
                                    <div class="classynav">
                                        <ul>
                                            <li><a href="home">Home</a></li>
                                            <li><a href="#">Pages</a>
                                                <ul class="dropdown">
                                                    <li><a href="home">Home</a></li>
                                                    <li><a href="archive-blog.html">Archive Blog</a></li>
                                                    <li><a href="single-post.html">Single Post</a></li>
                                                    <li><a href="about-us.html">About</a></li>
                                                    <li><a href="contact.jsp">Contact</a></li>
                                                    <li><a href="typography.html">Typography</a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#">Catagories</a>
                                                <div class="megamenu">
                                                    <ul class="dropdown" name="category">
                                                        <li><a href="category?id=1"> Features</a></li>
                                                        <li><a href="category?id=2"> Food</a></li>
                                                        <li><a href="category?id=3"> Travel</a></li>
                                                        <li><a href="category?id=4"> Spost</a></li>
                                                        <li><a href="category?id=5"> LifeStyle</a></li>
                                                    </ul>

                                                </div>
                                            </li>
                                            <li><a href="about-us.html">About</a></li>
                                            <li><a href="contact.jsp">Contact</a></li>
                                        </ul>

                                        <!-- Search Form -->
                                        <div class="search-form">
                                            <form action="search" method="get">
                                                <input type="search" name="search" class="form-control"
                                                       placeholder="Search and hit enter...">
                                                <button type="submit"><i class="fa fa-search"></i></button>
                                            </form>
                                        </div>

                                        <!-- Social Button -->
                                        <div class="top-social-info">

                                            <!--                                            <a href="Login.jsp">Login</a>-->
                                            <a class="btn  dropdown-toggle"  role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <svg xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                                                <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                                                <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
                                                </svg></a>
                                            <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                                <c:if test="${sessionScope.acc==null}">
                                                    <a class="dropdown-item" href="login">Login</a>
                                                </c:if>
                                                <c:if test="${sessionScope.acc==true}">
                                                    <a class="dropdown-item" href="logout">Logout</a>
                                                    <a class="dropdown-item" href="#">Favourite</a>
                                                    <a class="dropdown-item" href="upnews">Write News</a>

                                                </c:if>


                                            </div>

                                        </div>
                                        <div>

                                            <c:if test="${sessionScope.acc==true}">
                                                <p name="nameacc">${sessionScope.acco}</p>
                                            </c:if>
                                        </div>

                                    </div>
                                    <!-- Nav End -->
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </header>

            <section class="vh-100" style="background-color: #f4f5f7;">
                <c:if test="${sessionScope.update==null}">
                    <c:forEach items="${profle}" var="item">
                        
                            <div class="gradient-custom text-center text-white"
                                 style="border-top-left-radius: .5rem; border-bottom-left-radius: .5rem;">
                                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
                                     alt="Avatar" class="img-fluid my-5" style="width: 80px;" />
                                <h5>${item.getLastName()}${item.getMidleName()}${item.getFirstName()} </h5>
                                <p>UserName : ${item.getName()}</p>

                            </div>
                            <div class="col-md-8">
                                <div class="card-body p-4">
                                    <form method="get" action="upDelete">
                                    <h6>Information</h6>
                                    <hr>
                                    <div class="row pt-1">
                                        <div class="col-6 mb-3">
                                            <h6>Email</h6>
                                            <p class="text-muted">${item.getEmail()}</p>
                                        </div>
                                        <div class="col-6 mb-3">
                                            <h6>Phone</h6>
                                            <p class="text-muted">${item.getPhone()}</p>
                                        </div>
                                    </div>

                                    <div class="row pt-1">
                                        <div class="col-6 mb-3">
                                            <h6>Gender</h6>
                                            <p class="text-muted">${item.getGender()}</p>
                                        </div>
                                        <div class="col-6 mb-3">
                                            <h6>Time Start</h6>
                                            <p class="text-muted">${item.getTime()}</p>
                                        </div>
                                    </div>
                                    <c:if test="${sessionScope.ms1 != null}">
                                        <p class="alert alert-danger">${sessionScope.ms1}</p>
                                    </c:if>

                                    <div class="row pt-1">

                                        <div class="col-6 mb-3">
                                            <input name="up"type="submit" value="Update Password" >
                                        </div>
                                        <div class="col-6 mb-3 ">
                                            <input name="up" type="submit" value="Delete Account" >
                                        </div>
                                    </div>
                                    </form>
                                        
                                    <c:if test="${sessionScope.delete != null}">
                                        <form action="delete" method="get">
                                        <div class="row pt-1">
                                            <div class="col-6 mb-3">
                                                <h6> Enter Password</h6>
                                                <input type="text" name="deletePass" class="text-muted">

                                            </div>
                                            <div class="col-6 mb-3 ">
                                                <input name="dele" type="submit" value="Always Delete" >
                                            </div>

                                        </div>
                                        </form>
                                    </c:if>
                                   
                                </div>
                            </div>
                            </div>
                        
                    </c:forEach>
                </c:if>
                <c:if test="${sessionScope.update!=null}">

                    <c:forEach items="${profle}" var="item">
                        <form method="get" action="updone">
                            <div class="gradient-custom text-center text-white"
                                 style="border-top-left-radius: .5rem; border-bottom-left-radius: .5rem;">
                                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
                                     alt="Avatar" class="img-fluid my-5" style="width: 80px;" />
                                <h5>${item.getLastName()}${item.getMidleName()}${item.getFirstName()} </h5>
                                <p>UserName : ${item.getName()}</p>

                            </div>
                            <div class="col-md-8">
                                <div class="card-body p-4">
                                    <h6>Information</h6>
                                    <hr>
                                    <div class="row pt-1">
                                        <div class="col-6 mb-3">
                                            <h6>Email</h6>
                                            <p class="text-muted">${item.getEmail()}</p>
                                        </div>
                                        <div class="col-6 mb-3">
                                            <h6>Phone</h6>

                                            <p class="text-muted">${item.getPhone()}</p>
                                        </div>
                                    </div>

                                    <div class="row pt-1">
                                        <div class="col-6 mb-3">
                                            <h6>Gender</h6>
                                            <p class="text-muted">${item.getGender()}</p>
                                        </div>
                                        <div class="col-6 mb-3">
                                            <h6>Time Start</h6>
                                            <p class="text-muted">${item.getTime()}</p>
                                        </div>
                                    </div>
                                    <div class="row pt-1">
                                        <div class="col-6 mb-3">
                                            <h6> Old Password</h6>
                                            <input type="text" name="oldpass" class="text-muted">

                                        </div>

                                    </div>   
                                    <div class="row pt-1">
                                        <div class="col-6 mb-3">
                                            <h6> New Password</h6>
                                            <input type="text" name="newpass" class="text-muted">

                                        </div>

                                    </div>
                                    <div class="row pt-1">

                                        <div class="col-6 mb-3">
                                            <h6>Confirm Password </h6>
                                            <input type="text" name="cfpass"  class="text-muted">
                                        </div>
                                    </div>


                                    <div class="row pt-1">

                                        <div class="col-6 mb-3">
                                            <input name="up"type="submit" value="Save" >
                                        </div>

                                    </div>

                                </div>
                            </div>
                            </div>
                        </form>
                    </c:forEach>
                </c:if>

            </section>

            <footer class="footer-area">


                <div class="row">
                    <div class="col-12">
                        <div class="copywrite-text">
                            <p>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;
                                <script>document.write(new Date().getFullYear());</script> All rights reserved | This template
                                is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com"
                                                                                                    target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            </p>
                        </div>
                    </div>
                </div>

            </footer>
            <!-- ##### Footer Area Start ##### -->

            <!-- ##### All Javascript Script ##### -->
            <!-- jQuery-2.2.4 js -->
            <script src="js/jquery/jquery-2.2.4.min.js"></script>
            <!-- Popper js -->
            <script src="js/bootstrap/popper.min.js"></script>
            <!-- Bootstrap js -->
            <script src="js/bootstrap/bootstrap.min.js"></script>
            <!-- All Plugins js -->
            <script src="js/plugins/plugins.js"></script>
            <!-- Active js -->
            <script src="js/active.js"></script>
    </body>

</html>