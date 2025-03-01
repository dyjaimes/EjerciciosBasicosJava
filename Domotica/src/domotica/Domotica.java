
package domotica;
import java.util.Scanner;

public class Domotica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es de noche al iniciar el sistema? (1: Sí, 0: No): ");
        boolean esDeNoche = scanner.nextInt() == 1;

        SistemaDomotico sistema = new SistemaDomotico(esDeNoche);
        System.out.println("Un sistema domótico controla las luces de una casa.");
        int opcion;
        do {
            System.out.println("\n--- MENÚ SISTEMA DOMÓTICO ---");
            System.out.println("1. Simular control de luces");
            System.out.println("2. Cambiar modo (Día/Noche)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.controlarLuces();
                    try {
                        Thread.sleep(10000); // Espera 10 segundos antes de la siguiente simulación
                    } catch (InterruptedException e) {
                        System.out.println("Error en la espera.");
                    }
                    break;
                case 2:
                    System.out.print("¿Es de noche? (1: Sí, 0: No): ");
                    boolean noche = scanner.nextInt() == 1;
                    sistema.cambiarModoNoche(noche);
                    System.out.println("Modo noche actualizado.");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}