
package principal;


public class Ejercicio19 {
       private int temperatura;

    public Ejercicio19(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean esTemperaturaAceptable() {
        return temperatura >= 18 && temperatura <= 25;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
