<%-- 
    Document   : literature
    Created on : May 11, 2017, 9:43:09 PM
    Author     : Susmit
--%>

<%@page import="Controller.Literature"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           Literature lt=new Literature(); 
           lt.processRequest(request, response);
            %>
    </body>
</html>
