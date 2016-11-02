<%-- 
    Document   : game2p
    Created on : 1-nov-2016, 13:08:06
    Author     : Anthony Lannoote
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div id="player2" style="position: absolute; top: 350px; left: 400px;">
            <div id="card3" style="position: absolute; top: 0px; left: 0px;">
                <img src="/Blackjack_Groep3/rescources/playingCards/Clubs/ACE.png" alt="" width="70" height="100"/>    
            </div>
            <div id="card4" style="position: absolute; top: 0px; left: 90px;">
                <img src="/Blackjack_Groep3/rescources/playingCards/Clubs/FIVE.png" alt="" width="70" height="100"/>
            </div>
            <div id="selectbet2" style="position: absolute; top: 110px; left: 0px;">
                <input type="number" name="bet2" step="1" value="1" min="1" max="200" style="width: 40px;">
            </div>             
            <div id="icon2" style="position: absolute; top: 150px; left: 0px;">
                <img src="/Blackjack_Groep3/rescources/icons/C3P3.png" alt="" width="100" height="100"/>
                <div id="playername2" style="position: absolute; top: 110px; left: 30px;">
                    <font color="white">Mark</font>
                </div>
            </div>  
            <div id="balance1" style="position: absolute; top: 120px; left: 110px;">
                <img src="/Blackjack_Groep3/rescources/icons/currency.jpg" alt="" width="80" height="60"/>
                <font color="white">23</font>
            </div>
        </div>

    </body>
</html>
