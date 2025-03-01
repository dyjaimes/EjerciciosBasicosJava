
package aireacondicionado;


public class Sensor extends AireAcondicionado{

    public Sensor() {
    }

    public Sensor(double temperatura, double sensor) {
        super(temperatura, sensor);
    }
    
    
    
    public void encendidoAutomatico(){
        if(getTemperatura()>28&&getHumedad()>60){
            System.out.println("el aire acondicionado esta encendido");
        }
        else if(getTemperatura()>30){
                        System.out.println("el aire acondicionado esta encendido");
        }
        else{
             System.out.println("el aire acondicionado esta apagado");
        }
        
    }
    
}
