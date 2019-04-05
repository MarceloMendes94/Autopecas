
package teste_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author marcelo
 */
public class TesteRede {
        public synchronized ArrayList selectTable() {
            String comando="select nome from funcionario;";    
            ArrayList listResult = new ArrayList();        
            Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.postgresql.Driver");

                c = DriverManager.getConnection("jdbc:postgresql://stampy.db.elephantsql.com:5432/pvunmqpv","pvunmqpv", "rX3CKCsGeqAIlEut5W2HeMxF8f-uyYNA");   
                System.out.println("Opened database successfully");            
                stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery(comando);

                while (rs.next()) {
                    System.out.println(" reusltado");
                    listResult.add(rs);
                }
                //System.out.println("--------------");
                rs.close();
                stmt.close();
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());            
            }
            System.out.println("Operation done successfully select");
            return listResult;
        }
}



