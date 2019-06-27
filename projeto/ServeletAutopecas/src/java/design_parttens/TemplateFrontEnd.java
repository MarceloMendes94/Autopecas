package design_parttens;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class TemplateFrontEnd { 
       
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
                        +"<h1> Preço </h1>"
                        +"<h3> dimesoes<h3>"
                        +"</div> </div> </div>";
        return cartao;
        
    }
}
