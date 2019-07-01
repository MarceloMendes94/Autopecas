
package design_parttens;

import LN.Fabricante;
import LN.Produto;
import LN.TipoProduto;

public class FabricaAbsProdutos implements ProdutosEcomerce{
    private Fabricante fabricante;
    private Produto produto;
    
    @Override
    public void criarFabricante(String nome, String oem) {
        this.fabricante= new Fabricante(nome, oem);              
    }

    @Override
    public void criarProduto(String altura, String largura, String comprimento, String diametro_interno, String diametro_externo, float valor, float amperagem, float tensao, Fabricante fabricante, TipoProduto tipo) {
        this.produto = new Produto(altura, largura, comprimento, diametro_interno, diametro_externo, valor, amperagem, tensao, fabricante, tipo);
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public Produto getProduto() {
        return this.produto;
    }
    
    
}
