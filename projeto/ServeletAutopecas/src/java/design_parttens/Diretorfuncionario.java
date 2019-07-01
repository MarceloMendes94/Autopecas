package design_parttens;

import LN.Data;

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
    public Diretorfuncionario(int d1, int d2, int d3, int validado,String email, String senha,Data nascimento, String nomeCompleto, int dia, int mes, int ano){
        funcionario.criaCpf(d1, d2, d3, validado);
        funcionario.criaUser(email, senha);
        funcionario.criarData(dia, mes, ano);
        funcionario.criaFuncionario(nomeCompleto);
    }

    public BuilderFuncionario getFuncionario() {
        return funcionario;
    }
    
}
