package com.company;

import com.company.Obras.ComercialesP.Comerciales;
import com.company.Obras.ComercialesP.Comercio;
import com.company.Obras.ComercialesP.Hotel;
import com.company.Obras.DomesticasP.Domesticas;
import com.company.Obras.Obra;
import com.company.Personal.Arquitecto;
import com.company.Personal.Empleados;
import com.company.Personal.MaestroMayor;
import com.company.Personal.Obrero;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
    private String nombre;
    private ArrayList<Empleados> empleados;
    private ArrayList<Obra> obrasRealizadas;

    public Empresa(String nombre){
        this.nombre = nombre;
        empleados = new ArrayList<Empleados>();
        obrasRealizadas = new ArrayList<Obra>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEmpleados(){
        Iterator<Empleados> i = empleados.iterator();
        System.out.println("-----------------------------------------------");
        System.out.println("EMPLEADOS\n\n");
        while(i.hasNext()){
            Empleados empleado = i.next();
            if (empleado instanceof Arquitecto)
                ((Arquitecto) empleado).mostrarDatos();
            else if (empleado instanceof MaestroMayor)
                ((MaestroMayor) empleado).mostrarDatos();
            else
                ((Obrero) empleado).mostrarDatos();
        }
        System.out.println("\n-----------------------------------------------");
    }

    public void mostrarObras(){
        Iterator<Obra> i = obrasRealizadas.iterator();
        System.out.println("-----------------------------------------------");
        System.out.println("                 OBRAS\n");
        while (i.hasNext()){
            Obra obra = i.next();
            System.out.println("\n--------------------------------");
            if (obra instanceof Comercio)
                System.out.println("Obra Comercial\n"
                        +"Comercio\n"
                        +"Nombre: "+((Comercio) obra).getNombreObra()
                        +"\nCosto: $"+((Comercio) obra).precioTotalObra());
            else if (obra instanceof Hotel)
                System.out.println("Obra Comercial\n"
                        +"Hotel\n"
                        +"Nombre: "+((Hotel) obra).getNombreObra()
                        +"\nCosto: $"+((Hotel) obra).precioTotalObra());
            else if (obra instanceof Domesticas)
                System.out.println("Obra Domestica\n"
                        +"Cantidad de habitaciones: "+((Domesticas) obra).getCantHabitaciones()
                        +"\nCosto: $"+((Domesticas) obra).precioTotalObra());
            else if (obra instanceof Comerciales)
                System.out.println("Obra Comercial\n"
                        +"Nombre: "+((Comerciales) obra).getNombreObra()
                        +"\nCosto: $"+((Comerciales) obra).precioTotalObra());
            else
                System.out.println("Obra\n"
                        +"Direccion: "+obra.getDireccion()
                        +"\nCosto: $"+obra.precioTotalObra());
            System.out.println("--------------------------------");
        }
        System.out.println("\n-----------------------------------------------\n");
    }

    public void mostrarDatos(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("EMPRESA "+nombre.toUpperCase());
        this.mostrarObras();
        this.mostrarEmpleados();
        System.out.println("\n----------------------------------------------------------------------\n\n");
    }

    public void agregarEmpleado(Empleados empleado){
        this.empleados.add(empleado);
    }

    public Empleados buscarEmpleado(String DNI){
        Empleados encontrado = null;
        Iterator<Empleados> i = empleados.iterator();
        while (i.hasNext() && encontrado == null) {
            Empleados aux = i.next();
            if (aux.getDNI().equals(DNI))
                encontrado = aux;
        }
        return encontrado;
    }

    public Obra buscarObra(String direccion){
        Obra encontrada = null;
        Iterator<Obra> i = obrasRealizadas.iterator();
        while (i.hasNext() && encontrada == null){
            Obra aux = i.next();
            if (aux.getDireccion().equals(direccion)){
                encontrada = aux;
            }
        }
        return encontrada;
    }

    public void agregrObra(Obra obra){
        obrasRealizadas.add(obra);
    }
}
