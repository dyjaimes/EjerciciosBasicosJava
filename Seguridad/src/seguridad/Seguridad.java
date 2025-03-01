
package seguridad;
import java.util.Scanner;

public class Seguridad {

  
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        SistemaSeguridad sistema = new SistemaSeguridad();

        int opcion;
        System.out.println("Un sistema de seguridad tiene tres sensores de movimiento.");
        do {
            System.out.println("\nMENÚ SISTEMA DE SEGURIDAD");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Establecer modo noche");
            System.out.println("4. Verificar sensores");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.activarAlarma();
                    break;
                case 2:
                    sistema.desactivarAlarma();
                    break;
                case 3:
                    System.out.print("¿Es de noche? (1: Sí, 0: No): ");
                    boolean noche = scanner.nextInt() == 1;
                    sistema.establecerModoNoche(noche);
                    break;
                case 4:
                    sistema.verificarSensores();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
