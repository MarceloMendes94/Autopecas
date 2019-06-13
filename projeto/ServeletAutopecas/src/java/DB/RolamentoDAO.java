package DB;

import LN.Rolamento;
import java.util.ArrayList;

public class RolamentoDAO extends BaseDAO {
    
    ArrayList<Rolamento>  lista_rolamento= new ArrayList<Rolamento> ();
    public RolamentoDAO(){
    }
     public void inserirUm(){
        
    }
    public void carregarTodos(){
        String query="SELECT numeropeca, valor, altura,largura, comprimento, diamentro_interno,diamentro_externo, amperagem, voltagem, qte_sulcos, qte_polos, fk_fabricante, fk_tipo_produto FROM public.produto  WHERE  fk_tipo_produto==4;";
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query);
    }
}
