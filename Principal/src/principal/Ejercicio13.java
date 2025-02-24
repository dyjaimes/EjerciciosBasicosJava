/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


public class Ejercicio13 {
    
    
    
        private int papelDisponible;

    // Constructor
    public Ejercicio13(int capacidadInicial) {
        this.papelDisponible = capacidadInicial;
    }

    // Método para imprimir páginas
    public void imprimir(int paginas) {
        if (paginas <= papelDisponible) {
            papelDisponible -= paginas;
            System.out.println("🖨️ Imprimiendo " + paginas + " páginas...");
            System.out.println("📄 Papel restante: " + papelDisponible);
        } else {
            System.out.println("❌ No hay suficiente papel. Papel disponible: " + papelDisponible);
        }
    }

    // Método para verificar si hay papel disponible
    public boolean hayPapel() {
        return papelDisponible > 0;
    }
    
}
