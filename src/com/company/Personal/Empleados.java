package com.company.Personal;

public class Empleados {
    protected String nombre;
    protected String DNI;
    protected String telefono;
    protected int costoPorDia;

    public Empleados(){

    }

    public Empleados(String nombre, String DNI, String telefono, int costoPorDia){
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.costoPorDia = costoPorDia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCostoPorDia(int costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getCostoPorDia() {
        return costoPorDia;
    }
}
