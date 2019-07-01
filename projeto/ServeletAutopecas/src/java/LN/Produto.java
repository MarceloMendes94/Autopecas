package LN;
public class Produto {
    private String altura;
    private String largura;
    private String comprimento;
    private String diametro_interno;
    private String diametro_externo;
    private float valor;
    private float amperagem;
    private float tensao;
    private Fabricante fabricante;
    private TipoProduto tipo;

    public Produto(String altura, String largura, String comprimento, String diametro_interno, String diametro_externo, float valor, float amperagem, float tensao, Fabricante fabricante, TipoProduto tipo) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.diametro_interno = diametro_interno;
        this.diametro_externo = diametro_externo;
        this.valor = valor;
        this.amperagem = amperagem;
        this.tensao = tensao;
        this.fabricante = fabricante;
        this.tipo = tipo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getDiametro_interno() {
        return diametro_interno;
    }

    public void setDiametro_interno(String diametro_interno) {
        this.diametro_interno = diametro_interno;
    }

    public String getDiametro_externo() {
        return diametro_externo;
    }

    public void setDiametro_externo(String diametro_externo) {
        this.diametro_externo = diametro_externo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getAmperagem() {
        return amperagem;
    }

    public void setAmperagem(float amperagem) {
        this.amperagem = amperagem;
    }

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }
    
    
}
