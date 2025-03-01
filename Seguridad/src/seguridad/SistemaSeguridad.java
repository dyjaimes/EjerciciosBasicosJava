
package seguridad;

public class SistemaSeguridad {
    private SensorMovimiento sensor1, sensor2, sensor3;
    private boolean alarmaActiva;
    private boolean esDeNoche;

    public SistemaSeguridad() {
        sensor1 = new SensorMovimiento();
        sensor2 = new SensorMovimiento();
        sensor3 = new SensorMovimiento();
        alarmaActiva = false;
        esDeNoche = false;
    }

    public void activarAlarma() {
        alarmaActiva = true;
        System.out.println("Alarma activada.");
    }

    public void desactivarAlarma() {
        alarmaActiva = false;
        System.out.println("Alarma desactivada.");
    }

    public void establecerModoNoche(boolean noche) {
        esDeNoche = noche;
        System.out.println("Modo noche establecido en: " + (esDeNoche ? "Sí" : "No"));
    }

    public void verificarSensores() {
        if (!alarmaActiva) {
            System.out.println("La alarma está desactivada.");
            return;
        }

        boolean mov1 = sensor1.detectarMovimiento();
        boolean mov2 = sensor2.detectarMovimiento();
        boolean mov3 = sensor3.detectarMovimiento();

        System.out.println("Sensor 1: " + (mov1 ? "Detectó movimiento" : "Sin movimiento"));
        System.out.println("Sensor 2: " + (mov2 ? "Detectó movimiento" : "Sin movimiento"));
        System.out.println("Sensor 3: " + (mov3 ? "Detectó movimiento" : "Sin movimiento"));

        int detectados = (mov1 ? 1 : 0) + (mov2 ? 1 : 0) + (mov3 ? 1 : 0);

        if (detectados >= 2 && esDeNoche) {
            System.out.println("¡Alarma activada! Intruso detectado.");
        } else {
            System.out.println("No hay amenazas detectadas.");
        }
    }
}