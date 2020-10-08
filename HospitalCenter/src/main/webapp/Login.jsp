<%-- 
    Document   : Login
    Created on : 28/09/2020, 02:18:30
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital Central</title>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <fieldset>
            <CENTER>
                <h1>Bienvenido al Hospital-Center</h1><br>
                <form action="CargaDatos" method="GET">
                    <button type="submit" name="btnCargaDatos" acction="">
                        Cargar datos
                    </button>
                </form>

                <form method="POST" action="Login">
                    <div>
                        <label for="codigo">Codigo de usuario:</label><br>
                        <input type="text" id="fname" name="codigo" required><br>
                        <label for="lname">Contraseña de usuario:</label><br>
                        <input type="password" id="lname" name="contraseña" required><br><br>
                        <input type="submit" name="ingresar" value="Ingresar al sistema" >
                    </div>
                    <br>
                </form>
                <form method="POST" action="paciente/RegistroPaciente.jsp">

                    <div>
                        <button type="submit">Registrese</button>
                    </div>
                </form>

            </CENTER>
        </fieldset>
        <script>

        </script>
    </body>
</html>
