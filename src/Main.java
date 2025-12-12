import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/almacen";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);

        if (connection != null) {
            System.out.println("Conexion exitosa");
            connection.close();
        } else{
            System.out.println("No se puede conectar con la base de datos");
        }
    }
}