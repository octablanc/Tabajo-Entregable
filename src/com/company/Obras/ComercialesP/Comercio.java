package com.company.Obras.ComercialesP;

public class Comercio extends Comerciales {
    private String rubro;

    public Comercio(String rubro, String nombreObra, String direccion, int cantidadM2, int tiempoObra, int costoPorM2){
        super(nombreObra, direccion, cantidadM2, tiempoObra, costoPorM2);
        this.rubro = rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }
}
