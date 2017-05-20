<%-- 
    Document   : Search
    Created on : May 6, 2017, 4:07:13 PM
    Author     : Susmit
--%>

<%@page import="Controller.Search"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Search sr=new Search();
            sr.processRequest(request, response);
        %>
    </body>
</html>

