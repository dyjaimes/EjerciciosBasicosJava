
package inver;


public class Invernadero {
   private SensorTemperatura sensor;

    public Invernadero() {
        sensor = new SensorTemperatura();
    }

    public void controlarTemperatura() {
        double temperatura = sensor.leerTemperatura();
        System.out.printf("Temperatura actual: %.2f°C\n", temperatura);

        if (temperatura < 10) {
            System.out.println("Activando calefactor...");
        } else if (temperatura > 25) {
            System.out.println("Activando ventilador...");
        } else {
            System.out.println("Sistema inactivo. Temperatura estable.");
        }
    }
}