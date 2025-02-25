
package principal;




public class Ejercicio20 {
     private double sumaNotas;
    private int cantidadNotas;

    public Ejercicio20() {
        this.sumaNotas = 0;
        this.cantidadNotas = 0;
    }

    public void agregarNota(double nota) {
        sumaNotas += nota;
        cantidadNotas++;
    }

    public double calcularPromedio() {
        return (cantidadNotas > 0) ? (sumaNotas / cantidadNotas) : 0;
    }

    public boolean haAprobado() {
        return calcularPromedio() >= 3.0;
    }
    
    
    
    
}
