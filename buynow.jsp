<%-- 
    Document   : buynow
    Created on : May 8, 2017, 9:26:05 PM
    Author     : Susmit
--%>

<%@page import="Controller.Cartcontroller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Cartcontroller cc=new Cartcontroller();
            cc.processRequest(request, response);
            %>
    </body>
</html>
