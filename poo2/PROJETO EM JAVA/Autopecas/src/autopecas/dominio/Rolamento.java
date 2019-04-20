package autopecas.dominio;

public class Rolamento extends  Produto implements FabricaProdutos{


    @Override
    public void CadastrarProduto(String tipo) {
        System.out.println("rolamento");
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
