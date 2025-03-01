
package inver;
import java.util.Scanner;

public class Inver {

    public static void main(String[] args) {
 Invernadero invernadero = new Invernadero();
        System.out.println(" Un sensor de temperatura mide \n" +
"la temperatura en un invernadero. Si la temperatura es menor a 10°C, se activa \n" +
"un calefactor; si está entre 10°C y 25°C, no se hace nada; y si es mayor a 25°C, \n" +
"se activa un ventilador. ");
        int repetir;
        do{
        // Simula 5 lecturas de temperatura cada 5 segundos
        for (int i = 0; i < 5; i++) {
            invernadero.controlarTemperatura();
            try {
                Thread.sleep(5000); // Espera 5 segundos entre lecturas
            } catch (InterruptedException e) {
                System.out.println("Error en la espera.");
            }
        }

        System.out.println("Finalizando monitoreo del invernadero.");
            System.out.println("\n ingresa 1 para repetir o cualquier otro numero para salir");
            Scanner scanner=new Scanner(System.in);
            repetir=scanner.nextInt();
    }while(repetir==1);
}}