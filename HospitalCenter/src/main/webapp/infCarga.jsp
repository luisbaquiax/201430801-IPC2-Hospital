<%-- 
    Document   : infCarga
    Created on : 8/10/2020, 02:04:38
    Author     : luis
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login.jsp">
            <c:if var="administrador" test="${tamano=='ya'}">
                <h1>Datos cargados correctamente!!!</h1>
            </c:if>
        </form>
        <form action="Login.jsp">
            <c:if var="administrador" test="${tamano=='0'}">
                <h1>Los datos ya han sido cargados</h1>
            </c:if>
            <a href="Login.jsp">Regresar</a>
        </form>

    </body>
</html>
