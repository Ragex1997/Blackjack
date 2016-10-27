<%-- 
    Document   : game
    Created on : 26-okt-2016, 17:45:04
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
        <div id="tafel" style="position: absolute"> <img src="/Blackjack_Groep3/rescources/backGrounds/blackjacktable.png" width="1330" height="640"> </div>
        <div id="dealericon" style="position: absolute; top: 30px; left: 580px;"> <img src="/Blackjack_Groep3/rescources/icons/Java the Hutt.png" width="200" height="200"> </div>

        <div id="player1" style="position: absolute; top: 200px; left: 50px;">
            <div id="card1" style="position: absolute; top: 0px; left: 0px;">
                <img src="/Blackjack_Groep3/rescources/playingCards/Clubs/ACE.png" alt="" width="70" height="100"/>    
            </div>
            <div id="card2" style="position: absolute; top: 0px; left: 90px;">
                <img src="/Blackjack_Groep3/rescources/playingCards/Clubs/FIVE.png" alt="" width="70" height="100"/>
            </div>
            <div id="selectbet" style="position: absolute; top: 110px; left: 0px;">
                <input type="number" name="bet" step="1" value="1" min="1" style="width: 40px;">
            </div>
                        
            
            
            <div id="icon1" style="position: absolute; top: 150px; left: 0px;">
                <img src="/Blackjack_Groep3/rescources/icons/C3P3.png" alt="" width="100" height="100"/>
                <font color="white">Mark</font>
            </div>
            
        </div> 

    </body>
</html>
