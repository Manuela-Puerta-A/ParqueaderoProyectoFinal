package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Puesto {
    int fila;
    int columna;
    Vehiculo vehiculo;

    // ------------------Constructor--------------------//
    public Puesto(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.vehiculo = null;
    }

    // ------------------Metodo para definir puesto ocupado--------------------//
    public boolean ocupar(Vehiculo vehiculo) {
        
        if (this.vehiculo == null) {
            this.vehiculo = vehiculo;
            return true;
        }
        return false;
    }
    public void ocuparPuesto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void liberar() {
        this.vehiculo = null;
    }

   public boolean ocupado(){
        return vehiculo!=null;
   }
   public Vehiculo getVehiculo() {
    return vehiculo;
}
   }

