<%-- 
    Document   : exemplo1
    Created on : 20/06/2017, 10:22:39
    Author     : Login
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vários tamanhos de texto</title>
    </head>
    <body>
        <% 
          for (int i = 1; i <= 6; i++) {
              out.println("<center><h" + i + ">Iniciando estudos JSP</h" + i + "></center>");
          }
        %>
    </body>
</html>
