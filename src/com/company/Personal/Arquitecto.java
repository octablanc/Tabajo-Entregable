package com.company.Personal;

public class Arquitecto extends Empleados {
    private String matricula;

    public Arquitecto(String matricula, String nombre, String DNI, String telefono, int costoPorDia){
        super(nombre,DNI,telefono,costoPorDia);
        this.matricula = matricula;
    }

    public void crearPlanos(){
        System.out.println("Creando mi próximo plano");
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void mostrarDatos(){
        System.out.println("-----------------------------------");
        System.out.println("Arquitecto");
        System.out.println("Nombre: "+nombre
                            +"\nMatricula: "+matricula
                            +"\nDNI: "+DNI
                            +"\nTelefono: "+telefono
                            +"\nCosto por Dia: "+costoPorDia);
        System.out.println("-----------------------------------");
    }
}
