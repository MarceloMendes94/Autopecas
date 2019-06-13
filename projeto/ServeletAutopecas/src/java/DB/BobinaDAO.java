package DB;
import LN.Bobina;
import java.util.ArrayList;

public class BobinaDAO extends BaseDAO{
    ArrayList<Bobina> lista_bobina   = new ArrayList<Bobina> ();
    public BobinaDAO(){
        
    }
    public void inserirUm(){
        
    }
    public void carregarTodos(){
        String query ="SELECT numeropeca, valor, altura,largura, comprimento, diamentro_interno,diamentro_externo, amperagem, voltagem, qte_sulcos,qte_polos, fk_fabricante, fk_tipo_produto FROM public.produto  WHERE  fk_tipo_produto==1;";   
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query);
    }
    
}
