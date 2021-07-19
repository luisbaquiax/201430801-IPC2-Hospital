<%-- 
    Document   : menu
    Created on : 17/07/2021, 23:18:10
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
                            <a class="nav-link pl-4" href="perfilMedico.jsp">Mi perfil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/controladorHistorial?tarea=verHistorial">Historial médico</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#agregarMedicoModal">Citas -fecha 1, fecha 2-</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/controladorMedico?tarea=medicos">Citas del día</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"
                               data-toggle="modal" data-target="#agregarLaboratoristaModal">Pacientes con mayor informes médicos</a>
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
