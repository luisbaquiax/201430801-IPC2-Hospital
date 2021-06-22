<%-- 
    Document   : clientes
    Created on : 10 jun. 2021, 0:11:16
    Author     : Luis
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- para dar formato el texto-->
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- SELECCIONAMOS LA LOCALIDAD -->
<fmt:setLocale value="es_GT"/>

<!--medicos-->
<section id="medicos" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Listado de Medicos</h4>
                    </div>
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
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--laboratoristas-->
<section id="lab" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Listado de Laboratoristas</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
                                <th>Nombre</th>
                                <th>Registro</th>
                                <th>DPI</th>
                                <th>Telefono</th>
                                <th>Tipo de Examen</th>
                                <th>Email</th>
                                <th>Fecha de inicio de trabajo</th>
                                <th>Contraseña</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de laboratoristas -->
                            <c:forEach var="lab" items="${labs}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${lab.codigo}</td> 
                                    <td>${lab.nombre}</td>
                                    <td>${lab.registro}</td>
                                    <td>${lab.dpi}</td>
                                    <td>${lab.telefono}</td>
                                    <td>${lab.tipoExamen}</td>
                                    <td>${lab.email}</td>
                                    <td>${lab.fechaInicioTrabajo}</td>
                                    <td>${lab.contraseña}</td>
                                </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--Pacientes-->
<section id="pacientes" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Listado de Pacientes</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
                                <th>Nombre</th>
                                <th>Sexo</th>
                                <th>Fecha de nacimiento</th>
                                <th>DPI</th>
                                <th>Telefono</th>
                                <th>Peso</th>
                                <th>Tipo Sangre</th>
                                <th>Email</th>
                                <th>Contraseña</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de pacientes -->
                            <c:forEach var="paciente" items="${pacientes}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td> 
                                    <td>${paciente.codigo}</td>
                                    <td>${paciente.nombre}</td>
                                    <td>${paciente.sexo}</td>
                                    <td>${paciente.fechaNacimiento}</td>
                                    <td>${paciente.dpi}</td>
                                    <td>${paciente.telefono}</td>
                                    <td>${paciente.peso}</td>
                                    <td>${paciente.tipoSangre}</td>
                                    <td>${paciente.email}</td>
                                    <td>${paciente.contraseña}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Examenes de laboratorio-->
<section id="examen" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Examenes de laboratorio</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
                                <th>Nombre</th>
                                <th>Orden</th>
                                <th>Descripción</th>
                                <th>Costo</th>
                                <th>Informe</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de examenes -->
                            <c:forEach var="examen" items="${examenes}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td> 
                                    <td>${examen.codigo}</td>
                                    <td>${examen.nombre}</td>
                                    <td>${examen.orden}</td>
                                    <td>${examen.descripcion}</td>
                                    <td><fmt:formatNumber value="${examen.costo}" type="currency"/></td>
                                    <td>${examen.informe}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Reportes-->
<section id="reporte" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Informes</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
                                <th>Paciente</th>
                                <th>Medico</th>
                                <th>Informe</th>
                                <th>Fecha</th>
                                <th>Hora</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de examenes -->
                            <c:forEach var="reporte" items="${reportes}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td> 
                                    <td>${reporte.codigo}</td>
                                    <td>${reporte.codigoPaciente}</td>
                                    <td>${reporte.codigoMedico}</td>
                                    <td>${reporte.informe}</td>
                                    <td>${reporte.fecha}</td>
                                    <td>${reporte.hora}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Resultados-->
<section id="resultado" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Resultados</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
                                <th>Paciente</th>
                                <th>Examen</th>
                                <th>Laboratorista</th>
                                <th>Orden</th>
                                <th>Informe</th>
                                <th>Fecha</th>
                                <th>Hora</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de resultados -->
                            <c:forEach var="resultado" items="${resultados}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td> 
                                    <td>${resultado.codigo}</td>
                                    <td>${resultado.codigoPaciente}</td>
                                    <td>${resultado.codigoExamen}</td>
                                    <td>${resultado.codigoLaboratorista}</td>
                                    <td>${resultado.ordenPath}</td>
                                    <td>${resultado.informePath}</td>
                                    <td>${resultado.fecha}</td>
                                    <td>${resultado.hora}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Citas-->
<section id="cita" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Citas</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
                                <th>Paciente</th>
                                <th>Medico</th>
                                <th>Fecha</th>
                                <th>Hora</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de resultados -->
                            <c:forEach var="cita" items="${citas}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td> 
                                    <td>${cita.codigo}</td>
                                    <td>${cita.codigoPaciente}</td>
                                    <td>${cita.codigoMedico}</td>
                                    <td>${cita.fecha}</td>
                                    <td>${cita.hora}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Consulta-->
<section id="consulta" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Consultas</h4>
                    </div>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Tipo</th>
                                <th>Costo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iteramos cada elemento de la lista de resultados -->
                            <c:forEach var="consulta" items="${consultas}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td> 
                                    <td>${consulta.tipoConsulta}</td>
                                    <td>${consulta.costo}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--incluir el modal-->
