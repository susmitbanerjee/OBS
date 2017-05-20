<%-- 
    Document   : drama
    Created on : May 11, 2017, 10:25:32 PM
    Author     : Susmit
--%>

<%@page import="Controller.Drama"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Drama dr=new Drama();
            dr.processRequest(request, response);
            %>
    </body>
</html>
