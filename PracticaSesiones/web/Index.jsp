<%-- 
    Document   : Index
    Created on : 20/09/2018, 06:52:17 PM
    Author     : Gina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesiones</title>
    </head>
    <body>
        <center>
            <h1>Ejemplo de Sesiones</h1>
            <br>
            <form action='SesionServlet' method='POST'>
                Nombre:<br>
                <input type="text" name="Nombre"><br>
                Apellido: <br>
                <input type="text" name="Apellido"><br>
                <input type="submit" value="Validar">
            </form>
        </center>
    </body>
</html>
