
package principal;
import java.util.Scanner;

public class Ejercicio4 {
    
    private int temperatura;
    
    public Ejercicio4(Scanner obtener, int temp){
        temperatura=((temp>8&&temp<34)?temp:getAlerta(obtener,  temp));
    }
    
    public int getAlerta(Scanner objeto,  int alerta){
       
        if(alerta<=8)
            System.out.println("alerta temperatura baja");

        if(alerta>=34)
            System.out.println("alerta temperatura Alta");

         return temperatura=alerta;

    }
    
    public int setTemperatura(){
        return temperatura;
    }
    
    
}