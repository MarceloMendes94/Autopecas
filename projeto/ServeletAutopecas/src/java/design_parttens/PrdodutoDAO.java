package design_parttens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class PrdodutoDAO implements BaseDAO{

    @Override
    public ArrayList<Object> find() {
               Connection c;
        Statement stmt;
        ResultSet rs ;
        ResultSetMetaData rsmd ;
        ArrayList<Object> saida = null ;
        String query= "select * from cliente;";
        try{
            saida= new ArrayList<Object>();
            c       = DriverManager.getConnection("jdbc:postgresql://localhost:5432/autopecas","postgres","aluno");   
            System.out.println("Opened database successfully"); 
            stmt    = c.createStatement();
            rs      = stmt.executeQuery(query);
            rsmd    = rs.getMetaData();
            int numero_colunas;
            numero_colunas = rsmd.getColumnCount()+1;
            while (rs.next()) {
                String buffer_saida="";
                for (int i=1; i<numero_colunas; i++ ){
                    if (i==1){
                        buffer_saida = buffer_saida + rs.getString(i);
                    }else{
                        buffer_saida = buffer_saida +"," + rs.getString(i);
                    }   
                }if(!buffer_saida.isEmpty()){
                     saida.add(parseProduto(buffer_saida));
                }               
            }
            //fechando tudo
            rs.close(); stmt.close(); c.close();            
        }catch (Exception e) {
          System.err.println("meu erro "+e.getClass().getName() + ": " + e.getMessage());            
        }         
        return saida;   
    }

    @Override
    public void insert(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object velho, Object novo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String transform(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Object parseProduto(String values){
        System.out.println(values);
        
        
        
        return null; 
    }
    
}
