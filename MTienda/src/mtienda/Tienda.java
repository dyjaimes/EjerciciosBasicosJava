/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtienda;

/**
 *
 * @author dauri
 */
public class Tienda {
     private boolean enHorarioAtencion;

    public Tienda(boolean enHorarioAtencion) {
        this.enHorarioAtencion = enHorarioAtencion;
    }

    public boolean estaEnHorario() {
        return enHorarioAtencion;
    }

    public void cambiarHorario(boolean nuevoEstado) {
        enHorarioAtencion = nuevoEstado;
    }

    public boolean permitirAcceso(Cliente cliente) {
        if (cliente.esEmpleado() || (cliente.tieneMembresia() && enHorarioAtencion)) {
            return true;
        }
        return false;
    }
}