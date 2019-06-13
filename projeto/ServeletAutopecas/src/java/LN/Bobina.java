package LN;
public class Bobina extends Produto{
    int qte_polos;

    public int getQte_polos() {
        return qte_polos;
    }

    public void setQte_polos(int qte_polos) {
        this.qte_polos = qte_polos;
    }
     
    public  Bobina(int numeroPeca, String altura, String largura, String comprimento, String diamentroInterno, String diamentroExterno, float valor, float amperagem, float voltagem, int qte_polos, String nome, String numeroOEM) {
        super.setNumeroPeca(numeroPeca);
        super.setAltura(altura);
        super.setLargura(largura);
        super.setComprimento(comprimento);
        super.setDiamentroExterno(diamentroExterno);
        super.setDiamentroInterno(diamentroInterno);
        super.setValor(valor);
        super.setAmperagem(amperagem);
        super.setVoltagem(voltagem);
        setQte_polos(qte_polos);
    }
   
}
