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
    </head>
    
    <body>
        <fieldset>
            <form action="Login.jsp" method="POST">
                <fieldset>
                    <div>Registro de nuevo paciente</div>
                    <label for="dato">Nombre:</label>
                    <input type="text" name="nombrePaciente" required="" disabled="false"><br><br>
                    <label for="dato">Sexo (M=masculino, F=femenino):</label>
                    <input type="text" readonly name="sexo" required=""><br><br>
                    <label for="dato">Fecha de nacimiento (yy-mm-dd):</label>
                    <input type="text" name="fechaNacimiento" required=""><br><br>
                    <label for="dato">DPI:</label>
                    <input type="text" name="dpi" required=""><br><br>
                    <label for="dato">Teléfono:</label>
                    <input type="text" name="telefono" required=""><br><br>
                    <label for="dato">Peso:</label>
                    <input type="text" name="peso" required=""><br><br>
                    <label for="dato">Tipo de sangre:</label>
                    <input type="text" name="tipoSangre" required=""><br><br>
                    <label for="dato">Correo eléctronico:</label>
                    <input type="text" name="correo" required=""><br><br>
                    <button type="submit" name="guardar" onclick="reset">
                        Guardar cambios
                    </button>
                    <input type="reset" name="limpia" value="Realizar nuevo registro">
                </fieldset>
                <br>
                <fieldset>
                    <div>
                        <div>Registrar nuevo médico</div>
                        <label for="dato">Nombre:</label>
                        <input type="text" name="nombrePaciente" required=""><br><br>
                        <label for="dato">Sexo (M=masculino, F=femenino):</label>
                        <input type="text" name="sexo" required=""><br><br>
                        <label for="dato">Fecha de nacimiento (yy-mm-dd):</label>
                        <input type="text" name="fechaNacimiento" required=""><br><br>
                        <label for="dato">DPI:</label>
                        <input type="text" name="dpi" required=""><br><br>
                        <label for="dato">Teléfono:</label>
                        <input type="text" name="telefono" required=""><br><br>
                        <label for="dato">Peso:</label>
                        <input type="text" name="peso" required=""><br><br>
                        <label for="dato">Tipo de sangre:</label>
                        <input type="text" name="tipoSangre" required=""><br><br>
                        <label for="dato">Correo eléctronico:</label>
                        <input type="text" name="correo" required=""><br><br>
                        <button type="submit" name="guardar" onclick="reset">
                            Guardar cambios
                        </button>
                        <input type="reset" name="limpia" value="Realizar nuevo registro">
                    </div>
                </fieldset>
                <input type="text" width="500" height="500">
            </form>
        </fieldset>

    </body>
</html>
