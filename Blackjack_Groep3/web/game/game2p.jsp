<%-- 
    Document   : game2p
    Created on : 1-nov-2016, 13:08:06
    Author     : Anthony Lannoote
--%>

<%@page import="model.User"%>
<%@page import="model.Game"%>
<%@page import="model.Dealer"%>
<%@page import="model.Card"%>
<%@page import="java.util.List"%>
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

            int turn = (Integer) (session.getAttribute("turn"));
            int userturn = (Integer) (session.getAttribute("userturn"));

            List<User> users = game.getUsers();
            Dealer dealer = game.getDealer();

        %>


        <form action="/Blackjack_Groep3/PlayGameServlet" method="post">
            <div id="tafel" style="position: absolute"> <img src="/Blackjack_Groep3/rescources/backgrounds/blackjacktable.png" width="1330" height="640"> </div>


            <div id="dealer" style="position: absolute; top: 30px; left: 580px;">

                <div id="dealericon" style="position: absolute; top: 50px; left: 160px;">
                    <img src="<%=dealer.getIcon().getLocation()%>" width="200" height="200"> 
                    <div id="dealername" style="position: absolute; top: 180px; left: 40px;">
                        <font color="white">Jabba The Dealer</font>
                        <font color="white">status: <%=dealer.getHand().getStatus()%></font>
                        <font color="white"> value: <%=dealer.getHand().getValue()%></font>
                    </div>
                </div>

                <%
                    List<Card> cardsDealer = dealer.getHand().getCards();
                    int positionleft = 0;
                    for (Card c : cardsDealer) {

                        out.print("<div style='position: absolute; top: 100px; left: " + positionleft + "px'>");

                        if (c.getVisable()) {
                            out.print("<img src='" + c.getCardImage() + "' width='70' height='100'/>");
                        } else {
                            out.print("<img src='" + c.getBackImage() + "' width='70' height='100'/>");
                        }

                        out.print("</div>");
                        positionleft += 20;
                    }

                %>

            </div>


            <div id="player1" style="position: absolute; top: 250px; left: 50px;">
                <%                    List<Card> cards = users.get(0).getHand().getCards();
                    positionleft = 0;
                    for (Card c : cards) {

                        out.print("<div style='position: absolute; top: 0px; left: " + positionleft + "px'>");
                        out.print("<img src='" + c.getCardImage() + "' width='70' height='100'/>");
                        out.print("</div>");
                        positionleft += 20;
                    }

                %>


                <div id="selectbet1" style="position: absolute; top: 110px; left: 0px;">
                    <input type="number" name="bet1" step="1" <%="value='" + users.get(0).getBet() + "'"%> min="1" <%= "max='" + users.get(1).getBalance() + "'"%> style="width: 40px;">
                </div>             
                <div id="icon1" style="position: absolute; top: 150px; left: 0px;">
                    <img src="<%=users.get(0).getIcon().getLocation()%>" alt="" width="100" height="100"/>
                    <div id="playername1" style="position: absolute; top: 110px; left: 30px;">
                        <font color="white"><%=users.get(0).getNickName()%></font>
                        <font color="white">status: <%=users.get(0).getHand().getStatus()%></font>
                        <font color="white">value: <%=users.get(0).getHand().getValue()%></font>
                        <font color="white">GameStatus: <%=users.get(0).getGameStatus()%></font>
                    </div>
                </div>
                <div id="balance1" style="position: absolute; top: 120px; left: 110px;">
                    <img src="/Blackjack_Groep3/rescources/icons/currency.jpg" alt="" width="80" height="60"/>
                    <font color="white"><%=users.get(0).getBalance()%></font>
                </div>
            </div>  

            <div id="player2" style="position: absolute; top: 300px; left: 300px;">
                <%                    
                    cards = users.get(1).getHand().getCards();
                    positionleft = 0;
                    for (Card c : cards) {

                        out.print("<div style='position: absolute; top: 0px; left: " + positionleft + "px'>");
                        out.print("<img src='" + c.getCardImage() + "' width='70' height='100'/>");
                        out.print("</div>");
                        positionleft += 20;
                    }

                %>


                <div id="selectbet2" style="position: absolute; top: 110px; left: 0px;">
                    <input type="number" name="bet2" step="1" <%="value='" + users.get(1).getBet() + "'"%> min="1" <%= "max='" + users.get(1).getBalance() + "'"%> style="width: 40px;">
                </div>             
                <div id="icon2" style="position: absolute; top: 150px; left: 0px;">
                    <img src="<%=users.get(1).getIcon().getLocation()%>" alt="" width="100" height="100"/>
                    <div id="playername2" style="position: absolute; top: 110px; left: 30px;">
                        <font color="white"><%=users.get(1).getNickName()%></font>
                        <font color="white">status: <%=users.get(1).getHand().getStatus()%></font>
                        <font color="white">value: <%=users.get(1).getHand().getValue()%></font>
                        <font color="white">GameStatus: <%=users.get(1).getGameStatus()%></font>
                    </div>
                </div>
                <div id="balance1" style="position: absolute; top: 120px; left: 110px;">
                    <img src="/Blackjack_Groep3/rescources/icons/currency.jpg" alt="" width="80" height="60"/>
                    <font color="white"><%=users.get(1).getBalance()%></font>
                </div>
            </div>  





            <div id="playbutton" style="position: absolute; top: 500px; left: 1200px;">
                <input type="image" src="/Blackjack_Groep3/rescources/icons/Yoda - 02.png" alt="submit" width="150" height="150">
                <font color="black"><%=turn%></font>
                <font color="blue"><%=userturn%></font>
            </div>

        </form>

        <%
            //vragen of de speler wil hitten of standen.

            String visibility = "";
            if (turn < 1 || userturn == 10) {
                visibility = "hidden";
            }
        %>


        <form action="/Blackjack_Groep3/PlayGameHitStandServlet">
            <div style="position: absolute; top: 80px; left: 160px; visibility:<%=visibility%>;">
                <img src="/Blackjack_Groep3/rescources/backgrounds/backgroundHitStand.jpg" alt="" width="300" height="150"/>
                <div style="position: absolute; top: 50px; left: 50px;">
                    <input type="text" name="user" value="<% if (userturn < 10) {
                            out.print(users.get(userturn).getNickName());
                        }%>" readonly>
                    <div style="position: absolute; top: 40px; left: 0px;">
                        <input type="submit" name="action" value="stand">
                        <input type="submit" name="action" value="hit">
                    </div>
                </div>

            </div>
        </form>






    </body>
</html>
