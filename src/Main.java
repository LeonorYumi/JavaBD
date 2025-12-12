import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/almacen";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "SELECT * FROM usuarios_cliente";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("Datos de la tabla");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id")+ "|");
            System.out.print(resultSet.getString("nombre"));
            System.out.print(resultSet.getString("correo"));
            System.out.print(resultSet.getString("password"));
        }



        if (connection != null) {
            System.out.println("\nConexion exitosa");
            connection.close();
        } else{
            System.out.println("No se puede conectar con la base de datos");
        }
    }
}