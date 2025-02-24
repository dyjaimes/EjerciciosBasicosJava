/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
      private int numeroSecreto;
    private int intentos;

    // Constructor que genera un número aleatorio entre 1 y 100
    public Ejercicio16() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1;
        intentos = 0;
    }

    // Método para jugar
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario = 0;

        System.out.println(" ¡Bienvenido al juego de adivinanza!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        while (numeroUsuario != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println(" El número secreto es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println(" El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        }
    }}

