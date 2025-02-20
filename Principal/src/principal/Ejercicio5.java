
 
package principal;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5 {
    private int piso, temperatura;
    
    
    public static int solicitarPiso(Scanner obt, String mensaje){
        int valido=0;
        do{
            System.out.println(mensaje);
            if(!obt.hasNextInt()){
                System.out.print("debe ingresar un numero");
                obt.next();
               continue;
            }
            valido=obt.nextInt();
            System.out.print("ascensor desplazandose al piso: " +valido);

            if(valido<1 || valido>20)
                System.out.println("numero invalido, fuera de rango (1/20)");
           
        }while(valido<1 || valido >20);
        return valido;
    }
    public  static int solicitarTemperatura(Scanner obten, String temp){
        int tem=0;
        
       
            System.out.print(temp);
            Random temAleatoria = new Random();
            tem=1+temAleatoria.nextInt(40);
            if(tem>33)
                System.out.print("la temperatura no es adecuada, salga del ascensor");
            else
                System.out.print("la temperatura es adecuada ");

        return tem;
    }
    
    public void settemperatura(int temper){
        temperatura=temper;
    }
    public void setpiso(int p){
        piso=p;
    }
}
