/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd7;

/**
 *
 * @author Amanda
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        IConjunto<TAlumno> AED1 = new Conjunto<>();
        IConjunto<TAlumno> PF = new Conjunto<>();
        String[] nombres = {"Pepe Tejas", "Carlos Torres", "Agustin Casas", "Jorge Edificio", "Carlitos Segundo"};
        for (int i = 0; i < nombres.length; i++) {
            int cedula = i;
            int cedula2 = i + nombres.length;
            AED1.getLista().insertar(new Nodo<>(cedula, new TAlumno(cedula,nombres[i])));
            PF.getLista().insertar(new Nodo<>(cedula2, new TAlumno(cedula,nombres[i])));
        }
        TAlumno alumnoEnDosClases1 = new TAlumno(1234, "Pedrito Paredes");
        TAlumno alumnoEnDosClases2 = new TAlumno(5673, "Pablo Casas");
        AED1.getLista().insertar(new Nodo<>(alumnoEnDosClases1.getCedula(), alumnoEnDosClases1));
        AED1.getLista().insertar(new Nodo<>(alumnoEnDosClases2.getCedula(), alumnoEnDosClases2));
        PF.getLista().insertar(new Nodo<>(alumnoEnDosClases1.getCedula(), alumnoEnDosClases1));
        PF.getLista().insertar(new Nodo<>(alumnoEnDosClases2.getCedula(), alumnoEnDosClases2));

        IConjunto<TAlumno> union = PF.union(AED1);
        System.out.println("Union: "+ union.getLista().cantElementos() + " elementos");
        System.out.println("Union: "+ union.getLista().imprimir(","));

        IConjunto<TAlumno> interseccion = PF.interseccion(AED1);
        System.out.println("Interseccion: "+ interseccion.getLista().cantElementos()+" elementos");
        System.out.println("Interseccion: "+ interseccion.getLista().imprimir(","));
    }
}
