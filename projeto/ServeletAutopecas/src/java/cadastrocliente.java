/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcelo
 */
public class cadastrocliente extends HttpServlet {

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
            //pegando parametros
            String cpf= request.getParameter("cpf");
            String nome= request.getParameter("nome");
            String logradouro= request.getParameter("logradouro");
            String cep= request.getParameter("cep");
            String numerocasa= request.getParameter("numerocasa");
            String complemento= request.getParameter("complemento");
            String referencia= request.getParameter("referencia");
            String nascimento= request.getParameter("nascimento");
            String numerocartao= request.getParameter("numerocartao");
            String nometitular= request.getParameter("nometitular");
            String vencimento= request.getParameter("vencimento");
            String bandeira= request.getParameter("bandeira");
            String email= request.getParameter("email");
            String senha1= request.getParameter("senha1");
            String senha2= request.getParameter("senha2");
            
            //log do sistma
            System.out.println(cpf+"\n"+nome+"\n"+logradouro+"\n"+cep+"\n"+numerocasa+"\n"+complemento+"\n"+referencia);
            System.out.println(nascimento+"\n"+numerocartao+"\n"+nometitular+"\n"+vencimento+"\n"+bandeira);
            System.out.println(email);
            System.out.println(senha1);
            System.out.println(senha2);
            
            response.sendRedirect("view/mostrarprodutos.html");
            
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
