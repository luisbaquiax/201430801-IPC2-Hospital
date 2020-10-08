<%-- 
    Document   : administracion
    Created on : 30/09/2020, 01:53:33
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administración</title>
        <link href="estilos/styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <LEFT>
        <div>
            <fieldset>
                <div>
                    <br><br>
                    <CENTER>
                        <B >MENU-ADMINISTRACION</B><br><br><br>
                    </CENTER>
                    <CENTER>
                        <form>
                            <input type="submit" id="admin" value="Crear exámen de laboratorio" ><br><br>
                        </form>
                        <form>
                            <input type="submit" id="admin" value="Modificar estructura de examen" ><br><br>
                        </form>
                        <form>
                            <input type="submit" id="admin" value="Modificar costo de consulta"><br><br>
                        </form>
                        <form>
                            <input type="submit" id="admin" value="Registrar médico" ><br><br>
                        </form>
                        <form>
                            <input type="submit" id="admin" value="Registrar laboratorista" ><br><br>
                        </form>
                        <form action="paciente/RegistroPaciente.jsp">
                            <input type="submit" id="admin" value="Registrar paciente"><br><br>
                        </form>
                        <form>
                            <input type="submit" id="admin" value="Los 10 médicos con más informes"><br><br>
                        </form>
                        <form>
                            <input type="submit" id="admin" value="Ingresos por médico" ><br><br>
                        </form>
                    </CENTER>
                </div>
            </fieldset>
        </div>
    </left>
</body>
</html>
