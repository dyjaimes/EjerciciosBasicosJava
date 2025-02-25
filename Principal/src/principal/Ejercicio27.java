
package principal;


public class Ejercicio27 {
    private String resumenVentas; // Acumulador de texto
    private double totalVentas;   // Acumulador de la suma total

    public Ejercicio27() {
        this.resumenVentas = "";  // Inicialmente vacío
        this.totalVentas = 0;     // Inicialmente en 0
    }

    public void registrarProducto(String nombre, double precio, int cantidad) {
        double subtotal = precio * cantidad;
        totalVentas += subtotal;
        resumenVentas += "🛒 " + nombre + " - Cantidad: " + cantidad + " - Subtotal: $" + subtotal + "\n";
    }

    public String obtenerResumenVentas() {
        return resumenVentas.isEmpty() ? "No se han registrado ventas." : resumenVentas;
    }

    public double obtenerTotalVentas() {
        return totalVentas;
}}

