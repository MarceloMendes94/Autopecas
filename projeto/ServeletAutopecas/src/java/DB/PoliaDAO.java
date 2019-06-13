package DB;
import LN.Polia;
import java.util.ArrayList;

public class PoliaDAO extends BaseDAO{    
    ArrayList<Polia> lista_polia = new ArrayList<Polia> ();
    public PoliaDAO(){
        
    }
    public void inserirUm(){
        
    }
    public void carregarTodos(){
        String query="SELECT numeropeca, valor, altura,largura, comprimento, diamentro_interno,diamentro_externo, amperagem, voltagem, qte_sulcos,qte_polos, fk_fabricante, fk_tipo_produto FROM public.produto  WHERE  fk_tipo_produto==5;";
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query);
    }
        
}
