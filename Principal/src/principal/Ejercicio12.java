
package principal;
import java.util.Scanner;
/**
 *
 * @author dauri
 */
public class Ejercicio12 {
    
    
    
    
    
    
     private double totalCompra = 0;
    private Scanner scanner = new Scanner(System.in);

    // Método para calcular el costo de un producto
    public double calcularCostoProducto(double precio, int cantidad) {
        return precio * cantidad;
    }

    // Método para realizar la compra
    public void realizarCompra() {
        System.out.println("🛒 Bienvenido a la Tienda en Línea");

        while (true) {
            // Pedir precio y cantidad del producto
            System.out.print("\nIngrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();

            // Calcular y sumar al total
            double costoProducto = calcularCostoProducto(precio, cantidad);
            totalCompra += costoProducto;
            System.out.printf("Subtotal actual: $%.2f%n", totalCompra);

            // Preguntar si desea seguir comprando
            System.out.print("¿Desea agregar otro producto? (si/no): ");
            String continuar = scanner.next().toLowerCase();

            if (!continuar.equals("si")) {
                break;
            }
        }

        // Mostrar total final
        System.out.printf("\n💰 Total de la compra: $%.2f%n", totalCompra);
        System.out.println("¡Gracias por su compra!");
        scanner.close();
    }
}

