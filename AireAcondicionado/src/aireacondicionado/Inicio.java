
package aireacondicionado;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class Inicio {

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.##");
        Scanner input =new Scanner(System.in);
        Random miRandom =new Random();
        int aleatorio ;
        double tem,humedad;
        
        System.out.println("el presente ejercicio simula la activacion de un Aire acondicionado a partir de la humedad y temperatura");
        do{
        System.out.println("desea agregar los valores de humedad y temperatura");
        System.out.println("o con valores aleatorios");
        System.out.println("pulsa 1 para intoriducir valores");
        System.out.println("pulsa 2 para valores aleatorios");
        aleatorio=input.nextInt();
        if(aleatorio ==1){
            System.out.println("introduce el valor de la temperatura");
            tem=input.nextDouble();
            System.out.println("introduce el valor de la humedad");
            humedad=input.nextInt();
            Sensor miSensor=new Sensor(tem, humedad);
            miSensor.encendidoAutomatico();
 miSensor.setTemperatura(tem);
            miSensor.setHumedad(humedad);
        }
        else{
            double max=75.0;
            double min=-50.0;
            tem=miRandom.nextDouble()*(max-min)+min;
            humedad=miRandom.nextDouble()*100+1;
           
            System.out.print("la temperatura es de "+df.format(tem)+" grados y la humedad es de "+df.format(humedad)+" %\n");
             Sensor miSensor=new Sensor(tem, humedad);
            miSensor.encendidoAutomatico();
             miSensor.setTemperatura(tem);
            miSensor.setHumedad(humedad);
             
        }
            System.out.println("\ningresa 1 para repetir ejercicio u otro numero para salir");
        }while(aleatorio ==1 );
        
        
        
        
    }
    
}
