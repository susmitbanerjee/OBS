<%-- 
    Document   : horror
    Created on : May 11, 2017, 10:21:55 PM
    Author     : Susmit
--%>

<%@page import="Controller.Horror"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           Horror hr=new Horror();
           hr.processRequest(request, response);
            %>
    </body>
</html>
