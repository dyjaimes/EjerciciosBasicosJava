
package principal;


public class Ejercicio25 {
       private String listaContactos; // Acumulador de texto

    public Ejercicio25() {
        this.listaContactos = ""; // Inicialmente vacío
    }

    public void agregarContacto(String nombre, String telefono) {
        listaContactos += "📞 " + nombre + " - " + telefono + "\n";
    }

    public String obtenerContactos() {
        return listaContactos.isEmpty() ? "No se han registrado contactos." : listaContactos;
    }
}
