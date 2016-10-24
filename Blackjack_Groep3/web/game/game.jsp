<%-- 
    Document   : game
    Created on : 24-okt-2016, 16:24:22
    Author     : Anthony Lannoote
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            String imageLocation = request.getAttribute("imagelocation").toString();
            
            %>
            <img src="<%=imageLocation %>" alt="Mountain View" style="width:150px;height:200px;">
        
    </body>
</html>
