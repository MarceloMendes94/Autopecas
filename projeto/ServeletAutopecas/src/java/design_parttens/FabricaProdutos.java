package design_parttens;

import LN.Bobina;
import LN.Polia;
import LN.Regulador;
import LN.Rolamento;
import LN.Rotor;
import DB.BobinaDAO;
import DB.PoliaDAO;
import DB.ReguladorDAO;
import DB.RolamentoDAO;
import DB.RotorDAO;


public class FabricaProdutos {
    BobinaDAO       bobinaDao   = new BobinaDAO(); 
    PoliaDAO        poliaDao    = new PoliaDAO();
    ReguladorDAO    reguladorDao= new ReguladorDAO();
    RolamentoDAO    rolamentoDao= new RolamentoDAO(); 
    RotorDAO        rotorDao    = new RotorDAO();
   
   
   public void criarProduto(int numeroPeca, String altura, String largura, String comprimento, String diamentroInterno, String diamentroExterno, float valor, float amperagem, float voltagem, int qte_polos, int qte_sulcos,String nome,  String numeroOEM, String nomeProduto ){
    
    if(nomeProduto.equals("bobina")){
       Bobina bobina = new Bobina(numeroPeca,altura, largura, comprimento, diamentroInterno, diamentroExterno,valor, amperagem, voltagem, qte_polos, nome,numeroOEM);
       bobinaDao.inserirUm();

    }
    else if(nomeProduto.equals("regulador")){
        Regulador regulador = new Regulador( numeroPeca,  altura,  largura,  comprimento, diamentroInterno,diamentroExterno,  valor,  amperagem, voltagem, nome,   numeroOEM);
        reguladorDao.inserirUm();
   
        
    }else if(nomeProduto.equals("rolamento")){
        Rolamento rolamento = new Rolamento( numeroPeca, altura, largura, comprimento, diamentroInterno,diamentroExterno,  valor, amperagem,voltagem,  nome, numeroOEM);
        rolamentoDao.inserirUm();
   
        
    }else if(nomeProduto.equals("rotor")){
        Rotor rotor = new Rotor( numeroPeca,  altura,  largura,  comprimento, diamentroInterno, diamentroExterno,valor, amperagem,voltagem, nome, numeroOEM);
        rotorDao.inserirUm();
        
    }else if(nomeProduto.equals("polia")){
        Polia polia = new Polia(numeroPeca,altura, largura, comprimento, diamentroInterno, diamentroExterno, valor,amperagem, voltagem, qte_sulcos, nome, numeroOEM);
        poliaDao.inserirUm();
    }
    else{
        System.out.println("operação invalida");
    }
   }
}
