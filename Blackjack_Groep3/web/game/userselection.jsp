<%-- 
    Document   : userselection
    Created on : 27-okt-2016, 12:40:22
    Author     : Xander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class = "select">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Add players</h1>
        
        <form action="...">
            <table border="1">
                <tr>
                    <td>Select user</td><td>
                        
                        <select name="user">
                            <%
                                PersoonService persoonService = new PersoonService();
                                List<Persoon> personen = persoonService.listOfPersons();
                                for (Persoon p : personen) {

                                    out.print("<option value=" + p.getRijksregisterNummer() + ">" + p.getVoornaam() + " " + p.getNaam() + "</option>");
                                }


                            %>
                        </select>
                        
                    </td>
                </tr>
                
                
            </table>
        </form>
        
        
    </body>
</html>
