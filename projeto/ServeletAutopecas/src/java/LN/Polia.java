/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LN;

/**
 *
 * @author marcelo
 */
public class Polia extends Produto {
    int qte_sulcos;

    public Polia(int numeroPeca, String altura, String largura, String comprimento,
                          String diamentroInterno, String diamentroExterno, float valor, float amperagem,
                          float voltagem, int qte_sulcos,String nome,  String numeroOEM) {
        super.setNumeroPeca(numeroPeca);
        super.setAltura(altura);
        super.setLargura(largura);
        super.setComprimento(comprimento);
        super.setDiamentroExterno(diamentroExterno);
        super.setDiamentroInterno(diamentroInterno);
        super.setValor(valor);
        super.setAmperagem(amperagem);
        super.setVoltagem(voltagem);
        setQte_sulcos(qte_sulcos);
    }

    public int getQte_sulcos() {
        return qte_sulcos;
    }

    public void setQte_sulcos(int qte_sulcos) {
        this.qte_sulcos = qte_sulcos;
    }

  
    
}
