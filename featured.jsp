<%-- 
    Document   : featured
    Created on : May 6, 2017, 12:27:47 AM
    Author     : Susmit
--%>

<%@page import="Controller.featured"%>
<%@page import="Model.Bookclass" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.print("Hello all");
            featured ft=new featured();
            ft.processRequest(request, response);
            
         %>
            
    </body>
</html>
