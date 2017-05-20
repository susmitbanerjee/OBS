<%-- 
    Document   : history
    Created on : May 11, 2017, 10:31:30 PM
    Author     : Susmit
--%>

<%@page import="Controller.History"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           History ht=new History(); 
           ht.processRequest(request, response);
            %>
    </body>
</html>
