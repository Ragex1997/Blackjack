<%-- 
    Document   : userselection
    Created on : 27-okt-2016, 12:40:22
    Author     : Xander
--%>

<%@page import="model.User"%>
<%@page import="databank.services.UserService"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class = "select">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Add players</h1>

        <form action="/Blackjack_Groep3/AddUsersServlet" method="post">
            <table border="1">
                <tr>
                    <td>Select user</td><td>

                        <select name="user">
                            <%
                                UserService persoonService = new UserService();
                                List<User> users = persoonService.getListOfUsers();
                                for (User u : users) {

                                    out.print("<option value=" + u.getNickName() + ">" + u.getNickName() + "</option>");

                                }
                            %>

                        </select>


                    </td>
                    <td><input type="submit" value="Add user"></td>
                </tr>
            </table>
        </form>
        <%
            for (User u : users) {

                out.print("<img src='" + u.getIcon().getLocation() + "' width='120' height='120'>");

            }
        %>

        <table border="1">
            <tr>
                <th>User</th>
                <th>Icon</th>
            </tr>

            <%
                for (User u : users) {

                    out.print("<tr>"
                            + "<td>"+u.getNickName()+"</td>"
                            + "<td><img src='" + u.getIcon().getLocation() + "' width='120' height='120'></td>"
                            + "</tr>");

                }
            %>

        </table>

    </body>
</html>
