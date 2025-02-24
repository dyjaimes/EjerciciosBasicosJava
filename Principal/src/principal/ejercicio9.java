
package principal;




public class ejercicio9 {
 
  private String[] nombres; // Almacena los nombres de los equipos
    private int[] puntos; // Almacena los puntos de cada equipo
    private int cantidadEquipos; // Cantidad de equipos registrados

    public ejercicio9(int cantidadEquipos) {
        this.cantidadEquipos = cantidadEquipos;
        this.nombres = new String[cantidadEquipos];
        this.puntos = new int[cantidadEquipos]; // Inicia con 0 puntos
    }

    public void agregarEquipo(int indice, String nombre) {
        nombres[indice] = nombre;
        puntos[indice] = 0; // Inicialmente todos tienen 0 puntos
    }

    public void registrarPartido(String equipo, String resultado) {
        int indice = buscarEquipo(equipo);

        if (indice != -1) {
            switch (resultado.toLowerCase()) {
                case "ganado":
                    puntos[indice] += 3;
                    break;
                case "empatado":
                    puntos[indice] += 1;
                    break;
                case "perdido":
                    puntos[indice] += 0;
                    break;
                default:
                    System.out.println("Resultado no válido. No se suman puntos.");
            }
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    private int buscarEquipo(String equipo) {
        for (int i = 0; i < cantidadEquipos; i++) {
            if (nombres[i].equalsIgnoreCase(equipo)) {
                return i; // Devuelve el índice del equipo
            }
        }
        return -1; // No encontrado
    }

    public void mostrarClasificacion() {
        System.out.println("\nClasificación del Campeonato:");
        System.out.println("-------------------------------");
        System.out.printf("%-15s %-10s %n", "Equipo", "Puntos");
        System.out.println("-------------------------------");

        for (int i = 0; i < cantidadEquipos; i++) {
            System.out.printf("%-15s %-10d %n", nombres[i], puntos[i]);
        }
    }
}