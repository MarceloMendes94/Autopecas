package autopecas.dominio;
public class Bobina extends Produto implements FabricaProdutos{
    private int qte_polos;

    @Override
    public void CadastrarProduto(String tipo) {
        System.out.println("bobina");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
