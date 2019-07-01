package LN;
import java.util.Calendar;

public class Funcionario extends Pessoa{

    public Funcionario(Calendar nascimento, String nomeCompleto, Cpf cpf, Usuario user) {
        super(nascimento, nomeCompleto, cpf, user);
    }
    
}