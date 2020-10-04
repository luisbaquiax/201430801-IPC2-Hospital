<%-- 
    Document   : Login
    Created on : 28/09/2020, 02:18:30
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <button type="submit" name="btnCargaDatos" acction="cargaDatos.jsp">
                    Cargar datos
                </button>
                <form method="POST" action="Login.jsp">
                    <div>
                        <label for="codigo">Codigo de usuario:</label><br>
                        <input type="text" id="fname" name="txtCodigo" required><br>
                        <label for="lname">Contraseña de usuario:</label><br>
                        <input type="password" id="lname" name="txtPassword" required><br><br>
                        <input type="submit" name="ingresar" value="Ingresar al sistema" >
                    </div>
                    <br>
                </form>
                <form method="POST">

                    <div>
                        <button>Registrese</button>
                    </div>
                </form>

            </CENTER>
        </fieldset>
        <script>
            
        </script>
    </body>
</html>
