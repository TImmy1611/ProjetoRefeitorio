package projetorefeitorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LigaBD {
    public static Connection ligacao(){
        String url= "jdbc:mysql://localhost:3306/dbcantina?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password= "";
        Connection liga = null;
        try {
            liga=DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            System.out.println("Erro na tentativa de ligação à base de dados");
        }
        return liga;
    }
}
