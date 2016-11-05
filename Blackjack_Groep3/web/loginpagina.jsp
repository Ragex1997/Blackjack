<%-- 
    Document   : loginpagina
    Created on : 1-nov-2016, 9:53:59
    Author     : Xander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class ="loginpage"> 
    <head> 
        <title>LoginPage</title> 
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head> 
    <body> 
        <h1>Login Page</h1> 


        <link rel="stylesheet" href="/Opmaak.css" type="text/css" />

        <br>
        <div align="center" class ="setcolor">

            <form method="POST" action="j_security_check"> 

                <div class="container">
                    <div align="center" class ="setcolor">
                        <table>
                            <tr>
                            <td>
                            <label><b>Username</b></label>
                            <input type="text" placeholder="Enter Username" name="j_username" required>
                            </td>
                            </tr>
                            <tr>
                                <td>
                            <label><b>Password</b></label>
                            <input type="password" placeholder="Enter password" name="j_password" required>
                            </td>
                            
                            </tr>
                            <tr>
                                <td>
                            <br>
                            <br>
                            <div align="center">
                            <button class = "button" type="submit">Login</button>
                            </div>
                                </td>
                            </tr>
                           
                        </table>
                    </div>
                </div>    
            </form>

            <br>
            <br>
            <input class="button" type="submit" value="Home" onclick="location.href = 'startpagina.html'">
        </div>

    </body>
</html>
