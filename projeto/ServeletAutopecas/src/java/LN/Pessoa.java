package LN;

public class Pessoa {
    private Data nascimento;
    private String nomeCompleto;
    private Cpf cpf;
    private Usuario user;

    public Pessoa(Data nascimento, String nomeCompleto, Cpf cpf, Usuario user) {
        this.nascimento = nascimento;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.user = user;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
       
    
}
