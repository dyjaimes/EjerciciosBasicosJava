
package principal;


public class Ejercicio15 {
    private int numero; // Atributo para almacenar el número inicial

    // Constructor que recibe el número inicial
    public Ejercicio15(int numero) {
        this.numero = numero;
    }

    // Método para iniciar la cuenta regresiva
    public void iniciarCuentaRegresiva() {
        while (numero >= 0) {
            System.out.println(numero);
            numero--; // Restar 1 en cada iteración
            try {
                Thread.sleep(1000); // Pausa de 1 segundo (opcional)
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa.");
            }
        }
        System.out.println("¡Tiempo cumplido! ");
    }
}
