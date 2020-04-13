<%-- 
    Document   : alltrainers
    Created on : Feb 22, 2020, 3:25:54 PM
    Author     : Natasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>View Trainers-Trainer Management</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
        <link rel="stylesheet"
              href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/css/bootstrap-select.min.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.9/dist/js/bootstrap-select.min.js"></script>
        <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>


        <!-- external css -->
        <link href="main.css" rel="stylesheet" type="text/css">

    </head>


    <body>
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
                    <li class="nav-item ">
                        <a class="nav-link" href="/">Home</a>
                    </li>


                    <li class="nav-item dropdown active">
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

        <!-- Transition page loader - dots -->
        <div id="pageloader">

            <div class="spinner">
                <div class="bounce1"></div>
                <div class="bounce2"></div>
                <div class="bounce3"></div>
            </div>

        </div>


        <!--        Table of trainers-->
        <div style="padding-top: 200px; padding-left: 20px; padding-right: 20px; padding-bottom: 20px; text-align: center;" class="example">
            <p><b>Trainers List</b></p>
            <table class="table">
                <thead>
                    <tr class="table-danger">
                        <th scope="col">ID</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">Subject</th>


                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${olatrainers}" var="tr">
                        <tr class="table-info">
                            <td>${tr.trainerId}</td>
                            <td>${tr.trainerName}</td>
                            <td>${tr.trainerLastname}</td>
                            <td>${tr.trainerSubject}</td>





                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <!-- Documentation for loading transition dots - External .js -->
        <script src="loader.js"></script>
    </body>
</html>
