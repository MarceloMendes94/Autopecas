package design_parttens;

import java.util.Calendar;
import java.util.Date;

public class Diretorfuncionario {
    private BuilderFuncionario funcionario = new BuilderFuncionario();
    
    /**
     * criar CPF
     * @param d1
     * @param d2
     * @param d3
     * @param validado
     * criar usuario
     * @param email
     * @param senha
     * criar Funcionario
     * @param nascimento
     * @param nomeCompleto 
     */
    public Diretorfuncionario(int d1, int d2, int d3, int validado,String email, String senha,Calendar nascimento, String nomeCompleto){
        funcionario.criaCpf(d1, d2, d3, validado);
        funcionario.criaUser(email, senha);
        funcionario.criaFuncionario(nascimento, nomeCompleto);
    }

    public BuilderFuncionario getFuncionario() {
        return funcionario;
    }
    
}
