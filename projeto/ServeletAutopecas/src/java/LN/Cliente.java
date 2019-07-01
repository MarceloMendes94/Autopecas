package LN;

public class Cliente extends Pessoa{
    private Endereco endereco;

    public Cliente(Endereco endereco, Data nascimento, String nomeCompleto, Cpf cpf, Usuario user) {
        super(nascimento, nomeCompleto, cpf, user);
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }   
}
