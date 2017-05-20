<%-- 
    Document   : Login1
    Created on : May 6, 2017, 11:18:54 AM
    Author     : Susmit
--%>

<%@page import="Controller.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Login lg=new Login();
            lg.processRequest(request, response);
            %>
    </body>
</html>
