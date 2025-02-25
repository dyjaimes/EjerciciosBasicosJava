
package principal;

public class Ejercicio15 {
    private int numero; 

    public Ejercicio15(int numero) {
        this.numero = numero;
    }

    public void iniciarCuentaRegresiva() {
        while (numero >= 0) {
            System.out.println(numero);
            numero--; 
        }
        System.out.println("¡Tiempo cumplido!");
    }
}