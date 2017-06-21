<%-- 
    Document   : exemplo2
    Created on : 20/06/2017, 10:26:49
    Author     : Login
--%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data</title>
    </head>
    <body>
        <% 
          int dia = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
          int mes = Integer.parseInt((new SimpleDateFormat("MM")).format(new Date()));
          int ano = Integer.parseInt((new SimpleDateFormat("yyyy")).format(new Date()));
        %>
        <h2>Data no computador Servidor:</h2>
        <font face="Arial" size="3">
        Dia: <b><%=dia%></b><br>
        Mês: <b><%=mes%></b><br>
        Ano: <b><%=ano%></b><br>
    </body>
</html>
