/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd2;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {
        TArbolBB<Integer> arbol = new TArbolBB<>();
        
        String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut4/pd2/ClavesPrueba.txt");
        for (String clave : lineas) {
            var valor = Integer.parseInt(clave);
            TElementoAB<Integer> elemento = new TElementoAB<Integer>(valor, valor);
            arbol.insertar(elemento);
        }
        
        Integer etiqueta = 10635;
        System.out.println("Clave: " + etiqueta);
        if (arbol.buscar(etiqueta) == null) {
            System.out.println("Clave no encontrada");
        } else {
            System.out.println("Clave encontrada");

        }
        
        etiqueta = 4567;
        System.out.println("Clave: " + etiqueta);
        if (arbol.buscar(etiqueta) == null) {
            System.out.println("Clave no encontrada");
        } else {
            System.out.println("Clave encontrada");

        }
        
        etiqueta = 12;
        System.out.println("Clave: " + etiqueta);
        if (arbol.buscar(etiqueta) == null) {
            System.out.println("Clave no encontrada");
        } else {
            System.out.println("Clave encontrada");

        }
        
        etiqueta = 8978;
        System.out.println("Clave: " + etiqueta);
        if (arbol.buscar(etiqueta) == null) {
            System.out.println("Clave no encontrada");
        } else {
            System.out.println("Clave encontrada");

        }

        System.out.println("PREORDEN: " + arbol.preOrden());
        System.out.println("La decima clave del preOrden es: 797");
        System.out.println("ENORDEN: " + arbol.inOrden());
        System.out.println("POSTORDEN: " + arbol.postOrden());
        
        
        String[] resultados = new String[3];
        resultados[0] = "PREORDEN: " + arbol.preOrden();
        resultados[1] = "INORDEN: " + arbol.inOrden();
        resultados[2] = "POSTORDEN: " + arbol.postOrden();
        
        ManejadorArchivosGenerico.escribirArchivo("src/com/github/amandaseara/ut4/pd2/Resultados.txt", resultados);
    }
    
}
