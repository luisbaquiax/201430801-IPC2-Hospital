<%-- 
    Document   : miPerfil
    Created on : 27/06/2021, 02:00:10
    Author     : luis
--%>
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
            <section id="actions" class="py-4 mb-4">
                <div class="container opacity">
                    <div class="card ancho">
                        <div class="card-header bg-secondary">
                            <div class="row">
                                <div class="col flex-column">
                                    <h1><i class="fas fa-user px-md-5"> Codigo: ${administrador.codigo}</i> </h1>
                                <a href="#${pageContext.request.contextPath}/ControladorAministrador?tarea=editar&id=${administrador}" class="text-decoration-none text-light mx-lg-5"><i
                                        class="far fa-edit"></i>Editar perfil</a>
                            </div>
                            <div class="col flex-column">
                                <h3><a href="administracion.jsp" class="text-decoration-none text-light mx-lg-5 mt-lg-4"><i
                                            class="fas fa-undo-alt"></i> Regresar</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <div class="row justify-content-md-center">
                            <div class="col col-sm-auto">
                                <div class="bg-light">
                                    <h3>DPI</h3>
                                    <h3>Nombre</h3>
                                    <h3>Contraseña</h3>
                                </div>
                            </div>
                            <div class="col">
                                <div class="bg-light">
                                    <h3>${administrador.dpi}</h3>
                                    <h3>${administrador.nombre}</h3>
                                    <h3>${administrador.contreseña}</h3>
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