<%-- 
    Document   : gebruikerview
    Created on : 5-nov-2016, 10:49:57
    Author     : Xander
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="databank.services.AccountbeheerService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>gebruiker Kiezen</h1>
        <form action="/Blackjack_Groep3/GebruikerSelecterenServlet" method="post">
            <table border="1">
                <tr>
                    <td>Select user</td><td>

                        <select name="users">
                            <%

                                AccountbeheerService accser = new AccountbeheerService();

                                List<String> result = accser.getusers();
                                
                                        
                                Iterator it = result.iterator();
                                while (it.hasNext()) {
                                    out.print("<option>"+ it.next()+"</option>");
                                }
                              

                            %>

                        </select>


                    </td>

                </tr>
                <tr>
                    <td><input type="submit" name="selectuser" value="gebruiker aanpassen"></td>
                </tr>

            </table>

        </form>

    </body>
</html>
