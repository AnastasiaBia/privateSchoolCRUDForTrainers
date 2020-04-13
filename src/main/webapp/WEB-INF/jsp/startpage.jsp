<%-- 
    Document   : startpage
    Created on : Feb 22, 2020, 3:17:00 PM
    Author     : Natasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <title>Home page-Trainer Management-</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js"></script>

        <!-- external css -->
        <link href="main.css" rel="stylesheet" type="text/css">

    </head>


    <body>

        <!-- Transition page loader - dots -->
        <div id="pageloader">

            <div class="spinner">
                <div class="bounce1"></div>
                <div class="bounce2"></div>
                <div class="bounce3"></div>
            </div>

        </div>


        <!-- Navbar fixed on top and collapsible when in small screen-->
        <nav class="navbar navbar-expand-md navbar-dark navbar-custom  fixed-top collapsibe">
            <a class="navbar-brand" href="#">
                <img src="AFDEmp.png" alt="Logo" style="width:80px;height:auto; height: auto;">
            </a>


            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>


            <div class="collapse navbar-collapse" id="collapsibleNavbar" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            Trainers
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="getalltrainers">View Trainers List</a>
                            <a class="dropdown-item" href="preinserttrainer">Add a new Trainer</a>
                            <a class="dropdown-item" href="updatetrainers">Update Trainers</a>
                            <a class="dropdown-item" href="deletetrainers">Delete Trainers</a>

                        </div>
                    </li>



                </ul>

            </div>


        </nav>

        <!-- Text Effect -->
        <div class='console-container'><span id='text'></span>
            <div class='console-underscore' id='console'>&#95;</div>
        </div>







        <!-- external js for text effect and loading transition dots-->
        <script src="main.js"></script>
        <script src="loader.js"></script>



    </body>

</html>