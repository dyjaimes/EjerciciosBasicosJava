
package domotica;


public class SistemaDomotico {
     private SensorLuz sensorLuz;
    private SensorMovimiento sensorMovimiento;
    private boolean lucesEncendidas;

    public SistemaDomotico(boolean esDeNoche) {
        sensorLuz = new SensorLuz(esDeNoche);
        sensorMovimiento = new SensorMovimiento();
        lucesEncendidas = false;
    }

    public void controlarLuces() {
        boolean noche = sensorLuz.esDeNoche();
        boolean movimiento = sensorMovimiento.detectarMovimiento();

        System.out.println("Modo noche: " + (noche ? "Sí" : "No"));
        System.out.println("Movimiento detectado: " + (movimiento ? "Sí" : "No"));

        if (noche && movimiento) {
            lucesEncendidas = true;
        } else {
            lucesEncendidas = false;
        }

        System.out.println("Estado de las luces: " + (lucesEncendidas ? "Encendidas" : "Apagadas"));
    }

    public void cambiarModoNoche(boolean noche) {
        sensorLuz.establecerModoNoche(noche);
    }
}