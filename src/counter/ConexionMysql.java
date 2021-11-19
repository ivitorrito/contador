package counter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {

    String url = "jdbc:mysql://localhost:3306/controlcopias";
    String user = "ivan", pass = "1234";
    Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
}
