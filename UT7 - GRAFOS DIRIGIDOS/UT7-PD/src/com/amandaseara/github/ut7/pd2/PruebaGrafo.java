/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut7.pd2;

/**
 *
 * @author Amanda
 */
public class PruebaGrafo {

    public static void main(String[] args) {
        
        TGrafoDirigido grafo = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/com/amandaseara/github/ut7/pd2/vertices.txt",
                "./src/com/amandaseara/github/ut7/pd2/aristas.txt",false, TGrafoDirigido.class);

        Object[] etiquetasarray = grafo.getEtiquetasOrdenado();

        //MATRIZ DE ADYACENCIAS
        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(grafo.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, grafo.getVertices(), "Matriz");
        
        //MATRIZ DE COSTOS MINIMOS FLOYD
        Double[][] mfloyd = grafo.floyd();
        UtilGrafos.imprimirMatrizMejorado(mfloyd, grafo.getVertices(), "Matriz luego de FLOYD");
        
        //EXCENTRICIDAD Y CENTRO
        for (int i = 0; i < etiquetasarray.length; i++) {
            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + grafo.obtenerExcentricidad((Comparable) etiquetasarray[i]));
        }
        System.out.println();
        System.out.println("Centro del grafo: " + grafo.centroDelGrafo());
       
       
    }
}
