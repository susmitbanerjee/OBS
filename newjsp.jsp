<%-- 
    Document   : newjsp
    Created on : May 5, 2017, 10:26:33 PM
    Author     : Susmit
--%>

<%@page import="Controller.Insert"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Insert in=new Insert();
            in.processRequest(request,response);
            %>
    </body>
</html>
