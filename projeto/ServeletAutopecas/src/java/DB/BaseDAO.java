package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDAO {
    ConfigConn config = new ConfigConn();
    
    public synchronized ArrayList<String> select(String query){
        Connection c    = null;
        Statement stmt  = null;
        ResultSet rs    = null;
        ResultSetMetaData rsmd = null;
        ArrayList<String> saida = new ArrayList<String>();
        String dbDriver = "org.postgresql.Driver";
        try{
            Class.forName(dbDriver);
            c       = DriverManager.getConnection(config.getUrl(),config.getUser(),config.getPassword());   
            System.out.println("Opened database successfully"); 
            stmt    = c.createStatement();
            rs      = stmt.executeQuery(query);
            rsmd    = rs.getMetaData();
            int numero_colunas  = rsmd.getColumnCount()+1;
            while (rs.next()) {                
                saida.add(preparaString( numero_colunas , rs));
            }
            rs.close();
            stmt.close();
            c.close();     
        }catch (Exception e) {
          System.err.println("meu erro "+e.getClass().getName() + ": " + e.getMessage());            
        }
        
        return saida;
    }  
    public synchronized String update(String Query){
        return "";
    }
    public synchronized void teste(){
        Connection c = null;   
        try{
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "aluno");   
            System.out.println("Opened database successfully"); 
        }catch (Exception e) {
          System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
    }
    //processamento
    private String preparaString(int numero_colunas ,ResultSet rs) throws SQLException{
        String buffer_saida;
        buffer_saida = "";
        for (int i=1; i<numero_colunas; i++ ){
                    if (i==1){
                        buffer_saida = buffer_saida + rs.getString(i);
                    }else{
                        buffer_saida = buffer_saida +"," + rs.getString(i);
                    }   
                }
        return buffer_saida;
        
    }
}