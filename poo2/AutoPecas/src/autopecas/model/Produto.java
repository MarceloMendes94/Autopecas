package autopecas.model;

public  abstract class Produto {
    private int numero_OEM;
    private String marca;
    private String modelo;
    private String numero_peca;
    private float valor;

    public int getNumero_OEM() {
        return numero_OEM;
    }

    public void setNumero_OEM(int numero_OEM) {
        this.numero_OEM = numero_OEM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero_peca() {
        return numero_peca;
    }

    public void setNumero_peca(String numero_peca) {
        this.numero_peca = numero_peca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
