package DB;
import LN.Bobina;
import java.util.ArrayList;

public class BobinaDAO extends BaseDAO{
    public ArrayList<Bobina> lista_bobina   = new ArrayList<Bobina> ();
    private String  query_carregamento = "SELECT numeropeca, valor, altura,largura, comprimento, diamentro_interno,diamentro_externo, amperagem, voltagem, qte_sulcos,qte_polos, fk_fabricante, fk_tipo_produto FROM public.produto  WHERE  fk_tipo_produto=1;"; 
    
    public BobinaDAO(){
        
    }
    public void inserirUm(){
        
    }
    public void carregarTodos(){        
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query_carregamento);        
        for (int i=0 ; i<dados.size() ; i++){
            //System.out.println(dados.get(i));
            String frase = dados.get(i);
            String array[] = new String[14];
            array = frase.split(",");
            Bobina  b;         
            b = new Bobina(Integer.parseInt(array[0]), array[2],array[3], array[4] , array[5], array[6],Float.parseFloat(array[1]), Float.parseFloat(array[7]), Float.parseFloat(array[8]), Integer.parseInt(array[10]), "teste", "teste");
            lista_bobina.add(b);
        }
    }
    
}
