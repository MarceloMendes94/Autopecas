package LN;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date nascimento;
    private final Cpf cpf;

    public Pessoa(String nome, Date nascimento, Cpf cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

   
}
