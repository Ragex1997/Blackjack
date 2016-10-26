<%-- 
    Document   : gebruikerssysteem
    Created on : 24-okt-2016, 11:04:18
    Author     : Julie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accountbeheer</title>
    </head>
    <body>
        <!--
        aantalGebruikers = 
        -->
        <h1>Accountbeheer</h1>
        <table>
            <tr>
                <th>Nickname</th>
                <th>Balance</th>
                <th>Icon</th>
                <th>TimePlayed</th>
                <th>Actions</th>
            </tr>
                  
            <tr>
                <td></td>  <%--uit db halen--%>
                <td></td>    <%--uit db halen--%>
                <td></td>       <%--uit db halen--%>
                <td></td>   <%--via timer vastgelegd en dan in db gezet --%>
                <td><%out.println("<a href=\"" + response.encodeURL("edit") + "\">edit</a>");
                    out.println("a href=\"" + response.encodeURL("view") + "\">view</a>");
                    out.println("a href=\"" + response.encodeURL("delete") + "\">delete</a>");%>
                </td>                
            </tr>                                   
        </table>
                <button><a href="home">Home</button>
    </body>
</html>
