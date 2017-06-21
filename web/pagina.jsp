<%-- 
    Document   : pagina
    Created on : 20/06/2017, 10:09:34
    Author     : Login
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Minha primeira página em JSP</title>
    </head>
    <body>
       O conteúdo seguinte é gerado em JSP:
       <% 
        out.println("<br><br><b>Contador crescente:</b>");
        for (int i = 1; i <=10; i++) {
            out.println(i);
        }
       %>
    </body>
</html>
