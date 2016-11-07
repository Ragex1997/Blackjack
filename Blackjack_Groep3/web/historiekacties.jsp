<%-- 
    Document   : historiek
    Created on : 24-okt-2016, 10:30:27
    Author     : Julie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class = "history">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Historiek acties</title>
    </head>
    <body>
        <link rel="stylesheet" href="Opmaak.css" type="text/css" />
        <h1>History actions</h1>
        <table>
            <tr>
                <th></th>
                <th>Dealer</th>
                <th>Player</th>
                <th></th>
            </tr> 
            <!--or("aantalGames">0){ -->
            <tr>
                <td><%out.println("actie");%></td>
                <td><%out.println("dealerEindstand");%></td>
                <td><%out.println("playerEindstand");%></td>
                <td><%out.println("resultaat");%></td>
            </tr>}
        </table>
            <input class="button" type="submit" value="Back" onclick="location.href='history.jsp'">
    </body>
</html>
