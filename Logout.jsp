<%-- 
    Document   : Logout
    Created on : May 8, 2017, 8:27:01 PM
    Author     : Susmit
--%>

<%@page import="Controller.Logout"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Logout lo=new Logout();
            lo.processRequest(request, response);
            %>
    </body>
</html>
