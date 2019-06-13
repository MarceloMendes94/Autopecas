package DB;

import java.util.ArrayList;

public class ClienteDAO extends BaseDAO{
    String query="SELECT cpf, nome, nascimento, email, senha, logradouro, cep, numero, complemento, referencia FROM Cliente;";
    public ClienteDAO(){
        ArrayList<String> dados= new ArrayList<String>() ;
        dados=select(query);
        System.out.println(dados);
    }
 
}
