package design_parttens;

import LN.Cpf;
import LN.Data;
import LN.Funcionario;
import LN.Usuario;
import java.util.Date;

public class BuilderFuncionario {
    private Cpf cpf;
    private Usuario user;
    private Funcionario funcionario;
    private Data nascimento;

    public void criaCpf(int d1, int d2, int d3, int validado) {
        this.cpf = new Cpf(d1, d2, d3, validado);
    }

    public void criaUser(String email, String senha) {
        this.user = new Usuario(email, senha);
    }

    public void criaFuncionario(String nomeCompleto) {
        this.funcionario = new Funcionario(nascimento, nomeCompleto, this.cpf, this.user);
    }
    
    public void criarData(int dia, int mes, int ano) {
        this.nascimento= new Data(dia, mes, ano);
    }
}
