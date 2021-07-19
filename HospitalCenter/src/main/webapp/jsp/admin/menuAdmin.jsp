<%-- 
    Document   : menuAdmin
    Created on : 1/07/2021, 03:03:14
    Author     : luis
--%>
<nav>
    <div class="box-menu">
        <header class="menu">
            <nav class="navbar navbar-expand navbar-dark bg-dark rounded">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample10" aria-controls="navbarsExample10" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample10">
                    <div class="d-flex justify-content-end social_icon">
                        <h1 class="pl-2"><span><i class="fas fa-hospital bg-warning px-2 py-1"></i></span></h1>
                    </div>
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link pl-4" href="../admin/miPerfil.jsp">Mi perfil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/ControladorAministrador?tarea=mostrar">Solicitudes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#agregarMedicoModal">Registrar médico</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/controladorMedico?tarea=medicos">Listar médicos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#agregarLaboratoristaModal">Registrar laboratorista</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#">Listar Laboratoristas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#agregarExamenModal">Crear nuevo exámen</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/ControladorAministrador?tarea=mostrar">Solicitudes</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle badge-dark"  data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                               aria-expanded="false">Reportes</a>
                            <div class="dropdown-menu badge-dark">
                                <a class="dropdown-item badge-dark" href="#">Reporte 1</a>
                                <a class="dropdown-item badge-dark" href="#">Reporte 1</a>
                                <a class="dropdown-item badge-dark" href="#">Reporte 1</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/salir"><i class="fas fa-sign-out-alt"></i> Salir</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
    </div>
</nav>