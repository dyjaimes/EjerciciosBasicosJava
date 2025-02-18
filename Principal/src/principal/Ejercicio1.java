
package principal;
import java.util.Scanner;
public class Ejercicio1 {
    
    
    private int piso=0;
    
    public void tomarDatos(Scanner obtener){
        System.out.println("escriba el numero de piso al que se dirije, (1 al 10): ");
        int planta;
       planta=obtener.nextInt();
       if(planta>=1 && planta<=10){
       piso=planta;
       }
    }
    public int mostrarDatos(){
        
        return piso;
    }
       
    }
    
    
