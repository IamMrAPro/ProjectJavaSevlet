<%-- 
    Document   : contact
    Created on : Oct 24, 2022, 7:38:08 AM
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
                                            <ul class="single-mega cn-col-4">
                                                <li><a href="#"> Features</a></li>
                                                <li><a href="#"> Food</a></li>
                                                <li><a href="#"> Travel</a></li>
                                                <li><a href="#"> Recipe</a></li>
                                                <li><a href="#"> Bread</a></li>
                                                <li><a href="#"> Breakfast</a></li>
                                                <li><a href="#"> Meat</a></li>
                                            </ul>
                                          
                                        </div>
                                    </li>
                                    <li><a href="about-us.html">About</a></li>
                                    <li><a href="contact.jsp">Contact</a></li>
                                </ul>

                                <!-- Search Form -->
                                <div class="search-form">
                                    <form action="#" method="get">
                                        <input type="search" name="search" class="form-control" placeholder="Search and hit enter...">
                                        <button type="submit"><i class="fa fa-search"></i></button>
                                    </form>
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
                            <li class="breadcrumb-item active" aria-current="page">Contact</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Breadcrumb Area End ##### -->

    <!-- ##### Google Maps Start ##### -->
    <div class="map-area">
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.4855345740825!2d105.52487561476298!3d21.013249986006848!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2sFPT%20University!5e0!3m2!1sfr!2s!4v1666554793653!5m2!1sfr!2s" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>    </div>
    <!-- ##### Google Maps End ##### -->

    <!-- ##### Contact Area Start ##### -->
    <section class="contact-area section-padding-100-0">
        <div class="container">
            <div class="row">

                <div class="col-12 col-lg-6">
                    <div class="contact-content mb-100">
                        
                        <div class="single-contact-info">
                            <h6>Location:</h6>
                            <h4>FPT university</h4>
                        </div>

                        <!-- Single Contact Info -->
                        <div class="single-contact-info">
                            <h6>Email:</h6>
                            <h4>anhhqhe@fpt.edu.vn</h4>
               
                        </div>

                        <!-- Single Contact Info -->
                        <div class="single-contact-info">
                            <h6>Phone:</h6>
                            <h4>(+84)03466829</h4>
                        </div>
                    </div>
                </div>

                <div class="col-12 col-lg-6">
                    <div class="contact-content mb-100">
                        <h4>Contact Form</h4>

                        <!-- Contact Form Area -->
                        <div class="contact-form-area">
                            <form action="#" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="contact-name" placeholder="Name">
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control" id="contact-email" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" id="contact-phone" placeholder="Phone">
                                </div>
                                <div class="form-group">
                                    <textarea class="form-control" name="message" id="message" cols="30" rows="10" placeholder="Message"></textarea>
                                </div>
                                <button type="submit" class="btn nikki-btn mt-15">Submit</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!-- ##### Contact Area End ##### -->

    <!-- ##### Instagram Area Start ##### -->
    
    

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