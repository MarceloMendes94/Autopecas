package autopecas.model;
public class Bobina extends Produto {
    private int amperagem;
    private int diametro_interno;
    private String dimensoes;
    private int qte_polos;

    public int getAmperagem() {
        return amperagem;
    }

    public void setAmperagem(int amperagem) {
        this.amperagem = amperagem;
    }

    public int getDiametro_interno() {
        return diametro_interno;
    }

    public void setDiametro_interno(int diametro_interno) {
        this.diametro_interno = diametro_interno;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public int getQte_polos() {
        return qte_polos;
    }

    public void setQte_polos(int qte_polos) {
        this.qte_polos = qte_polos;
    }
    
    
}
