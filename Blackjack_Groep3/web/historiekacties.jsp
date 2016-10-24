<%-- 
    Document   : historiek
    Created on : 24-okt-2016, 10:30:27
    Author     : Julie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Historiek acties</title>
    </head>
    <body>
        <h1>History actions</h1>
        <table>
            <tr>
                <th></th>
                <th>Dealer</th>
                <th>Player</th>
                <th></th>
            </tr> 
            for("aantalGames">0){
            <tr>
                <td><%out.println("actie");%></td>
                <td><%out.println("dealerEindstand");%></td>
                <td><%out.println("playerEindstand");%></td>
                <td><%out.println("resultaat");%></td>
            </tr>}
        </table>
            <button><a href="home">Home</a></button>
    </body>
</html>
