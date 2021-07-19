<%-- 
    Document   : listaMedicos
    Created on : 12/07/2021, 23:20:22
    Author     : luis
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- para dar formato el texto-->
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- SELECCIONAMOS LA LOCALIDAD -->
<fmt:setLocale value="es_GT"/>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <!-- iconos -->
        <script src="https://kit.fontawesome.com/6d0db64a1f.js" crossorigin="anonymous"></script>
        <link href="../../resours/css/general.css" rel="stylesheet" type="text/css"/>
        <title>LISTA DE MÉDICOS</title>
    </head>
    <body>
        <jsp:include page="../admin/menuAdmin.jsp"></jsp:include>
            <!--medicos-->
            <section id="medicos" class="section">
                <div class="container-fluid">
                    <div class="row"> 
                        <div class="col-md-12">
                            <div class="card mx-auto">
                                <div class="card-header">
                                    <h4 class="h4 text-center">Listado de Medicos</h4>
                                </div>
                                <div class="table-responsive">
                                    <table class="table table-striped thead-dark">
                                        <thead class="thead-dark">
                                            <tr>
                                                <th>No</th>
                                                <th>Codigo</th>
                                                <th>Nombre</th>
                                                <th>Numero de colegiado</th>
                                                <th>DPI</th>
                                                <th>Telefono</th>
                                                <th>Correo</th>
                                                <th>Horario de inicio</th>
                                                <th>Horario fin</th>
                                                <th>Fecha de inicio de trabajo</th>
                                                <th>Contraseña</th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <!-- Iteramos cada elemento de la lista de medicos -->
                                        <c:forEach var="medico" items="${medicos}" varStatus="status" >
                                            <tr>
                                                <td>${status.count}</td>
                                                <td>${medico.codigo}</td> 
                                                <td>${medico.nombre}</td>
                                                <td>${medico.colegiado}</td>
                                                <td>${medico.dpi}</td> 
                                                <td>${medico.telefono}</td>
                                                <td>${medico.email}</td>
                                                <td>${medico.horarioInicio}</td> 
                                                <td>${medico.horarioFin}</td>
                                                <td>${medico.fechaInicioTrabajo}</td>
                                                <td>${medico.contraseña}</td>
                                                <td><a href="${pageContext.request.contextPath}/controladorMedico?tarea=modificar&doctor=${medico.codigo}"
                                                       class="btn btn-secondary">
                                                        <i class="fas fa-angle-double-right pr-2"></i>Editar horarios
                                                    </a></td>
                                                <td><a href="${pageContext.request.contextPath}/controladorMedico?tarea=especialidad&doctor=${medico.codigo}"
                                                       class="btn btn-secondary">
                                                        <i class="fas fa-angle-double-right pr-2"></i>Ver especialidades
                                                    </a></td>
                                                <td><a href="${pageContext.request.contextPath}/controladorMedico?tarea=especialidad&doctor=${medico.codigo}"
                                                       class="btn btn-danger">
                                                        <i class="fas fa-trash-alt pr-2"></i>Eliminar medico
                                                    </a></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div> 
            </div>
        </section>
        <jsp:include page="../admin/nuevoExamen.jsp"></jsp:include>
        <jsp:include page="../medico/nuevoMedico.jsp"></jsp:include>
        <jsp:include page="../laboratorista/nuevoLaboratorista.jsp"></jsp:include>
        <!-- Optional JavaScript; choose one of the two! -->
        <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    </body>
</html>