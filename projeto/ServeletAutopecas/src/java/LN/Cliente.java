package LN;

import java.util.Date;

public class Cliente extends Pessoa{
    private Cartao card;
    private Endereco end;

    public Cliente(Cartao card, Endereco end, String nome, Date nascimento, Cpf cpf, String email, String senha) {
        super(nome, nascimento, cpf, email, senha);
        this.card = card;
        this.end = end;
    }
}
