package design_parttens;

import DB.BobinaDAO;
import LN.Bobina;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TemplateBobina extends TemplateFrontEnd{
    public BobinaDAO bobinaDAO;
    public ArrayList<Bobina> lista_bobina_local; 
    public TemplateBobina() {
        bobinaDAO=new BobinaDAO();
        bobinaDAO.carregarTodos();
        lista_bobina_local = bobinaDAO.lista_bobina;
    }
    public String baseDesign() {
        String saida="";
        try {
            FileReader arq = new FileReader("/home/marcelo/Documentos/Autopecas/projeto/ServeletAutopecas/src/java/design_parttens/base.html");
            BufferedReader lerArq = new BufferedReader(arq); 
            String linha = lerArq.readLine();
            while (linha != null) {
                saida=saida + linha;
                linha = lerArq.readLine();             
            } 
        arq.close();
        }catch (IOException e) {  System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());    }        
        return saida;
    }
    public String cartao(String preco, String dimensoes){
        String cartao="";
        cartao=cartao   +"<div class=\"col-md-4\">"
                        +"<div class=\"card\">"
                        +"<div class=\"card-body\">"
                        +"<h1> foto </h1>"
                        +"<h1> <i class=\"fas fa-shopping-cart\"></i> "+preco+" </h1>"
                        +"<h5> "+dimensoes+"<h5>"
                        +"</div> </div> </div>";
        return cartao;         
    }

    public ArrayList<Bobina> getLista_bobina_local() {
        return lista_bobina_local;
    }
    
}
