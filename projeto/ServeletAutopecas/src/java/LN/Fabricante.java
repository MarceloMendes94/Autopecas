package LN;

public class Fabricante {
    private String nome;
    private String oem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public Fabricante(String nome, String oem) {
        this.nome = nome;
        this.oem = oem;
    }
    
}
