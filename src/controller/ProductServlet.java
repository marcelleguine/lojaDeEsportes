package controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MessageBean;

/**
 *
 * @author marcelleguine
 */
@WebServlet(urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            ProductDAO p = new ProductDAO();
            
            int product_id = Integer.parseInt(request.getParameter("product_id"));
            
            String name = request.getParameter("nome-produto");
            double price = Double.parseDouble(request.getParameter("preco"));
            
            //Verifica se é produto novo (id == 0) ou não:
            if(product_id == 0) {
                if(p.insertIntoProducts(name, price)) {
                    request.setAttribute("userMessage", new MessageBean("sucesso", "O produto foi cadastrado com sucesso."));

                    String address = "/ViewProductsServlet";

                    RequestDispatcher dispatcher = request.getRequestDispatcher(address);

                    dispatcher.forward(request, response);
                } else{
                    out.print("Houve um erro inesperado ao incluir este produto.");
                }
            } else {
                if(p.editProduct(product_id,name, price)) {
                    request.setAttribute("userMessage", new MessageBean("sucesso", "O produto foi alterado com sucesso."));

                    String address = "/ViewProductsServlet";

                    RequestDispatcher dispatcher = request.getRequestDispatcher(address);

                    dispatcher.forward(request, response);
                } else{
                    out.print("Houve um erro inesperado ao editar este produto.");
                }
            }
            
            
            
            
        } catch(Exception e) { 
            request.setAttribute("userMessage", new MessageBean("erro", "Ocorreu um erro cadastrando este produto."));
            
            String address = "/ViewProductsServlet";
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
            
            dispatcher.forward(request, response);
        } finally {            
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
