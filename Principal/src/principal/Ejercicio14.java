/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author dauri
 */
public class Ejercicio14 {
      public double calcularTiempo(double distancia, double velocidad) {
        if (velocidad <= 0) {
            System.out.println("❌ La velocidad debe ser mayor que 0.");
            return 0;
        }
        return distancia / velocidad;
    }
}
