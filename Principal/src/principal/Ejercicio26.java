/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author dauri
 */
public class Ejercicio26 {
    private int sumaTotal; // Acumulador de la suma

    public Ejercicio26() {
        this.sumaTotal = 0; // Inicialmente en 0
    }

    public void agregarNumero(int numero) {
        sumaTotal += numero; // Sumar al total
    }

    public int obtenerSumaTotal() {
        return sumaTotal;
    }
}
