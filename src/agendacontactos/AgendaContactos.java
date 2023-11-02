
package agendacontactos;


public class AgendaContactos {

   
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Juan Perez", "123-456-7890", "juan@example.com");
        Contacto contacto2 = new Contacto("María López", "987-654-3210", "maria@example.com");

        Agenda agenda = new Agenda();
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);

        agenda.consultarContacto("Juan Perez");
        agenda.consultarContacto("Pedro Gómez");

        Contacto nuevoContacto = new Contacto("Juan Perez", "555-555-5555", "juan.nuevo@example.com");
        agenda.actualizarContacto("Juan Perez", nuevoContacto);
        agenda.consultarContacto("Juan Perez");

        agenda.eliminarContacto("María López");
        agenda.consultarContacto("María López");

    }
    
}
