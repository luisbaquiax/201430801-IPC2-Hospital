<%-- 
    Document   : perfilAdmin
    Created on : 22/06/2021, 02:12:26
    Author     : luis
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <!-- personalizados -->
        <link href="resours/css/navCarga.css" rel="stylesheet" type="text/css"/>
        <link href="../../resours/css/general.css" rel="stylesheet" type="text/css"/>
        <!-- iconos -->
        <script src="https://kit.fontawesome.com/6d0db64a1f.js" crossorigin="anonymous"></script>
        <title>Administración</title>
    </head>
    <body>
        <div class="box-menu">
            <header class="menu">
                <nav class="navbar navbar-expand navbar-dark bg-dark rounded">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample10" aria-controls="navbarsExample10" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <form method="GET">
                        <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample10">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link " href="miPerfil.jsp">Mi perfil</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="${pageContext.request.contextPath}/ControladorAministrador?tarea=mostrar">Solicitudes</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#lab">Registrar médico</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#pacientes">Registrar laboratorista</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#examen">Crear nuevo exámen</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#reporte">Cambiar costo de las consultas</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="${pageContext.request.contextPath}/salir"><i class="fas fa-sign-out-alt"></i> Salir</a>
                                </li>
                            </ul>
                        </div>
                    </form>
                </nav>
            </header>
        </div>
        <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

        <!-- Option 2: Separate Popper and Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

    </body>
</html>
