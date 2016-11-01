<%-- 
    Document   : gebruikertoevoegen
    Created on : 1-nov-2016, 9:58:38
    Author     : Xander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="useradd">
    <head>
        <title>gebruiker toevoegen</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <link rel="stylesheet" href="../Opmaak.css" type="text/css" />
        <h1>voeg een gebruiker toe</h1>   
        <br>                                
            <div align="center">                
            <form action="GebruikerToevoegenServlet" method="post">
                <br>
                <br>
                <div class = "setcolor">
            <table>
                
                <tr>
                    <td>nickname:</td>
                    <td><input class="textbox" type="text" name="nickname"><br><br></td>
                </tr>
                <br>
                <tr>
                    <td>icon:</td>
                    <td><input class="textbox" type="text" name="icoonurl"><br><br></td>
                </tr>   
                <br>
                <tr>
                    <td>credits:</td>
                    <td><input class="textbox" type="number" name="credits"><br><br> <td>
                </tr>
                
            </table>
                </div>
                <br>
                <br>
                <input class="button" type="submit" value="Gebruiker toevoegen" />
        </form>
                <BR><input class="button" type="submit" value="Back" onclick="location.href='accountbeheer.jsp'">
            </div>
    </body>
</html>
