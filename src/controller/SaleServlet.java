/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SaleDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.MessageBean;
import model.UserBean;

/**
 *
 * @author Pedro
 */
public class SaleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            SaleDAO sal = new SaleDAO();
            HttpSession s = request.getSession();
            
            int productId = Integer.parseInt(request.getParameter("prod-name"));
            double unitPrice = Double.parseDouble(request.getParameter("price"));
            int qnt = Integer.parseInt(request.getParameter("quantidade"));
            UserBean user = (UserBean)s.getAttribute("logged_user");
            int userId = user.getId();
            String message = sal.insertIntoSales(productId, userId, unitPrice, qnt);
            String[] messages = message.split(";");
            if(!message.equals("")) {
                request.setAttribute("userMessage", new MessageBean(messages[0], messages[1]));

                String address = "/ViewSalesServlet";

                RequestDispatcher dispatcher = request.getRequestDispatcher(address);

                dispatcher.forward(request, response);
            } else {
                request.setAttribute("userMessage", new MessageBean(messages[0], messages[1]));

                String address = "/ViewSalesServlet";

                RequestDispatcher dispatcher = request.getRequestDispatcher(address);

                dispatcher.forward(request, response);
            }
            
        } catch(Exception e) {
            request.setAttribute("userMessage", new MessageBean("erro", "Erro ao realizar venda."));

            String address = "/ViewSalesServlet";

            RequestDispatcher dispatcher = request.getRequestDispatcher(address);

            dispatcher.forward(request, response);
        }finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
