<%-- 
    Document   : gebruikerssysteem
    Created on : 24-okt-2016, 11:04:18
    Author     : Julie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class = "accountbeheer">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accountbeheer</title>
    </head>
    <body>
        <link rel="stylesheet" href="../Opmaak.css" type="text/css" />
        <!--
        aantalGebruikers = 
        -->

        <h1>Accountbeheer</h1>

        <div align='center'>
            <table>

                <tr>
                    <td></td>  <%--uit db halen--%>
                    <td></td>    <%--uit db halen--%>
                    <td></td>       <%--uit db halen--%>
                    <td></td>   <%--via timer vastgelegd en dan in db gezet --%>
                    <td>
                        <input class="button" type="button" onclick="location.href = 'gebruikertoevoegen.jsp'" value="gebruiker toevoegen"><br><br>
                        <input class="button" type="button" onclick="location.href = 'gebruikeraanpassen.jsp'" value="gebruiker aanpassen"><br><br>
                        <input class="button" type="button" onclick="location.href = 'gebruikerdeleten.jsp'" value="gebruiker verwijderen"><br><br>
                        <input class="button" type="submit" value="Back" onclick="location.href = '../startpagina.html'">
                    </td>                
                </tr>                                   
            </table>
        </div>
    </body>
</html>
