<%-- 
    Document   : perfilMedico
    Created on : 22/06/2021, 02:12:39
    Author     : luis
--%>
<%-- 
    Document   : miPerfil
    Created on : 27/06/2021, 02:00:10
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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
              integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <!--icon-->
        <script src="https://kit.fontawesome.com/6d0db64a1f.js" crossorigin="anonymous"></script>
        <!--estilos personalizados-->
        <link href="../../resours/css/general.css" rel="stylesheet" type="text/css"/>
        <link href="../../resours/css/perfilGeneral.css" rel="stylesheet" type="text/css"/>
        <title>Perfil administrador</title>
    </head>
    <body>
        <jsp:include page="../admin/cabecera.jsp"></jsp:include>
        <jsp:include page="editarPerfil.jsp"></jsp:include>
        <section id="actions" class="perfil">
                <div class="container-fluid opacity">
                    <div class="card ancho">
                        <div class="card-header bg-secondary">
                            <div class="row">
                                <div class="col-sm-8">
                                    <h1><i class="fas fa-user px-md-5"> Codigo: ${medico.codigo}</i></h1>
                                <a href="#" data-toggle="modal" data-target="#editarMedicoModal" class="text-decoration-none text-light mx-lg-5"><i
                                        class="far fa-edit"></i>Editar perfil</a>
                            </div>
                            <div class="col-sm-4">
                                <h3><a href="Medico.jsp" class="text-decoration-none text-light mx-lg-5 mt-lg-4"><i
                                            class="fas fa-undo-alt"></i> Regresar</a></h3>
                            </div>
                        </div>

                    </div>
                    <div class="card-body">
                        <div class="row justify-content-md-center">
                            <div class="col col-sm-5">
                                <div class="bg-light">
                                    <h3>Nombre:</h3>
                                    <h3>Colegiado:</h3>
                                    <h3>DPI:</h3>
                                    <h3>Tel�fono:</h3>
                                    <h3>Email:</h3>
                                    <h3>Horario de inicio:</h3>
                                    <h3>Horario de finalizaci�n:</h3>
                                    <h3>Fecha de inicio de trabajo:</h3>
                                    
                                    <h3>Contrase�a:</h3>
                                </div>
                            </div>
                            <div class="col col-sm-7">
                                <div class="bg-light">
                                    <h3>${medico.nombre}</h3>
                                    <h3>${medico.colegiado}</h3>
                                    <h3>${medico.dpi}</h3>
                                    <h3>${medico.telefono}</h3>
                                    <h3>${medico.email}</h3>
                                    <h3>${medico.horarioInicio}</h3>
                                    <h3>${medico.horarioFin}</h3>
                                    <h3>${medico.fechaInicioTrabajo}</h3>
                                    <h3>${medico.contrase�a}</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
        crossorigin="anonymous"></script>

    </body>
</html>
