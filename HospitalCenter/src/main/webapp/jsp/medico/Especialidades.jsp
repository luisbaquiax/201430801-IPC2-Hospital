<%-- 
    Document   : Especialidades
    Created on : 14/07/2021, 01:21:00
    Author     : luis
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <!-- personalizados -->
        <link href="resours/css/navCarga.css" rel="stylesheet" type="text/css"/>
        <link href="../../resours/css/general.css" rel="stylesheet" type="text/css"/>
        <link href="../../resours/css/card.css" rel="stylesheet" type="text/css"/>
        <link href="../../resours/css/radios.css" rel="stylesheet" type="text/css"/>
        <!-- iconos -->
        <script src="https://kit.fontawesome.com/6d0db64a1f.js" crossorigin="anonymous"></script>
        <title>Especialidades</title>
    </head>
    <body>
        <jsp:include page="../admin/menuAdmin.jsp"></jsp:include>
            <div class="container col-sm-3">
                <div class="row">
                    <div class="card">
                        <div class="card-header">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#agregarEspecialidadModal"><i class="fas fa-plus-circle pr-3"></i>Agregar especialidad</a>
                            <h4 class="h4">Especialidades de: ${medico.nombre}</h4>
                    </div>
                    <div class="table-responsive">
                        <table class="table table-striped thead-dark">
                            <thead class="thead-dark">
                                <tr>
                                    <th>No</th>
                                    <th>Especialidad</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="titulo" items="${titulos}" varStatus="status" >
                                    <tr>
                                        <td>${status.count}</td>
                                        <td>${titulo.nombreEspecialidad}</td>
                                        <td><a href="${pageContext.request.contextPath}/controladorTitulo?tarea=modificarEspecialidad&titulo=${titulo.id}"
                                               class="btn btn-secondary">
                                                <i class="fas fa-angle-double-right"></i> Editar Especialidad
                                            </a></td>

                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../medico/NuevaEspecialidad.jsp" ></jsp:include>
        <!-- Optional JavaScript; choose one of the two!
        <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    </body>
</html>
