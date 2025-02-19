
package principal;
import java.util.Scanner;

public class Ejercicio3 {
    private int temperatura;
    
    
 
public int obtenerNumero(Scanner obtener, String mensaje){
    int numero;

do {
            System.out.println(mensaje);
            numero = obtener.nextInt();
            if (numero < 0) {
                System.out.println("Número inválido. Debe ser positivo.");
            }
        } while (numero < 0);
        return numero;

}

public void setTemperatura(int temp){
    temperatura=temp;
}

public int getRegistroTemperatura(){
    return temperatura;
}
}
