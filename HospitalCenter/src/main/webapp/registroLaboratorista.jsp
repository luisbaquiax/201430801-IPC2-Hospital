<%-- 
    Document   : registroLaboratorista
    Created on : 3/10/2020, 18:33:57
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
        <form class="registro" action="" method="POST">
            <table border="1" style="align-content: center">
                <thead>
                    <tr>
                        <th colspan="2" style="align-content: ">Registro de nuevo Laboratorista</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><label class="datos" for="dato" id="dato">Código:</label></td>
                        <td><input type="text" name="codigo" placeholder="Ingrese el código" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Nombre:</label></td>
                        <td><input type="text" name="nombre" placeholder="Nombre del laboratorista" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Número de registro:</label></td>
                        <td>
                            <input type="text" id="dato" name="registro" placeholder="Número de registro" required="">
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
                        <td><label for="dato" id="dato">Tipo de exámen a cargo:</label></td>
                        <td><input type="text" id="dato" name="examen" placeholder="Tipo de exámen" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Días de trabajo:</label></td>
                        <td>
                            <input type="checkbox" id="dato" name="lunes" value="Lunes">Lunes  
                            <input type="checkbox" id="dato" name="martes" value="Martes">Martes
                            <input type="checkbox" id="dato" name="miercoles" value="Miércoles">Miércoles
                            <input type="checkbox" id="dato" name="jueves" value="Jueves">Jueves<br>
                            <input type="checkbox" id="dato" name="viernes" value="Viernes">Viernes
                            <input type="checkbox" id="dato" name="sabado" value="Sábado">Sábado
                            <input type="checkbox" id="dato" name="domingo" value="Domingo">Domingo
                        </td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Correo electrónico:</label></td>
                        <td><input type="text" id="dato" name="email" placeholder="Ingrese: E-MAIL" required=""></td>
                    </tr>
                    <tr>
                        <td><label for="dato" id="dato">Inicio de trabajo (año/mes/día):</label></td>
                        <td>
                            <input type="number" value="año" min="1899" max="2050" name="año" style="width: 100px" placeholder="AÑO">
                            <input type="number" value="mes" min="1" max="12" name="mes" style="width: 100px" placeholder="MES">
                            <input type="number" value="día" min="1" max="31" name="dia" style="width: 100px" placeholder="DÍA">
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
    </CENTER>
</body>
</html>
