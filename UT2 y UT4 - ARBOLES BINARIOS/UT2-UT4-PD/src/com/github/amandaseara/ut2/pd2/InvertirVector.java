/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut2.pd2;

/**
 *
 * @author Amanda
 */
public class InvertirVector {
    
    public static void main(String[] args){
        int[] vector = new int[5];
        int[] copia = new int[5];
        int[] copia2 = new int[5];
        for (int i=0; i<5; i++){
            vector[i] = i;
            copia[i] = i;
            copia2[i] = i;
        }
        
        //Probamos invertirlos nada mas los numeros del centro
        invertir(vector, copia, 1,3);
        System.out.println("VECTOR ORIGINAL");
        for (int i=0; i<5; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("\nVECTOR INVERTIDO EN EL CENTRO");
        for (int i=0; i<5; i++){
            System.out.print(copia[i] + " ");
        }
        
        //Probamos invertirlo entero
        invertir(vector, copia, 0,4);
        System.out.println("\nVECTOR INVERTIDO COMPLETAMENTE");
        for (int i=0; i<5; i++){
            System.out.print(copia2[i] + " ");
        }
        
        //Al intentar invertir con parametros fuera de rango no compila
        /* ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        */
        //invertir(vector, copia, 1, 5);
        
        //Al invertir un vector con solo un elemento queda igual
        int[] vectorUnElemento = new int[1];
        vectorUnElemento[0] = 1;
        int[] copia3 = new int[1];
        copia3[0] = 1;
        invertir(vectorUnElemento,copia3,0,0);
        System.out.println("\nVECTOR CON SOLO UN ELEMENTO ORIGINAL\n" + vectorUnElemento[0] + "\nVECTOR CON SOLO UN ELEMENTO INVERTIDO\n"+copia3[0]);
        
        //Al intentar invertir un vector vacio no compila
        int[] vectorVacio = new int[0];
        int[] copia4 = new int[0];
        /* ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0
        */
        //invertir(vectorVacio,copia4,1,2);
        /* ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        */
        //invertir(vectorVacio,copia4,0,0);
    }
    
    public static void invertir(int[] a, int[] copiaA, int izq, int der){
        if (izq <= der){
            copiaA[izq] = a[der];
            copiaA[der] = a[izq];
            izq++;
            der--;
            invertir(a,copiaA,izq,der);
        }
    }
}
