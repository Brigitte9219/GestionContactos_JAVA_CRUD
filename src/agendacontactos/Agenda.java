
package agendacontactos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Agenda {
    public void agregarContacto(Contacto contacto) {
        String insertQuery = "INSERT INTO contactos (nombre, telefono, correo) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(insertQuery)) {
            statement.setString(1, contacto.getNombre());
            statement.setString(2, contacto.getTelefono());
            statement.setString(3, contacto.getCorreo());
            statement.executeUpdate();
            System.out.println("Contacto agregado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el contacto.");
        }
    }

    public void consultarContacto(String nombre) {
        String selectQuery = "SELECT nombre, telefono, correo FROM contactos WHERE nombre = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(selectQuery)) {
            statement.setString(1, nombre);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                System.out.println("Nombre: " + result.getString("nombre"));
                System.out.println("Teléfono: " + result.getString("telefono"));
                System.out.println("Correo: " + result.getString("correo"));
            } else {
                System.out.println("Contacto no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al consultar el contacto.");
        }
    }

    public void actualizarContacto(String nombre, Contacto nuevoContacto) {
        String updateQuery = "UPDATE contactos SET nombre = ?, telefono = ?, correo = ? WHERE nombre = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(updateQuery)) {
            statement.setString(1, nuevoContacto.getNombre());
            statement.setString(2, nuevoContacto.getTelefono());
            statement.setString(3, nuevoContacto.getCorreo());
            statement.setString(4, nombre);
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Contacto actualizado correctamente.");
            } else {
                System.out.println("Contacto no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al actualizar el contacto.");
        }
    }

    public void eliminarContacto(String nombre) {
        String deleteQuery = "DELETE FROM contactos WHERE nombre = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(deleteQuery)) {
            statement.setString(1, nombre);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Contacto eliminado correctamente.");
            } else {
                System.out.println("Contacto no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar el contacto.");
        }
    }
}
