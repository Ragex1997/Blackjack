<%-- 
    Document   : history
    Created on : 24-okt-2016, 12:04:21
    Author     : Julie
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page import="model.Game"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class ="history">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>historiek</title>
    </head>
    <body>
        
        <%
        Game game = (Game) session.getAttribute("game");
        List<User> users = game.getUsers();
        Calendar gameDate = game.getDate();        
        
        %>
        <link rel="stylesheet" href="Opmaak.css" type="text/css" />
        <table>
            <tr>
                <th>Date</th>
                <th>Winner</th>
                <th>Balance</th>
                <th>Players</th>
                <th>Actions</th>                
            </tr>
                    
            <tr>                
                <td><%=gameDate%></td>
                <td><%=users.get(0).getGameStatus()%></td>
                <td><%=users.get(0).getBalance()%></td>
                <td><%=game.getUsers().size()%></td>
                <td><a href="historiekacties.jsp">View</a></td>
            </tr>
        </table>
        <input class="button" type="submit" value="Back" onclick="location.href='startpagina.html'">
    </body>
</html>
