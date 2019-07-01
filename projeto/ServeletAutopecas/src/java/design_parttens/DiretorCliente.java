package design_parttens;

public class DiretorCliente {
    private final BuilderCliente buildercliente = new BuilderCliente();    

    public BuilderCliente getBuildercliente() {
        return buildercliente;
    }  
    /**
     * cria um Cpf com 
     * @param primeiro
     * @param segundo
     * @param terceiro
     * @param verificador
     * cria um Usuario
     * @param email
     * @param senha     
     * cria um  endereco
     * @param numero 
     * @param complemento 
     * @param referencia
     * @param logradouro 
     * @param cep       
     * objeto Usario
     * @param nomeCompleto
     * @param dia
     * @param mes
     * @param ano
     * 
     * 
     */
    public DiretorCliente (int primeiro, int segundo, int terceiro, int verificador, String email, String senha ,String logradouro, int cep, String numero, String complemento, String referencia, String nomeCompleto,int dia, int mes,int  ano){
        buildercliente.criarCpf(primeiro, segundo, terceiro, verificador);
        buildercliente.criarUsuario(email, senha);
        buildercliente.criarEndereco(logradouro, cep, numero, complemento, referencia);
        buildercliente.criarData(dia, mes, ano);
        buildercliente.criarCliente( nomeCompleto);        
    }
        
}
