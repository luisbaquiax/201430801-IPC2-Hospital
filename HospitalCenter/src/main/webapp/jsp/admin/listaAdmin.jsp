<%-- 
    Document   : listaAdmin
    Created on : 25/06/2021, 01:21:32
    Author     : luis
--%>

<%@page import="entidades.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="dataBase.modelo.SolicitudDB"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- para dar formato el texto-->
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- SELECCIONAMOS LA LOCALIDAD -->
<fmt:setLocale value="es_GT"/>
<jsp:include page="administracion.jsp"></jsp:include>
    <!--solicitudes-->
    <section id="solicitud" class="section">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12"><!-- w-atuo cambió un poco el ancho del card -->
                    <div class="card">
                        <div class="card-header">
                            <h4 class="text-center">Solicitudes</h4>
                        </div>
                        <table class="table table-striped thead-dark">
                            <thead class="thead-dark">
                                <tr>
                                    <th>No</th>
                                    <th>Código</th>
                                    <th>Nombre</th>
                                    <th>sexo</th>
                                    <th>Fecha de nacimiento</th>
                                    <th>DPI</th>
                                    <th>Telefono</th>
                                    <th>Peso</th>
                                    <th>Tipo de sangre</th>
                                    <th>Emial</th>
                                    <th>Contraseña</th>

                                </tr>
                            </thead>
                            <tbody>
                                <!-- Iteramos cada elemento de la lista de solicitudes -->
                            <c:forEach var="paciente" items="${solicitudes}">

                                <tr>
                                    <td>${paciente.id}</td>
                                    <td><a href="${pageContext.request.contextPath}/ControladorPaciente?tarea=editarSolicitud&id=${paciente.id}"
                                           class="btn btn-secondary">
                                            <i class="fas fa-key"></i> Agregar codigo
                                        </a></td>
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
