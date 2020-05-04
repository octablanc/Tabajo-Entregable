package com.company.Personal;

public abstract class NoArquitecto extends Empleados {
    protected int edad;

    public NoArquitecto(String nombre, int edad, String DNI, String telefono, int costoPorDia){
        super(nombre, DNI, telefono, costoPorDia);
        this.edad = edad;
    }

    public abstract void construir();
}

//todo. Sobre esta clase, se que se podia usar una interfaz que solo este construir y edad que sea un atributo propio de cada clase,
//todo. pero como no habia usado una clase abstracta antes se me ocurrio usarla de esta manera, mas que nada para joder un rato con una abstracta
