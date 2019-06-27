package view;
import DB.BobinaDAO;
import design_parttens.TemplateBobina;
import design_parttens.TemplateFrontEnd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bobina extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");   
        try (PrintWriter out = response.getWriter()) {            
            TemplateBobina bobina=new TemplateBobina();
            out.println( bobina.baseDesign());
            out.println("<div class=\"container\">");
            for (int i=0;i< bobina.getLista_bobina_local().size();i+=2){
                if  (   bobina.getLista_bobina_local().get(i)  != null && 
                        bobina.getLista_bobina_local().get(i+1)!= null &&
                        bobina.getLista_bobina_local().get(i+2)!= null){
                    
                    out.println("<div class=\"row\">");
                    //coluna 1
                    String preco= String.valueOf(bobina.getLista_bobina_local().get(i).getValor());
                    String dim="";
                    dim=dim+bobina.getLista_bobina_local().get(i).getAltura()     + " x ";
                    dim=dim+bobina.getLista_bobina_local().get(i).getComprimento()+ " x ";
                    dim=dim+bobina.getLista_bobina_local().get(i).getLargura()    ;
                    out.println( bobina.cartao(preco,dim));
                    
                    //coluna 2                    
                    preco= String.valueOf(bobina.getLista_bobina_local().get(i+1).getValor());
                    dim="";
                    dim=dim+bobina.getLista_bobina_local().get(i+1).getAltura()     + " x ";
                    dim=dim+bobina.getLista_bobina_local().get(i+1).getComprimento()+ " x ";
                    dim=dim+bobina.getLista_bobina_local().get(i+1).getLargura()    ;
                    out.println( bobina.cartao(preco,dim));
                    
                    //coluna 3                   
                    preco= String.valueOf(bobina.getLista_bobina_local().get(i+2).getValor());
                    dim="";
                    dim=dim+bobina.getLista_bobina_local().get(i+2).getAltura()     + " x ";
                    dim=dim+bobina.getLista_bobina_local().get(i+2).getComprimento()+ " x ";
                    dim=dim+bobina.getLista_bobina_local().get(i+2).getLargura()    ;
                    out.println( bobina.cartao(preco,dim));
                    
                    out.println("</div>");
                    out.println("<br>"); 
                }
            } 
            out.println("</div>");
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
