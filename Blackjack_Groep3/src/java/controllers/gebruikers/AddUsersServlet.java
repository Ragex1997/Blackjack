/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.gebruikers;

import databank.services.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Anthony Lannoote
 */
public class AddUsersServlet extends HttpServlet {

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

            UserService userService = new UserService();
            HttpSession session = request.getSession();

            //Controleren of er al users zijn toegevoegd
            List<User> usersForGame;
            if ((List<User>) session.getAttribute("usersForGame") == null) {
                usersForGame = new ArrayList<User>();
            } else {
                usersForGame = (List<User>) session.getAttribute("usersForGame");
            }

            String nickName = request.getParameter("user");

            //Ervoor zorgen dat je niet meer dan 4 spelers kan hebben
            if (usersForGame.size() < 4) {
                usersForGame.add(userService.getUserByNickName(nickName));
            }

            List<User> usersChoice = userService.getListOfUsers(true);

            //Het verwijderen van de users die al geselecteerd zijn
            //Om een of andere reden werkte het niet om die met de LIST.removeAll(); methode te doen?
            Iterator<User> it = usersChoice.iterator();
            while (it.hasNext()) {
                User user = it.next();

                for (User u : usersForGame) {
                    if (user.getNickName().equals(u.getNickName())) {
                        it.remove();
                    }
                }
            }

            session.setAttribute("usersChoice", usersChoice);
            session.setAttribute("usersForGame", usersForGame);
            request.setAttribute("selected", "yes");
            RequestDispatcher view = request.getRequestDispatcher("/game/userselection.jsp");
            view.forward(request, response);

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
