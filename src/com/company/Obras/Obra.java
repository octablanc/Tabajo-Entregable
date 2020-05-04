package com.company.Obras;

import com.company.Personal.Arquitecto;
import com.company.Personal.Empleados;
import com.company.Personal.MaestroMayor;
import com.company.Personal.Obrero;

import java.util.ArrayList;
import java.util.Iterator;

public class Obra {
    protected String direccion;
    protected int cantidadM2;
    protected int tiempoObra;
    protected int costoPorM2;
    protected ArrayList<Empleados> listaPersonal;

    public Obra(String direccion, int cantidadM2, int tiempoObra, int costoPorM2){
        this.direccion = direccion;
        this.cantidadM2 = cantidadM2;
        this.tiempoObra = tiempoObra;
        this.costoPorM2 = costoPorM2;
        listaPersonal = new ArrayList<Empleados>();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantidadM2(int cantidadM2) {
        this.cantidadM2 = cantidadM2;
    }

    public void setTiempoObra(int tiempoObra) {
        this.tiempoObra = tiempoObra;
    }

    public void setCostoPorM2(int costoPorM2) {
        this.costoPorM2 = costoPorM2;
    }

    public void setListaPersonal(ArrayList<Empleados> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantidadM2() {
        return cantidadM2;
    }

    public int getTiempoObra() {
        return tiempoObra;
    }

    public int getCostoPorM2() {
        return costoPorM2;
    }

    public ArrayList<Empleados> getListaPersonal() {
        return listaPersonal;
    }

    public void mostrarPersonal(){
        Iterator<Empleados> nombreIterator = listaPersonal.iterator();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("PERSONAL \n\n");
        while(nombreIterator.hasNext()){
            Empleados empleado = nombreIterator.next();
            if (empleado instanceof Arquitecto)
                ((Arquitecto) empleado).mostrarDatos();
            else if (empleado instanceof MaestroMayor)
                ((MaestroMayor) empleado).mostrarDatos();
            else
                ((Obrero) empleado).mostrarDatos();
        }
        System.out.println("\n\n----------------------------------------------------------------------");
    }

    public void mostrarDatos(){
        System.out.println("DATOS DE LA OBRA\n\n");
        System.out.println("Direccion: "+direccion
                            +"\nCantidad de M2: "+cantidadM2
                            +"\nTiempo de Obra: "+tiempoObra+" días"
                            +"\nCosto por M2: $"+costoPorM2+"\n");
        this.mostrarPersonal();
    }

    public Arquitecto getArquitecto(){
        Arquitecto aRetornar = null;
        Iterator<Empleados> i = listaPersonal.iterator();
        while (i.hasNext() && aRetornar == null){
            Empleados aux = i.next();
            if (aux instanceof Arquitecto)
                aRetornar =  (Arquitecto)aux;
        }
        return aRetornar;
    }

    public int agregarArquitecto(Arquitecto toAdd){
        int flag = 0;
        if (getArquitecto() == null){
            listaPersonal.add(toAdd);
            flag++;
        }
        return flag;
    }

    public int cantMaestros(){
        int maestros = 0;
        Iterator<Empleados> i = listaPersonal.iterator();
        while (i.hasNext() && maestros < 3){
            Empleados aux = i.next();
            if (aux instanceof MaestroMayor)
                maestros++;
        }
        return maestros;
    }

    public int cantObreros(){
        int obreros = 0;
        Iterator<Empleados> i = listaPersonal.iterator();
        while (i.hasNext()){
            Empleados aux = i.next();
            if (aux instanceof Obrero)
                obreros++;
        }
        return obreros;
    }

    public int agregarMaestro(MaestroMayor nuevo){
        int flag = 0;
        if (this.cantMaestros() < 3) {
            listaPersonal.add(nuevo);
            flag++;
        }
        return flag;
    }

    public void agregarObrero(Obrero obrero){
        listaPersonal.add(obrero);
    }

    public int costoEmpleados(){
        int costo = 0;
        Iterator<Empleados> i = listaPersonal.iterator();

        while (i.hasNext())
            costo += i.next().getCostoPorDia();

        return costo;
    }

    public float precioTotalObra(){
        float rta = -1;
        if (this.getArquitecto() != null && this.cantMaestros()>0 && this.cantObreros()>2)
            rta = (float)((costoPorM2 * cantidadM2) + (costoEmpleados() * tiempoObra));
        return rta;
    }
}
