package DB;

import LN.Regulador;
import java.util.ArrayList;

public class ReguladorDAO extends BaseDAO {
    
    ArrayList<Regulador>  lista_regulador= new ArrayList<Regulador> ();
    public ReguladorDAO(){
    }
     public void inserirUm(){

    }
    public void carregarTodos(){
        String query="SELECT numeropeca, valor, altura, largura, comprimento, diamentro_interno,diamentro_externo, amperagem, voltagem, qte_sulcos, qte_polos, fk_fabricante, fk_tipo_produto FROM public.produto  WHERE  fk_tipo_produto==2;";       
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query);
    }
}
