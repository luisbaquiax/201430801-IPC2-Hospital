<%-- 
    Document   : registroMedico
    Created on : 3/10/2020, 18:33:44
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <CENTER>
        <form class="registro" action="administracion.jsp" method="POST">
            <table border="1" style="align-content: center">
                <thead>
                    <tr>
                        <th colspan="2" style="align-content: ">Registro de nuevo Médico</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label class="datos" for="dato" id="dato">Código:</label></td>
                        <td><input type="text" name="codigo" placeholder="Ingrese el código" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Nombre:</label></td>
                        <td><input type="text" name="nombre" placeholder="Nombre del médico" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Número de colegiado:</label></td>
                        <td><input type="text" id="dato" name="colegiado" placeholder="Número de colegiado" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">DPI:</label></td>
                        <td><input type="text" id="dato" name="dpi" placeholder="Ingrese el DPI" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Teléfono:</label></td>
                        <td><input type="text" id="dato" name="telefono" placeholder="Teléfono: +502 0000 0000" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Especialidad:</label></td>
                        <td><input type="text" id="dato" name="especialidad" placeholder="Especialidad" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Correo electrónico:</label></td>
                        <td><input type="text" id="dato" name="email" placeholder="Ingrese: E-MAIL" required=""></td>
                    </tr>
                    <tr>
                        <td colspan="2" ><label for="dato" id="dato">Horario de atención:</label></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Hora de inicio:</label></td>
                        <td><input type="time" id="dato" name="horaInicio" placeholder="Ingrese la hora de entrada" required="">horas</td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Hora final:</label></td>
                        <td><input type="time" id="dato" name="horaFin" placeholder="Ingrese la hora de salida" required="">horas</td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Inicio de trabajo (año/mes/día):</label></td>
                        <td>
                            <input type="date" value="año" name="fechaTrabajo" required="">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="reset" id="dato" name="limpiar" value="Realizar nuevo registro">
                            <input type="submit" id="dato" name="save" value="Guardar cambios">
                        </td>
                    </tr>
                </tbody>
            </table>
            <br>
        </form>
        <form>
            <input type="submit" value="Regresar" name="regresar"/>
        </form>
    </CENTER>
</body>
</html>
