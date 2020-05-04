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
import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private Empresa empresas;

    public static void main(String[] args) {
        Arquitecto  arqui = new Arquitecto("msa2144asd", "juan", "40121583", "2235674890", 1000);
        Arquitecto  arqui2 = new Arquitecto("msa0r44asd", "julian", "30641583", "2235642063", 1000);
        Arquitecto  arqui3 = new Arquitecto("msa21weasd", "roberto", "34901243", "2235673285", 1000);

        MaestroMayor maestro = new MaestroMayor("Alejandro", 30, "29650001", "2234127080", 800);
        MaestroMayor maestro2 = new MaestroMayor("Ariel", 25, "39658121", "2236118739", 800);
        MaestroMayor maestro3 = new MaestroMayor("Alberto", 39, "28999551", "2234216180", 800);
        MaestroMayor maestro4 = new MaestroMayor("Armando", 28, "37405728", "2234114502", 800);

        Obrero obrero = new Obrero("Luciano", 27, "39321885", "2234701128", 600);
        Obrero obrero2 = new Obrero("Hernan", 31, "35991348", "2235009122", 600);
        Obrero obrero3 = new Obrero("Cristian", 38, "27016221", "2236536172", 600);
        Obrero obrero4 = new Obrero("Federico", 29, "36789325", "2235518943", 600);
        Obrero obrero5 = new Obrero("Martin", 21, "41547712", "223567139", 600);
        Obrero obrero6 = new Obrero("Fabian", 23, "40752439", "223678751", 600);
        Obrero obrero7 = new Obrero("Jorge", 90, "00000001", "223511928", 10000);
        Obrero obrero8 = new Obrero("Mirtha Legrand", 93, "0000002", "2235661290", 600);
        Obrero obrero9 = new Obrero("Sebastian", 24, "39006784", "2235113245", 600);
        Obrero obrero10 = new Obrero("Facundo", 20, "42106911","2234009151", 800);

        //todo. arqui.crearPlanos();
        //todo. maestro.construir();
        //todo. obrero.construir();

        Empresa empresa = new Empresa("ExactDreams");
        empresa.agregarEmpleado(arqui);
        empresa.agregarEmpleado(arqui2);
        empresa.agregarEmpleado(arqui3);
        empresa.agregarEmpleado(maestro);
        empresa.agregarEmpleado(maestro2);
        empresa.agregarEmpleado(maestro3);
        empresa.agregarEmpleado(maestro4);
        empresa.agregarEmpleado(obrero);
        empresa.agregarEmpleado(obrero2);
        empresa.agregarEmpleado(obrero3);
        empresa.agregarEmpleado(obrero4);
        empresa.agregarEmpleado(obrero5);
        empresa.agregarEmpleado(obrero6);
        empresa.agregarEmpleado(obrero7);
        empresa.agregarEmpleado(obrero8);
        empresa.agregarEmpleado(obrero9);
        empresa.agregarEmpleado(obrero10);

        Obra obra = new Obra("Buenos Aires 2341", 300, 70, 10000);
        Comerciales obra2 = new Comerciales("Helderia Paul", "Corrientes 2510", 300, 70, 10000);
        Hotel obra3 = new Hotel(12, "Oracle", "Colon 1298", 300, 70, 10000);
        Comercio obra4 = new Comercio("Polleria", "Polleria Los Hermanos", "Alvarado 2351", 300, 70, 10000);
        Domesticas obra5 = new Domesticas(4, "Mariani 5121", 300, 70, 10000);

        empresa.agregrObra(obra);
        empresa.agregrObra(obra2);
        empresa.agregrObra(obra3);
        empresa.agregrObra(obra4);
        empresa.agregrObra(obra5);

        /// Se que esto me va a devolver la misma direccion de memoria que el objeto "obra" pero quiero usar los metodos que tengo jajaja xD
        Obra toWork = empresa.buscarObra("Buenos Aires 2341");
        toWork.agregarArquitecto(arqui);
        toWork.agregarMaestro(maestro);
        toWork.agregarObrero(obrero);
        toWork.agregarObrero(obrero2);
        toWork.agregarObrero(obrero3);

        toWork = empresa.buscarObra("Corrientes 2510");
        toWork.agregarArquitecto(arqui2);
        toWork.agregarMaestro(maestro2);
        toWork.agregarObrero(obrero4);
        toWork.agregarObrero(obrero5);
        toWork.agregarObrero(obrero6);

        toWork = empresa.buscarObra("Colon 1298");
        toWork.agregarArquitecto(arqui3);
        toWork.agregarMaestro(maestro3);
        toWork.agregarObrero(obrero7);
        toWork.agregarObrero(obrero8);
        toWork.agregarObrero(obrero9);

        toWork = empresa.buscarObra("Alvarado 2351");
        toWork.agregarArquitecto(arqui);
        toWork.agregarMaestro(maestro4);
        toWork.agregarObrero(obrero10);
        toWork.agregarObrero(obrero);
        toWork.agregarObrero(obrero2);

        toWork = empresa.buscarObra("Mariani 5121");
        toWork.agregarArquitecto(arqui2);
        toWork.agregarMaestro(maestro);
        toWork.agregarObrero(obrero3);
        toWork.agregarObrero(obrero4);
        toWork.agregarObrero(obrero5);

        //todo. No pongo todoss juntos por que aca en java no esta el system("cls) que sirve para borrar la pantalla y se junta
        //todo. todo y se ve feo, asi que si queres probarlos solo borra las barritas :) (poniendo la palabra "todo" descubri el color este XDXD)
        //todo. empresa.mostrarObras();
        //todo. (empresa.buscarObra("Mariani 5121")).mostrarPersonal();
    }

}
