package com.company.Obras.ComercialesP;

public class Hotel extends Comerciales {
    private int cantidadPisos;

    public Hotel(int cantidadPisos, String nombreObra, String direccion, int cantidadM2, int tiempoObra, int costoPorM2){
        super(nombreObra, direccion, cantidadM2, tiempoObra, costoPorM2);
        this.cantidadPisos = cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }
}
