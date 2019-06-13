package design_parttens;

import LN.Cartao;
import LN.Cliente;
import LN.Cpf;
import LN.Endereco;
import java.util.Date;

public class BuilderCliente {
    private Cliente cliente;
    private Cpf cpf;
    private Endereco end;
    private Cartao card;
    
    public void criarCpf(int primeiro, int segundo, int terceiro, int verificador){
        this.cpf= new Cpf( primeiro,  segundo, terceiro, verificador);
    }
    public void criarEndereco(String logradouro, String cep, String numero, String complemento, String referencia){
        this.end = new Endereco(logradouro,cep,numero,complemento,referencia);
    }
    public void criarCartao(String numeroc, String nomeTitular, Date vencimento, String Bandeira){
        this.card = new Cartao(numeroc, nomeTitular, vencimento, Bandeira);
    }
    public void criarCliente( String nome, Date nascimento, String email, String senha){
        this.cliente= new Cliente( card,  end, nome, nascimento, cpf,email,senha);
    }
    
}
