package controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
            UserDAO u = new UserDAO();
            
            int user_id = Integer.parseInt(request.getParameter("user_id"));
            
            String login = request.getParameter("login-usuario");
            String password = request.getParameter("password-usuario");
            String name = request.getParameter("nome-usuario");
            String cpf = request.getParameter("cpf");
            double salary = Double.parseDouble(request.getParameter("salario"));
            String dataNascimento = request.getParameter("data-nascimento");
            String email = request.getParameter("email");
            
            //Verifica se é produto novo (id == 0) ou não:
            if(user_id == 0) {
                if(u.insertIntoUser(login, password, name, cpf, salary, dataNascimento, email)) {
                    request.setAttribute("userMessage", new MessageBean("sucesso", "Funcionário cadastrado com sucesso."));

                    String address = "/ViewUsersServlet";

                    RequestDispatcher dispatcher = request.getRequestDispatcher(address);

                    dispatcher.forward(request, response);
                } else{
                    out.print("Houve um erro inesperado ao incluir este funcionário.");
                }
            } else {
                if(u.editUser(user_id,login, password ,name, cpf, salary, dataNascimento, email)) {
                    request.setAttribute("userMessage", new MessageBean("sucesso", "Informações do funcionário alteradas com sucesso."));

                    String address = "/ViewUsersServlet";

                    RequestDispatcher dispatcher = request.getRequestDispatcher(address);

                    dispatcher.forward(request, response);
                } else{
                    out.print("Houve um erro inesperado ao editar este funcionário.");
                }
            }
        } catch(Exception e) {
            request.setAttribute("userMessage", new MessageBean("erro", "Houve um erro ao cadastradar este funcionário."));

            String address = "/ViewUsersServlet";

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
