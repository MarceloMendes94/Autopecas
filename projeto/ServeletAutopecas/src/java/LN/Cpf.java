package LN;
public class Cpf {
    private int d1;
    private int d2;
    private int d3;
    private int validador;

    public Cpf(int d1, int d2, int d3, int validador) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.validador = validador;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getD3() {
        return d3;
    }

    public void setD3(int d3) {
        this.d3 = d3;
    }

    public int getValidador() {
        return validador;
    }

    public void setValidador(int validador) {
        this.validador = validador;
    }
    
    
    
}
