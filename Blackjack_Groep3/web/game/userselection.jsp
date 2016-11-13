<%-- 
    Document   : userselection
    Created on : 27-okt-2016, 12:40:22
    Author     : Xander
--%>

<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="model.User"%>
<%@page import="databank.services.UserService"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class = "userselection">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <link rel="stylesheet" href="/Blackjack_Groep3/Opmaak.css" type="text/css" />


        <h1>Add players</h1>

        <form action="/Blackjack_Groep3/AddUsersServlet" method="post">
            <table border="1">
                <tr>
                    <td>Select user</td><td>

                        <select name="user">
                            <%
                                //Ophalen van users uit de DB of
                                //het ophalen van users waar de al geselecteerde niet meet in zitten
                                String selected = "";

                                try {
                                    selected = request.getAttribute("selected").toString();
                                } catch (Exception e) {

                                }
                                List<User> users = null;
                                //We kijken of je al een gebruiker geselecteerd had
                                if (selected.equals("yes")) {
                                    //Zo ja halen we een lijst op van gebruikers waar de gene die je al hebt geselecteerd 
                                    //Niet meer inzitten
                                    users = (List<User>) session.getAttribute("usersChoice");
                                    
                                } else {
                                    //Zo niet halen we ze op uit de database om ze te selecteren 
                                    //Op basis van als je aangemeld bent als admin of niet
                                    UserService persoonService = new UserService();
                                    if (request.getUserPrincipal() == null) {
                                        users = (List) persoonService.getListOfUsers(false);
                                    } else {
                                        users = (List) persoonService.getListOfUsers(true);
                                    }

                                }

                                for (User u : users) {

                                    out.print("<option value=" + u.getNickName() + ">" + u.getNickName() + "</option>");

                                }

                            %>

                        </select>


                    </td>

                </tr>
                <tr>
                    <td><button type="button" name="reset_btn" onclick="window.location = '/Blackjack_Groep3/ResetChoiceServlet';">Reset</button></td>
                    <td><input type="submit" name="adduser_sub" value="Add user"></td>
                </tr>
                <tr>
                            <td><button type="button" name="play_btn" onclick="window.location = '/Blackjack_Groep3/PlayGameServlet';" <%if (!selected.equals("yes")) {
                            out.print("disabled");
                        }%>>Play</button></td>
                    <td><button type="button" name="home_btn" onclick="window.location = '/Blackjack_Groep3/startpagina.html';">Home</button></td>

                </tr>
            </table>

        </form>


        <table>


            <%
                //Tonen van de al geselecteerde users
                //Als er al geselecteerde gebruikers zijn
                if (selected.equals("yes")) {

                    List<User> usersForGame = (List<User>) session.getAttribute("usersForGame");

                    out.print("<tr>"
                            + "<th>User</th>"
                            + "<th>Icon</th>"
                            + "<tr>");

                    for (User u : usersForGame) {
                        out.print("<tr>"
                                + "<td>" + u.getNickName() + "</td>"
                                + "<td><img src='" + u.getIcon().getLocation() + "' width='120' height='120'></td>"
                                + "</tr>");
                    }
                }


            %>

        </table>

    </body>
</html>
