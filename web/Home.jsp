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
                                                    <li><a href="News.jsp">About</a></li>
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
                                                    <a class="dropdown-item" href="Login.jsp">Login</a>
                                                </c:if>
                                                <c:if test="${sessionScope.acc==true}">
                                                    <a class="dropdown-item" href="logout">Logout</a>
                                                    <a class="dropdown-item" href="UpdateNews.jsp">Update news</a>
                                                    <a class="dropdown-item" href="Post_news.jsp">Write News</a>
                                                    <a class="dropdown-item" href="profile">Profile</a>

                                                </c:if>


                                            </div>

                                        </div>
                                        <div>

                                            <c:if test="${sessionScope.acc==true}">
                                                <p>${sessionScope.acco}</p>
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

            <div class="hero-post-slides owl-carousel">

                <!-- Single Hero Post -->
                <c:forEach items="${list}" var="item">
                    <div class="single-hero-post d-flex flex-wrap">
                        <!-- Post Thumbnail -->
                        <div class="slide-post-thumbnail h-100 bg-img" style="background-image: url(img/blog-img/${item.getUrlImage()});"></div>
                        <!-- Post Content -->
                        <div class="slide-post-content h-100 d-flex align-items-center">
                            <div class="slide-post-text">
                                <p class="post-date" data-animation="fadeIn" data-delay="100ms">${item.getDate()} / ${item.getCategoria()}</p>
                                <a href="show?title=${item.getTitle()}" class="post-title" data-animation="fadeIn" data-delay="300ms">
                                    <h2>${item.getTitle()}</h2>
                                      <input type="hidden" name="idnew"value="${item.getNewid()}">
                                      
                                </a>
                                <p class="post-excerpt" data-animation="fadeIn" data-delay="500ms">${item.getSumary()}</p>
                                <a href="show?title=${item.getTitle()}" class="btn nikki-btn" data-animation="fadeIn" data-delay="700ms">Read More</a>
                            </div>
                            <!-- Page Count -->
                            <div class="page-count"></div>
                        </div>
                    </div>
                </c:forEach>

        </section>

        <!-- ##### Hero Area End ##### -->

        <!-- ##### Blog Content Area Start ##### -->
        <section class="blog-content-area section-padding-100">
            <div class="container">

                <div class="row justify-content-center">
                    <!-- Blog Posts Area -->
                    <div class="col-12">
                        <div class="blog-posts-area">
                            <div class="row">
                                <c:forEach items="${list}" var="item">
                                <!-- Single Blog Post -->
                                <div class="col-12 col-md-4">
                                    <div class="single-blog-post mb-50">
                                        <!-- Thumbnail -->
                                        <div class="post-thumbnail">
                                            <a href="#"><img src="img/blog-img/${item.getUrlImage()}" alt="" width="280px" height="140px"></a>
                                        </div>
                                        <!-- Content -->
                                        <div class="post-content">
                                            <p class="post-date">${item.getDate()}/ ${item.getCategoria()}</p>
                                            <a href="show?title=${item.getTitle()}" class="post-title">
                                                <h4>${item.getTitle()}</h4>
                                                <input type="hidden" name="idnew"value="${item.getNewid()}">
                                            </a>
                                           
                                        </div>
                                    </div>
                                </div>
                                        </c:forEach>
<!--                                
                <br>
                <br>
                <br>
                <!-- Blog Sidebar Area -->
                <c:if test="${sessionScope.button==null}">
                    <div class="col-md-12">
                        <div class="post-sidebar-area">

                            <!-- ##### Single Widget Area ##### -->
                            <div class="single-widget-area mb-30">
                                <!-- Title -->
                                <div class="widget-title">
                                    <h6>feedback</h6>
                                </div>

                                <div class="newsletter-content">
                                    <p>You can send feedback for us , so help us impl</p>
                                    <form action="feedback" method="post">
                                        <input type="email" name="email" class="form-control" placeholder="Your email">

                                        <br>
                                        <input type="text" name="feedback" class="form-control" placeholder="Your comment">
                                        <br>
                                        <button  name = "button"><i  class="fa fa-send"></i></button>
                                    </form>
                                </div>
                            </div>

                        </div>
                    </div>
                </c:if>
            </div>
        </section>

        <!-- ##### Blog Content Area End ##### -->



        <!-- ##### Footer Area Start ##### -->
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