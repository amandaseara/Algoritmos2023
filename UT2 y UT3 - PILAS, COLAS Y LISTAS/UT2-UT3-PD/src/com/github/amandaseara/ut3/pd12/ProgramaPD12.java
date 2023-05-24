/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Amanda
 */
public class ProgramaPD12 {
    
    public static void main(String[] args) throws IOException {

        // instanciar curso BasicoIng...
        Conjunto<Alumno> BasicoIng = new Conjunto<>();
        String[] archivo101 = ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd12/basico-ing.txt");
        for (String s : archivo101) {
            String[] datos = s.split(",");
            int codigo = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            Alumno al = new Alumno(codigo,nombre);
            Nodo<Alumno> nodo = new Nodo<>(codigo, al);
            BasicoIng.getLista().insertar(nodo);
        }
        

        // instanciar curso BasicoEmp...
        Conjunto<Alumno> BasicoEmp = new Conjunto<>();
        String[] archivo102 = ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd12/basico-emp.txt");
        for (String n : archivo102) {
            String[] datos2 = n.split(",");
            int codigo = Integer.parseInt(datos2[0]);
            String nombre = datos2[1];
            Alumno al2 = new Alumno(codigo,nombre);
            Nodo<Alumno> nodo2 = new Nodo<>(codigo, al2);
            BasicoEmp.getLista().insertar(nodo2);
        }
        

        // generar el curso "integrador101" con los alumnos que están en condiciones de cursarlo 
        Conjunto<Alumno> Integrador101 = new Conjunto<>();
        Integrador101.setLista(BasicoIng.union(BasicoEmp).getLista());
        // guardar en un archivo "integrador101.txt"  - IDEALMENTE ordenados por código de alumno -
        Nodo<Alumno> aux1 = Integrador101.getLista().getPrimero();
        String alum101 = "";
        while(aux1!=null){
            alum101 += (aux1.getDato().getCodigo()+","+aux1.getDato().getNombre()+"_");
            aux1 = aux1.getSiguiente();
        }
        String[] alum1 = alum101.split("_");
        ManejadorArchivosGenerico.escribirArchivo("src/com/github/amandaseara/ut3/pd12/integrador101.txt", alum1);
        
        
        // generar el curso "exigente102" con los alumnos que están en condiciones de cursarlo 
        Conjunto<Alumno> Exigente102 = new Conjunto<>();
        Exigente102.setLista(BasicoEmp.interseccion(BasicoIng).getLista());
        // guardar en un archivo "exigente102.txt" - IDEALMENTE ordenados por código de alumno -
        Nodo<Alumno> aux = Exigente102.getLista().getPrimero();
        String alum102 = "";
        while(aux!=null){
            alum102 += (aux.getDato().getCodigo()+","+aux.getDato().getNombre()+"_");
            aux = aux.getSiguiente();
        }
        String[] alum2 = alum102.split("_");
        ManejadorArchivosGenerico.escribirArchivo("src/com/github/amandaseara/ut3/pd12/exigente102.txt", alum2);
        
    }
    
}
