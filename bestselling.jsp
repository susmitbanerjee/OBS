<%-- 
    Document   : bestselling
    Created on : May 11, 2017, 9:30:03 PM
    Author     : Susmit
--%>

<%@page import="Controller.Bestselling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Bestselling bs=new Bestselling();
        bs.processRequest(request, response);
                %>
    </body>
</html>
