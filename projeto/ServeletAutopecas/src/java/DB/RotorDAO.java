package DB;

import LN.Rotor;
import java.util.ArrayList;

public class RotorDAO extends BaseDAO{
    
    ArrayList<Rotor>      lista_rotor    = new ArrayList<Rotor> ();
    public RotorDAO(){
    }
     public void inserirUm(){

    }
    public void carregarTodos(){
        String query="SELECT numeropeca, valor, altura,largura, comprimento, diamentro_interno,diamentro_externo, amperagem, voltagem, qte_sulcos,qte_polos, fk_fabricante, fk_tipo_produto FROM public.produto  WHERE  fk_tipo_produto==3;";
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query);
    }
}
