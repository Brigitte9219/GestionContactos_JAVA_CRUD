
package agendacontactos;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
  
    private List<Contacto> contactos = new ArrayList<>();

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void consultarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println("Nombre: " + contacto.getNombre());
                System.out.println("Teléfono: " + contacto.getTelefono());
                System.out.println("Correo: " + contacto.getCorreo());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }
    public void actualizarContacto(String nombre, Contacto nuevoContacto) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                contactos.set(i, nuevoContacto);
                System.out.println("Contacto actualizado.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminarContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                contactos.remove(i);
                System.out.println("Contacto eliminado.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }
}
