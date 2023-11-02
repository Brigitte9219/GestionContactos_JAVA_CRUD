
package agendacontactos;

import java.sql.*;

public class ConexionBD {
    
    private static Connection conexion = null;

    public static Connection obtenerConexion() {
        if (conexion == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/agenda";
                String usuario = "root";
                String contraseña = "";
                conexion = DriverManager.getConnection(url, usuario, contraseña);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return conexion;
    }
}
