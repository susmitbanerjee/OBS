<%-- 
    Document   : science
    Created on : May 11, 2017, 10:36:44 PM
    Author     : Susmit
--%>

<%@page import="Controller.Science"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Science sc=new Science();
            sc.processRequest(request, response);
            %>
    </body>
</html>
