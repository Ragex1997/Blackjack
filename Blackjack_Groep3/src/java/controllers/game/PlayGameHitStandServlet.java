/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.game;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Game;

/**
 *
 * @author Anthony Lannoote
 */
public class PlayGameHitStandServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();
            Game game = (Game) session.getAttribute("game");

            //Ik heb voor iedere mogelijkheid van de hoeveelheid spelers een jsp pagina gemaakt
            //Want anders ging ik moeten mijn html code in scriptlet code zetten wat wss nog onoverzichtelijker zou zijn
            RequestDispatcher view;
//            switch (game.getUsers().size()) {
//                case 1:
//                    view = request.getRequestDispatcher("/game/game1p.jsp");
//                    view.forward(request, response);
//                    break;
//                case 2:
//                    view = request.getRequestDispatcher("/game/game1p.jsp");
//                    view.forward(request, response);
//                    break;
//                case 3:
//                    view = request.getRequestDispatcher("/game/game3p.jsp");
//                    view.forward(request, response);
//                    break;
//                case 4:
//                    view = request.getRequestDispatcher("/game/game4p.jsp");
//                    view.forward(request, response);
//                    break;
//            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
