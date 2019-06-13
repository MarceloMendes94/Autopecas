package LN;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date nascimento;
    private final Cpf cpf;
    private String email;
    private String senha;

    public Pessoa(String nome, Date nascimento, Cpf cpf ,String email ,String senha) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

   
}
