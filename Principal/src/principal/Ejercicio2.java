
package principal;
import java.util.Scanner;

public class Ejercicio2 {
    
    private int peso;
    private int piso;
    
    public Ejercicio2(int pesoUsuario, int piso,Scanner obtener){
        if(pesoUsuario>100){
        System.out.println("el peso sobrepasa la carga total");
         do{
                             
                             System.out.println("ingrese nuevamente su peso: ");
                             pesoUsuario=obtener.nextInt();
                         }while(pesoUsuario<0||pesoUsuario>100);
        }
        peso=pesoUsuario;
        this.piso=piso;
    }
    
    
    
    public  int getPesoPermitido(){
        return peso;
    }
    
}
