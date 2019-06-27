
package LN;

/**
 *
 * @author marcelo
 */
public class Rotor extends Produto{

    public Rotor(int numeroPeca, String altura, String largura, String comprimento,
                          String diamentroInterno, String diamentroExterno, float valor, float amperagem,
                          float voltagem,String nome,  String numeroOEM) {
        super.setNumeroPeca(numeroPeca);
        super.setAltura(altura);
        super.setLargura(largura);
        super.setComprimento(comprimento);
        super.setDiamentroExterno(diamentroExterno);
        super.setDiamentroInterno(diamentroInterno);
        super.setValor(valor);
        super.setAmperagem(amperagem);
        super.setVoltagem(voltagem);
    }

}