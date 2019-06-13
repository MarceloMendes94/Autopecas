package DB;

public class ConfigConn {
       private final String url      = "jdbc:postgresql://localhost:5432/autopecas";
       private final String user     = "postgres" ;
       private final String password = "aluno";

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }


}
