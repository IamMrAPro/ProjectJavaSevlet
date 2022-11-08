<%-- 
    Document   : Post_news
    Created on : Oct 24, 2022, 10:18:25 AM
    Author     : anhha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Nikki - Blog &amp; Magazine Template</title>

        <!-- Favicon -->
        <link rel="icon" href="img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="Css/bootstrap.css" type="text/css"/>
        <link rel="stylesheet" href="Css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="style.css">

    </head>

    <body>
        <!-- ##### Header Area Start ##### -->
        
        <header class="header-area">
            <!-- Navbar Area -->
            <div class="nikki-main-menu">
                <div class="classy-nav-container breakpoint-off">
                    <div class="container-fluid">
                        <!-- Menu -->
                        <nav class="classy-navbar justify-content-between" id="nikkiNav">

                            <!-- Nav brand -->
                            <a href="Home.jsp" class="nav-brand"><img src="img/core-img/logo.png" alt=""></a>

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
                                        <li><a href="Home.jsp">Home</a></li>
                                        <li><a href="#">Pages</a>
                                            <ul class="dropdown">
                                                <li><a href="Home.jsp">Home</a></li>
                                                <li><a href="archive-blog.html">Archive Blog</a></li>
                                                <li><a href="single-post.html">Single Post</a></li>
                                                <li><a href="about-us.html">About</a></li>
                                                <li><a href="contact.jsp">Contact</a></li>
                                                <li><a href="typography.html">Typography</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Catagories</a>
                                            <div class="megamenu">
                                                <ul class="dropdown">
                                                    <li><a href="#"> Features</a></li>
                                                    <li><a href="#"> Food</a></li>
                                                    <li><a href="#"> Travel</a></li>
                                                    <li><a href="#"> Spost</a></li>
                                                    <li><a href="#"> LifeStyle</a></li>

                                                </ul>

                                            </div>
                                        </li>
                                        <li><a href="about-us.html">About</a></li>
                                        <li><a href="contact.jsp">Contact</a></li>
                                    </ul>

                                    <!-- Search Form -->
                                    <div class="search-form">
                                        <form action="#" method="get">
                                            <input type="search" name="search" class="form-control"
                                                   placeholder="Search and hit enter...">
                                            <button type="submit"><i class="fa fa-search"></i></button>
                                        </form>
                                    </div>

                                    <!-- Social Button -->
                                    <div class="top-social-info">

                                       
                                        <a class="btn  dropdown-toggle" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <svg xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                                            <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
                                            <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
                                            </svg></a>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                            
                                           
                                                <a class="dropdown-item" href="logout">Logout</a>
                                                <a class="dropdown-item" href="#">Favourite</a>
                                               
                                            


                                        </div>
                                    </div>

                                </div>
                                <!-- Nav End -->
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- ##### Header Area End ##### -->

        <!-- ##### Breadcrumb Area Start ##### -->
        <div class="breadcrumb-area">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="#"><i class="fa fa-home"></i> Home</a></li>
                                <li class="breadcrumb-item"><a href="#">Blog</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Create Post</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <!-- ##### Breadcrumb Area End ##### -->
        <section class="blog-content-area section-padding-0-100">
            <div class="container">
                <!--                <div class="row justify-content-center">-->

                <div class="contact-content ">
                    <h4>Write News</h4>

                    <!-- Contact Form Area -->
                    <div class="contact-form-area ">
                        <form action="upnews" method="get" style="width: 100%">
                           
                            <div class="form-group">
                                <!--                                   <input type="text" class="form-control" id="Categoria" name="Categoria" placeholder="Categoria">-->
                                <select  class="form-control" name="op">
                                    <option>Categoria</option>
                                    <option>Features</option>
                                    <option>Food</option>
                                    <option>Travel</option>
                                    <option>Spost</option>
                                    <option>LifeStyle</option>
                                </select>

                            </div>
                            <div class="form-group">
                                <textarea class="form-control" name="message" id="message" cols="2" rows="2" placeholder="Title"></textarea>
                            </div>
                             <div class="form-group">
                                <input type="text" class="form-control" id="time" name="sumary" placeholder="Sumary">
                            </div>
                            <div class="form-group">
                                <label class="form-label" for="customFile">Upload Image</label>
                                <input type="file" class="form-control" id="customFile" name="image" />
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" name="content" id="message" cols="30" rows="10" placeholder="Content"></textarea>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="author" name="author" placeholder="Author">
                            </div>

                            <button type="submit" class="btn nikki-btn mt-15">Submit</button>
                        </form>
                    </div>
                </div>

        </section>

    </div>

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer-area">
        <div class="container">


            <div class="row">
                <div class="col-12">
                    <div class="copywrite-text">
                        <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area Start ##### -->

    <!-- ##### All Javascript Script ##### -->
    <!-- JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

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