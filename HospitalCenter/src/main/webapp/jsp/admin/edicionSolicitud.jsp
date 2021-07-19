<%-- 
    Document   : edicionSolicitud
    Created on : 29/06/2021, 00:00:35
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../admin/cabecera.jsp" ></jsp:include>
        <form action="${pageContext.request.contextPath}/ControladorPaciente?tarea=agregarPaciente&id=${solicitud.id}"
              method="POST" class="was-validated">
            <!-- Botones de navegación para agregar paciente-->
            <section id="actions" class="py-4 mb-4 bg-light">
                <div class="container">
                    <div class="row">
                        <div class="col-md-3">
                            <a href="administracion.jsp" class="btn btn-ligth btn-block">
                                <i class="fas fa-sign-out-alt"></i> Regresar
                            </a>
                        </div>
                        <div class="col-md-3">
                            <button type="submit" class="btn btn-success btn-block">
                                <i class="fas fa-check"></i> Guardar Paciente
                            </button>
                        </div>
                        <div class="col-md-3">
                            <a href="${pageContext.request.contextPath}/ControladorPaciente?tarea=eliminar&id=${solicitud.id}"
                               class="btn btn-danger btn-block">
                                <i class="fas fa-trash"></i> Eliminar Solicitud
                            </a>
                        </div>
                    </div>
                </div>
            </section>
            <!--navegacion-->
            <section id="details">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Solicitud/Paciente</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="codigo">Código</label>
                                        <input type="text" class="form-control" name="codigo" required placeholder="Debe ingresar el código del paciente">
                                    </div>
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" readonly value="${solicitud.nombre}">
                                    </div>
                                    <div class="form-group">
                                        <label for="sexo">Sexo</label>
                                        <input type="text" class="form-control" name="sexo" readonly value="${solicitud.sexo}">
                                    </div>
                                    <div class="form-group">
                                        <label for="fechaNacimiento">Fecha de nacimiento</label>
                                        <input type="text" class="form-control" name="birthday" readonly value="${solicitud.fechaNacimiento}">
                                    </div>
                                    <div class="form-group">
                                        <label for="dpi">DPI</label>
                                        <input type="number" class="form-control" name="dpi" readonly value="${solicitud.dpi}">
                                    </div>
                                    <div class="form-group">
                                        <label for="telefono">Teléfono</label>
                                        <input type="text" class="form-control" name="telefono" readonly value="${solicitud.telefono}">
                                    </div>
                                    <div class="form-group">
                                        <label for="peso">Peso (kg)</label>
                                        <input type="text" class="form-control" name="peso" readonly value="${solicitud.peso}">
                                    </div>
                                    <div class="form-group">
                                        <label for="tipoSangre">Tipo de sangre</label>
                                        <input type="text" class="form-control" name="tipoSangre" readonly value="${solicitud.tipoSangre}">
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="text" class="form-control" name="email" readonly value="${solicitud.email}">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </form>
        <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    </body>
</html>
