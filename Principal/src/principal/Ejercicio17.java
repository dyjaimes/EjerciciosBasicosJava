
package principal;


public class Ejercicio17 {
     private String titulo;
    private String autor;
    private int paginas;

    public Ejercicio17(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getInfo() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + paginas + "\n";
    }
}
