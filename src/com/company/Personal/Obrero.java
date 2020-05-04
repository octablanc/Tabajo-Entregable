package com.company.Personal;

public class Obrero extends NoArquitecto {
    public Obrero(String nombre, int edad, String DNI, String telefono, int costoPorDia){
        super(nombre, edad, DNI, telefono, costoPorDia);
    }

    @Override
    public void construir() {
        System.out.println("Soy un obrero y construyo");
    }

    public void mostrarDatos(){
        System.out.println("-----------------------------------");
        System.out.println("Obrero");
        System.out.println("Nombre: "+nombre
                +"\nEdad: "+edad
                +"\nDNI: "+DNI
                +"\nTelefono: "+telefono
                +"\nCosto por Dia: "+costoPorDia);
        System.out.println("-----------------------------------");
    }
}
