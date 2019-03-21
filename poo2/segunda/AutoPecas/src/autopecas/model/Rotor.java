package autopecas.model;
public class  Rotor extends Produto {
   private int amperagem;
   private int diametro;
   private String modelo;
   private int voltagem;

    public int getAmperagem() {
        return amperagem;
    }

    public void setAmperagem(int amperagem) {
        this.amperagem = amperagem;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
   
   
   
}
