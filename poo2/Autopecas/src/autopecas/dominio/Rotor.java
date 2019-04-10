package autopecas.dominio;
public class Rotor extends Produto implements FabricaProdutos{

    @Override
    public void CadastrarProduto(String tipo) {
        System.out.println("rotor");
        throw new UnsupportedOperationException("Not supported yet."); 
    }
       
}
