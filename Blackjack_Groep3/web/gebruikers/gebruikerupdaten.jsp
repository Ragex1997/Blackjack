<%-- 
    Document   : gebruikerupdaten
    Created on : 7-nov-2016, 11:58:11
    Author     : Xander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="userupdate">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <link rel="stylesheet" href="../Opmaak.css" type="text/css" />
        <h1>Gebruiker Aanpassen</h1>   
        <br>                                
        <div align="center">                
            <form action="/Blackjack_Groep3/GebruikerUpdatenServlet" method="post">
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
                        <br>
                        <tr>
                            <td>email:</td>
                            <td><input class="textbox" type="text" name="email"><br><br></td>
                        </tr>
                        <br>
                        <tr>
                            <td>password::</td>
                            <td><input class="textbox" type="text" name="password"><br><br></td>
                        </tr>
                        <br>
                        <tr>
                            <td>admin? enter 0 or 1:</td>
                            <td><input class="textbox" type="text" name="admin"><br><br></td>
                        </tr>
                        <br>

                    </table>
                </div>
                <br>
                <br>
                <input class="button" type="submit" value="Opslaan" />
            </form>
            <BR><input class="button" type="submit" value="Back" onclick="location.href='accountbeheer.jsp'">
        </div>
        
    </body>
</html>
