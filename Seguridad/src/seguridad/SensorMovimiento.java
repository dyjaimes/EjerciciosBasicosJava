
package seguridad;
import java.util.Random;

public class SensorMovimiento {
    private Random random;

    public SensorMovimiento() {
        random = new Random();
    }

    public boolean detectarMovimiento() {
        return random.nextBoolean(); // Simula detección de movimiento (true o false)
    }
}