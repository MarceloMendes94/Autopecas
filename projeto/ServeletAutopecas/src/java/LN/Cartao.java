package LN;

import java.util.Date;

public class Cartao {
    private String numero;
    private String nomeTitular;
    private Date vencimento;
    private String Bandeira;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getBandeira() {
        return Bandeira;
    }

    public void setBandeira(String Bandeira) {
        this.Bandeira = Bandeira;
    }

    public Cartao(String numero, String nomeTitular, Date vencimento, String Bandeira) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.vencimento = vencimento;
        this.Bandeira = Bandeira;
    }
    
}
