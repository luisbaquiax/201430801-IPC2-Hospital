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
<%@include file="administracion.jsp" %>

<!--solicitudes-->
<section id="solicitud" class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="">Solicitudes</h4>
                    </div>
                    <% SolicitudDB solicitudDB = new SolicitudDB();
                        List<Paciente> solicitudes = solicitudDB.getSolicitudes();
                    %>
                    <table class="table table-striped thead-dark">
                        <thead class="thead-dark">
                            <tr>
                                <th>No</th>
                                <th>Codigo</th>
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
                            <%for (Paciente solicitud : solicitudes) {%>
                            <tr>
                                <td><%out.print(solicitud.getId());%></td>
                                <td><a href="${pageContext.request.contextPath}/controladorCliente?accion=editarSolicitud&id=solicitud.getId()"
                                       class="btn btn-secondary">
                                        <i class="fas fa-angle-double-right"></i> Agregar codigo
                                    </a></td>
                                <td><%out.print(solicitud.getNombre());%></td>
                                <td><%out.print(solicitud.getSexo());%></td>
                                <td><%out.print(solicitud.getFechaNacimiento());%></td>
                                <td><%out.print(solicitud.getDpi());%></td>
                                <td><%out.print(solicitud.getTelefono());%></td>
                                <td><%out.print(solicitud.getPeso());%></td>
                                <td><%out.print(solicitud.getTipoSangre());%></td>
                                <td><%out.print(solicitud.getEmail());%></td>
                                <td><%out.print(solicitud.getContraseña());%></td>
                            </tr>
                            <%}%>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>