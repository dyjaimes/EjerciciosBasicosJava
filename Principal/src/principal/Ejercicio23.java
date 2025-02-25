

package principal;



public class Ejercicio23 {
    private String listaVehiculos; // Acumulador de información

    public Ejercicio23() {
        this.listaVehiculos = ""; // Inicialmente vacío
    }

    public void registrarVehiculo(String placa, String horaIngreso) {
        listaVehiculos += "Placa: " + placa + " - Hora de ingreso: " + horaIngreso + "\n";
    }

    public String obtenerResumen() {
        return listaVehiculos.isEmpty() ? "No se registraron vehículos." : listaVehiculos;
    }
}
