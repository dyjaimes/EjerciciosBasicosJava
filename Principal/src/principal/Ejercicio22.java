


package principal;



public class Ejercicio22 {
     private String listaVentas; // Acumulador de texto
    private double totalVentas; // Total acumulado

    public Ejercicio22() {
        this.listaVentas = ""; 
        this.totalVentas = 0;
    }

    public void agregarVenta(String producto, double precio) {
        listaVentas += "  " + producto + " - $" + precio + "\n";
        totalVentas += precio;
    }

    public String obtenerResumenVentas() {
        return listaVentas.isEmpty() ? "No se registraron ventas." : listaVentas;
    }

    public double obtenerTotalVentas() {
        return totalVentas;
    }
}
