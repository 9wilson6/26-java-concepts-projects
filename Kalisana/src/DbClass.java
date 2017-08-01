
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DbClass {
    private static Connection conn = null;
    public static Connection dbConn(){
    
    String url="JDBC:sqlite:teamstats.sqlite";
        try {
           Class.forName("org.sqlite.JDBC");
           conn=DriverManager.getConnection(url);
           return conn;
        } catch (SQLException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
