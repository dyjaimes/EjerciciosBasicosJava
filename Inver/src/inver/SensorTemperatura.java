
package inver;
import java.util.Random;


public class SensorTemperatura {
    
    private Random random;

    public SensorTemperatura() {
        random = new Random();
    }

    public double leerTemperatura() {
        return 5 + random.nextDouble() * 30; // Genera una temperatura entre 5°C y 35°C
    }
}