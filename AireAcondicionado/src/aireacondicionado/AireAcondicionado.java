
package aireacondicionado;


public class AireAcondicionado {
    private double temperatura;
   private double humedad;
    
    public AireAcondicionado(){}

    public AireAcondicionado(double temperatura, double humedad) {
        
        this.temperatura=temperatura;
        this.humedad=humedad;
        
     
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

 


    
    
}
