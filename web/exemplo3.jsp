<%-- 
    Document   : exemplo3
    Created on : 20/06/2017, 10:33:20
    Author     : Login
--%>
<%@page import="java.util.Calendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
          Calendar calendar = Calendar.getInstance();
          int horaAtual = calendar.get(Calendar.HOUR_OF_DAY);
          String men = "";
          if (horaAtual < 6) {
              men = "Boa Madrugada";
          } else if (horaAtual <= 12) {
              men = "Bom Dia";
          } else if (horaAtual <= 18) {
              men = "Boa Tarde";
          } else if (horaAtual <= 23) {
              men = "Boa Noite";
          }
          out.println("<font face='verdana' size=4><br>" + horaAtual + "h - " + men
                   + "</b>, Seja Bem Vindo!!!</font>");
        %>
    </body>
</html>
