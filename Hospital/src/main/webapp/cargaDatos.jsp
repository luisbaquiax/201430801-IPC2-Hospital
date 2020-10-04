<%-- 
    Document   : cargaDatos
    Created on : 29/09/2020, 01:25:22
    Author     : luis
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.mycompany.sql.*"%>
<%@page import="com.mycompany.sql.Coneccion"%>
<%@page import="java.sql.DriverManager.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login.jsp">
            <input name="btnCargar" type="submit" onclick="CargaDatos">
        </form>

    </body>
</html>
