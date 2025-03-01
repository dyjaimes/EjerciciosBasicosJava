

package mtienda;
import java.util.Scanner;


public class MTienda {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Un sistema de control de acceso permite la \n" +
"entrada a una tienda solo si el cliente tiene una membresía válida");
       
        System.out.print("¿La tienda está en horario de atención? (1: Sí, 0: No): ");
        boolean horario = scanner.nextInt() == 1;

        Tienda tienda = new Tienda(horario);

        int opcion;
        do {
            System.out.println("\n--- MENÚ CONTROL DE ACCESO ---");
            System.out.println("1. Intentar ingresar a la tienda");
            System.out.println("2. Cambiar horario de la tienda");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿El cliente tiene membresía? (1: Sí, 0: No): ");
                    boolean tieneMembresia = scanner.nextInt() == 1;
                    System.out.print("¿El cliente es empleado? (1: Sí, 0: No): ");
                    boolean esEmpleado = scanner.nextInt() == 1;

                    Cliente cliente = new Cliente(tieneMembresia, esEmpleado);
                    boolean acceso = tienda.permitirAcceso(cliente);

                    System.out.println(acceso ? "Acceso permitido." : "Acceso denegado.");
                    break;
                case 2:
                    System.out.print("¿La tienda está en horario de atención? (1: Sí, 0: No): ");
                    boolean nuevoHorario = scanner.nextInt() == 1;
                    tienda.cambiarHorario(nuevoHorario);
                    System.out.println("Horario actualizado.");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
      
    }
}