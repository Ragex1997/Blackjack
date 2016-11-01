<%-- 
    Document   : game4p
    Created on : 1-nov-2016, 13:08:23
    Author     : Anthony Lannoote
--%>

<%@page import="model.Dealer"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="model.Game"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            Game game = (Game) session.getAttribute("game");
            int turn = 0;
            if (session.getAttribute("turn") == null) {
                turn = 1;
                session.setAttribute("turn", turn);

            } else {
                turn = (Integer) (session.getAttribute("turn"));
                turn++;
                session.setAttribute("turn", turn);
            }

            if (turn == 1) {
                session.setAttribute("state", "betset");

            }

            int players = game.getUsers().size();
            List<User> users = game.getUsers();
            Dealer dealer = game.getDealer();

        %>

        <form>
            <div id="tafel" style="position: absolute"> <img src="/Blackjack_Groep3/rescources/backgrounds/blackjacktable.png" width="1330" height="640"> </div>

            <div id="dealer" style="position: absolute; top: 30px; left: 580px;">

                <div id="dealericon" style="position: absolute; top: 50px; left: 160px;">
                    <img src="<%=dealer.getIcon()%>" width="200" height="200"> 
                    <div id="dealername" style="position: absolute; top: 180px; left: 40px;">
                        <font color="white">Jabba The Dealer</font>
                    </div>
                </div>

                <div id="card1" style="position: absolute; top: 100px; left: 0px;">
                    <img src="/Blackjack_Groep3/rescources/playingCards/Clubs/ACE.png" alt="" width="70" height="100"/>    
                </div>
                <div id="card2" style="position: absolute; top: 100px; left: 90px;">
                    <img src="/Blackjack_Groep3/rescources/playingCards/playingcardback.png" alt="" width="70" height="100"/>

                </div>
            </div>


            <div id="player1" style="position: absolute; top: 250px; left: 50px;" <%="display: none;"%>>
                <div id="card1" style="position: absolute; top: 0px; left: 0px;">
                    <img src="" alt="" width="70" height="100"/>    
                </div>
                <div id="card2" style="position: absolute; top: 0px; left: 90px;">
                    <img src="" alt="" width="70" height="100"/>
                </div>
                <div id="selectbet1" style="position: absolute; top: 110px; left: 0px;">
                    <input type="number" name="bet1" step="1" <%="value='" + users.get(0).getBet() + "'"%> min="1" <%= "max='" + users.get(0).getBalance() + "'"%> style="width: 40px;">
                </div>             
                <div id="icon1" style="position: absolute; top: 150px; left: 0px;">
                    <img src="<%=users.get(0).getIcon().getLocation()%>" alt="" width="100" height="100"/>
                    <div id="playername1" style="position: absolute; top: 110px; left: 30px;">
                        <font color="white"><%=users.get(0).getNickName()%></font>
                    </div>
                </div>
                <div id="balance1" style="position: absolute; top: 120px; left: 110px;">
                    <img src="/Blackjack_Groep3/rescources/icons/currency.jpg" alt="" width="80" height="60"/>
                    <font color="white"><%=users.get(0).getBalance()%></font>
                </div>
            </div> 
        </form>

        <div id="playbutton" style="position: absolute; top: 500px; left: 1200px;">
            <input type="image" src="/Blackjack_Groep3/rescources/icons/Yoda - 02.png" alt="submit" width="150" height="150">
        </div>


    </body>
</html>
