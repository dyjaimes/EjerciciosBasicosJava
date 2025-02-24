
package principal;


public class Ejercicio11 {
    private double saldo;

    public Ejercicio11(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean retirar(double monto) {
        if (monto > saldo) {
            return false; // Fondos insuficientes
        } else {
            saldo -= monto;
            return true; // Retiro exitoso
        }
    }
}
