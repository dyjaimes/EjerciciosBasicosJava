
package reservas;
import java.util.Scanner;

public class Reservas {

    
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        System.out.println("el presente ejercicio permite a los usuarios reservar asientos en una sala de cine");
        int repetir;
        do{
            
        
        
        System.out.print("Ingrese la cantidad de asientos de la sala: ");
        int cantidadAsientos = scanner.nextInt();

        if (cantidadAsientos < 1) {
            System.out.println("Debe haber al menos un asiento.");
            return;
        }

        Sala sala = new Sala(cantidadAsientos);

        while (sala.hayDisponibilidad()) {
            System.out.print("Ingrese el número de asiento a reservar (1-" + cantidadAsientos + "): ");
            int numero = scanner.nextInt();
            sala.reservarAsiento(numero);
        }

        System.out.println("La sala está llena. No hay más asientos disponibles.\n");
            
            System.out.println("ingresa 1 para repetir ejercicio o 2 para salir");
            repetir=scanner.nextInt();
        }while(repetir==1  );
        
    }
}