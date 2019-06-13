package LN;

import java.util.Date;

public class Cliente extends Pessoa{
    String email;
    Cartao card;
    Endereco end;

    public Cliente(String email, Cartao card, Endereco end, String nome, Date nascimento, Cpf cpf) {
        super(nome, nascimento, cpf);
        this.email = email;
        this.card = card;
        this.end = end;
    }   
    
    
}
