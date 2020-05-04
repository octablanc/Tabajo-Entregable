package com.company.Obras.DomesticasP;

import com.company.Obras.Obra;

public class Domesticas extends Obra {
    protected int cantHabitaciones;

    public Domesticas(int cantHabitaciones, String direccion, int cantidadM2, int tiempoObra, int costoPorM2){
        super(direccion, cantidadM2, tiempoObra, costoPorM2);
        this.cantHabitaciones = cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }
}
