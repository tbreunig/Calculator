/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab1.model.AreaOfSquare;
import lab1.model.AreaOfRectangle;

/**
 *
 * @author Tyler
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/calculatorController"})
public class CalculatorController extends HttpServlet {

    private static final String RESULT_PAGE = "labOne/labOneOutput.jsp";
    
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
        
            String action = request.getParameter("action");
            String squareLength = request.getParameter("lengthOfSquareSide");
            String recLength = request.getParameter("lengthOfRecSide");
            String recWidth = request.getParameter("widthOfRecSide");

            if (action.equalsIgnoreCase("calcSquare")) {
                AreaOfSquare aos = new AreaOfSquare(squareLength);
                double result = aos.calculateAreaOfSquare();
                request.setAttribute("result", result);
            
            } else if (action.equalsIgnoreCase("calcRectangle")) {
                AreaOfRectangle aor = new AreaOfRectangle(recLength, recWidth);
                double result = aor.calculateAreaOfRectangle();
                request.setAttribute("result", result);
            }

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
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
