package com.company.Personal;

public class MaestroMayor extends NoArquitecto {
    public MaestroMayor(String nombre, int edad, String DNI, String telefono, int costoPorDia){
        super(nombre, edad, DNI, telefono, costoPorDia);
    }

    @Override
    public void construir() {
        System.out.println("Soy maestro y superviso las construcciones");
    }

    public void mostrarDatos(){
        System.out.println("-----------------------------------");
        System.out.println("Maestro Mayor de Obra");
        System.out.println("Nombre: "+nombre
                            +"\nEdad: "+edad
                            +"\nDNI: "+DNI
                            +"\nTelefono: "+telefono
                            +"\nCosto por Dia: "+costoPorDia+"\n");
        System.out.println("-----------------------------------");
    }
}