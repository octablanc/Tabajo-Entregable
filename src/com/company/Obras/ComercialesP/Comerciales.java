package com.company.Obras.ComercialesP;

import com.company.Obras.Obra;

public class Comerciales extends Obra {
    protected String nombreObra;

    public Comerciales(String nombreObra, String direccion, int cantidadM2, int tiempoObra, int costoPorM2){
        super(direccion, cantidadM2, tiempoObra, costoPorM2);
        this.nombreObra = nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }
}
