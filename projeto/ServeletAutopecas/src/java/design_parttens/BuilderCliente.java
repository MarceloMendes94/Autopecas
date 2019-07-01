package design_parttens;

import LN.Cliente;
import LN.Cpf;
import LN.Data;
import LN.Endereco;
import LN.Usuario;


public class BuilderCliente {
    private Cpf cpf;
    private Usuario user;
    private Data nascimento;
    private Endereco endereco;
    private Cliente cliente;
    //receita
    public void criarCpf(int primeiro, int segundo, int terceiro, int verificador){
        this.cpf= new Cpf( primeiro,  segundo, terceiro, verificador);
    }
    public void criarUsuario(String email, String senha) {
        this.user= new Usuario(email, senha);
    }
    public void criarEndereco(String logradouro, int cep, String numero, String complemento, String referencia){
        this.endereco= new Endereco(logradouro, cep, numero, complemento, referencia);
    }
    public void criarData(int dia, int mes, int ano) {
        this.nascimento= new Data(dia, mes, ano);
    }
    
    public void criarCliente( String nomeCompleto){
        this.cliente = new Cliente(endereco, nascimento, nomeCompleto, cpf, user);
    }
    //getters

    public Cpf getCpf() {
        return cpf;
    }

    public Usuario getUser() {
        return user;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

}
