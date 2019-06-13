package design_parttens;

import java.util.Date;

public class DiretorCliente {
    private  BuilderCliente cliente = new BuilderCliente();
    public DiretorCliente(int primeiro, int segundo, int terceiro, int verificador,String logradouro, String cep, String numero, String complemento, String referencia,String numeroc, String nomeTitular, Date vencimento, String Bandeira,String email,String senha, String nome, Date nascimento){
    // criar um CPF
    cliente.criarCpf( primeiro,  segundo,  terceiro, verificador);
    //Criar um endereço
    cliente.criarEndereco(logradouro, cep, numero, complemento, referencia);
    //Criar cartão
    cliente.criarCartao(numeroc, nomeTitular, vencimento, Bandeira);
    //Criar um cliente (email, Pessoa, Endereço ) 
    cliente.criarCliente(  nome,  nascimento, email,  senha);
    }
   
}
