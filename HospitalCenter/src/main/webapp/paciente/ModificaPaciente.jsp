<%-- 
    Document   : RegistroPaciente
    Created on : 29/09/2020, 04:21:20
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar paciente</title>
        <link href="../styles.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
    <CENTER>
        <form class="registro" action="Login.jsp" method="POST">
            <table border="1" style="align-content: center">
                <thead>
                    <tr>
                        <th colspan="2" style="align-content: ">Modificar paciente</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label class="datos" for="dato" id="dato">Código:</label></td>
                        <td><input type="text" name="codigo" placeholder="Ingrese el código" required="" disabled="false"></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Nombre:</label></td>
                        <td><input type="text" name="nombre" placeholder="Nombre del paciente" required="" ></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Sexo:</label></td>
                        <td>
                            <select id="dato" name="sexo" required="">
                                <option id="dato" value="masulino">Masculino</option>
                                <option id="dato" value="femenino">Femenino</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Fecha de nacimiento (año/mes/día):</label></td>
                        <td>
                            <input type="number" value="año" min="1899" max="2050" name="años" style="width: 100px" placeholder="AÑO">
                            <input type="number" value="mes" min="1" max="12" name="meses" style="width: 100px" placeholder="MES">
                            <input type="number" value="día" min="1" max="31" name="días" style="width: 100px" placeholder="DÍA">
                        </td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">DPI:</label></td>
                        <td><input type="text" id="dato" name="dpi" placeholder="Ingrese el DPI" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Teléfono:</label></td>
                        <td><input type="text" id="dato" name="telefono" placeholder="Teléfono" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Peso (kg):</label></td>
                        <td><input type="number" id="dato" name="peso" min="10" max="2000" placeholder="Peso en kilogramos" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Tipo de sangre:</label></td>
                        <td><input type="text" id="dato" name="sangre" placeholder="Tipo de sangre EJEMPLO: +A" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Correo electrónico:</label></td>
                        <td><input type="text" id="dato" name="email" placeholder="Ingrese: E-MAIL" required=""></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" id="dato" name="save" value="Guardar cambios">

                        </td>
                    </tr>
                </tbody>
            </table>
            <br>
        </form>
        <form action="../administracion.jsp"><input type="submit" id="dato" name="regresar" value="Regresar al menú anterior"></form>
    </CENTER>
</body>
</html>
