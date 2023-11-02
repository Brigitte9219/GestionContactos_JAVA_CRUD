
package agendacontactos;

//Definición de la clase Contacto
public class Contacto {
    
    //Definición de los atributos o variables de la clase
    private String nombre;
    private String telefono;
    private String correo;

    // Método constructor para inicializar los atributos
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y setters - Acceder y Modificar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
