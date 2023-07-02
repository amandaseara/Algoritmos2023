/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut8.grafoNoDirigido;

import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;


/**
 *
 * @author Amanda
 */
public class PruebaGrafo {

    public static void main(String[] args) {
        
        TGrafoNoDirigido grafo = UtilGrafos.cargarGrafo("./src/com/amandaseara/github/ut8/grafoNoDirigido/Vertices.txt",
                "./src/com/amandaseara/github/ut8/grafoNoDirigido/Aristas.txt",false, TGrafoNoDirigido.class);

        //MATRIZ DE ADYACENCIAS
        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(grafo.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, grafo.getVertices(), "Matriz");
        
        //BPF
        Collection<TVertice> res = grafo.bpf();
        System.out.println("BPF NORMAL:");
        int j = 1;
        for(TVertice v : res){
            System.out.println(j+"- "+v.getEtiqueta());
            j++;
        }
        
        Collection<TVertice> resM = grafo.bpf("e");
        System.out.println("BPF DESDE e:");
        int l = 1;
        for(TVertice v : resM){
            System.out.println(l+"- "+v.getEtiqueta());
            l++;
        }
        
        //TODOS LOS CAMINOS
        TCaminos todos = grafo.todosLosCaminos("a", "e");
        todos.imprimirCaminosConsola();
        
        //PRIM
        TGrafoNoDirigido grafoPrim = grafo.Prim();
        Double[][] matrizPrim = UtilGrafos.obtenerMatrizCostos(grafoPrim.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matrizPrim, grafoPrim.getVertices(), "Matriz prim");
        
        //KRUSKAL
        TGrafoNoDirigido grafoKruskal = grafo.Kruskal();
        Double[][] matrizKruskal = UtilGrafos.obtenerMatrizCostos(grafoKruskal.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matrizKruskal, grafoKruskal.getVertices(), "Matriz kruskal");
        
        //BEA
        Collection<TVertice> resBEA = grafo.bea();
        System.out.println("BEA:");
        int q = 1;
        for(TVertice v : resBEA){
            System.out.println(q+"- "+v.getEtiqueta());
            q++;
        }
        
    }
}
