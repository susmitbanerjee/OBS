<%-- 
    Document   : bengali
    Created on : May 11, 2017, 9:38:55 PM
    Author     : Susmit
--%>

<%@page import="Controller.Bengali"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Bengali bg=new Bengali();
            bg.processRequest(request, response);
            %>
    </body>
</html>
