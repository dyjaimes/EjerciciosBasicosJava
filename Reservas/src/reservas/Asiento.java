package reservas;
class Asiento {
    private boolean ocupado;

    public Asiento() {
        this.ocupado = false; // Inicialmente, el asiento está disponible
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void reservar() {
        if (!ocupado) {
            ocupado = true;
            System.out.println("¡Reserva exitosa!");
        } else {
            System.out.println("El asiento ya está ocupado.");
        }
    }
}