package autopecas.dominio;

public class GerarProduto {
    public static FabricaProdutos cadastro(String tipo){
        
        FabricaProdutos novo_produto= null;
        if(tipo.equalsIgnoreCase("polia")){
            novo_produto = new Polia();
            novo_produto.CadastrarProduto(tipo);
        }
        else if(tipo.equalsIgnoreCase("rotor")){
            novo_produto = new Rotor();
            novo_produto.CadastrarProduto(tipo);
        }
        else if (tipo.equalsIgnoreCase("regulador") ){
            novo_produto = new Regulador();
            novo_produto.CadastrarProduto(tipo);
        }
        else if (tipo.equalsIgnoreCase("rolamento")){
            novo_produto = new Rolamento();
            novo_produto.CadastrarProduto(tipo);
        }
        else if (tipo.equalsIgnoreCase("bobina")){
            novo_produto = new Bobina();
            novo_produto.CadastrarProduto(tipo);
        }
        
        
        
        
        
        return novo_produto;
    }
}
