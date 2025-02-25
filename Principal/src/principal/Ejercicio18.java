
package principal;


public class Ejercicio18 {
    
    
    
      public double obtenerPrecio(int opcion) {
        switch (opcion) {
            case 1: return 8.50;  // Hamburguesa
            case 2: return 6.00;  // Perro Caliente
            case 3: return 5.00;  // Papas Fritas
            case 4: return 2.50;  // Gaseosa
            case 5: return 3.00;  // Malteada
            default: return 0;    // Opción inválida
        }
    }
}
