
package reservas;

class Sala {
    private Asiento[] asientos;
    private int capacidad;
    private int ocupados;

    public Sala(int capacidad) {
        this.capacidad = capacidad;
        this.ocupados = 0;
        this.asientos = new Asiento[capacidad];

        // Crear los asientos
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento();
        }
    }

    public void reservarAsiento(int numero) {
        if (ocupados >= capacidad) {
            System.out.println("La sala está llena.");
            return;
        }

        if (numero < 1 || numero > capacidad) {
            System.out.println("Número de asiento inválido.");
            return;
        }

        if (!asientos[numero - 1].estaOcupado()) {
            asientos[numero - 1].reservar();
            ocupados++;
        } else {
            System.out.println("El asiento ya está ocupado.");
        }
    }

    public boolean hayDisponibilidad() {
        return ocupados < capacidad;
    }
}