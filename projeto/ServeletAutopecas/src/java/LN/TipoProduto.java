package LN;
public enum TipoProduto {
    BOBINA(1),
    REGULADOR(2),
    ROLMENTO(3),
    ROTOR(4),
    POLIA(5);
    private int cod;
    
    TipoProduto(int cod){
        this.cod= cod;
    }
    
    public int getCod(){
        return this.cod;
    }
}
