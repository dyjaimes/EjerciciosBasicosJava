
package principal;
import java.util.Scanner;
public class Ejercicio1 {
    
    
    private int piso;
    
    public void tomarDatos(Scanner obtener){
        int planta;
        System.out.println("escriba el numero de piso al que se dirije, (1/10): ");

        do{
                  planta=obtener.nextInt();
       
       
                  if(planta>=1 && planta<=10){
                           piso=planta;}
                  else{
                           System.out.println("el numero es incorrecto, vuelva a digitar el numero (1/10)");
                        }
      
        }while(planta<=0 || planta>10);
    
       
    }
    public int mostrarDatos(){
        
        return piso;
    }
       
    }
    
    
