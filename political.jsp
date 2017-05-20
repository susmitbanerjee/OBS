<%-- 
    Document   : political
    Created on : May 11, 2017, 10:28:22 PM
    Author     : Susmit
--%>

<%@page import="Controller.Political"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Political pl=new Political();
            pl.processRequest(request, response);
            %>
    </body>
</html>
