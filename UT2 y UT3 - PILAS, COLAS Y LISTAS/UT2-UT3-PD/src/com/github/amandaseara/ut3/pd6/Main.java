/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd6;

/**
 *
 * @author Amanda
 */
public class Main {
    
    public static void main(String[] args) {
        
        //EJERCICIO 1
        
        //No es necesario crear una clase nueva ya que la lista generica ya cumple con todo lo pedido
        Lista<String> sucursales = new Lista<>();
        
        for (String s : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd6/sucursales.txt")) {
            sucursales.insertar(new Nodo<>(s, s));
        }
        System.out.println("La cantidad de sucursales luego de cargar el archivo 'sucursales.txt' es: "+sucursales.cantElementos());
        
        
        //PRUEBA DEL PROGRAMA
        
        //Parte1
        Lista<String> sucursales1 = new Lista<>();
        
        for (String s : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd6/suc1.txt")) {
            sucursales1.insertar(new Nodo<>(s, s));
        }
        System.out.println("La cantidad de sucursales luego de cargar el archivo 'suc1.txt' es: "+
                sucursales1.cantElementos());
        
        //Parte2
        System.out.println("El resultado de eliminar 'Chicago' de sucursales es: "+
                sucursales1.eliminar("Chicago"));
        System.out.println("La cantidad de sucursales luego de cargar el archivo 'sucucursales.txt y eliminar Chicago' es: "+
                sucursales1.cantElementos());
        System.out.println("En esta modificada sucursales el siguiente ciudad a Hong Kong es: "+
                sucursales1.buscar("Hong Kong").getSiguiente().getDato());
        
        //Parte3
        Lista<String> sucursales2 = new Lista<>();
        for(String line : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd6/suc2.txt")){
            sucursales2.insertar(new Nodo<>(line, line));
        }

        System.out.println("El resultado de eliminar 'Shenzen' de sucursales es: "+
                sucursales2.eliminar("Shenzen"));
        System.out.println("El resultado de eliminar 'Tokio' de sucursales es: "+
                sucursales2.eliminar("Tokio"));

        System.out.println("La cantidad de sucursales luego de eliminar 'Shenzen' y 'Tokio' de 'suc2' es: "+
                sucursales2.cantElementos());

        //Parte4
        Lista<String> sucursales3 = new Lista<>();
        for (String line : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd6/suc3.txt")) {
            sucursales3.insertar(new Nodo<>(line, line));
        }

        System.out.println("El resultado de imprimir 'suc3' es: "+sucursales3.imprimir(";_"));
    }
    
}
