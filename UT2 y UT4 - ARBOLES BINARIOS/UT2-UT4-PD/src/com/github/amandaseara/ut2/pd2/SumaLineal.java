/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut2.pd2;

/**
 *
 * @author Amanda
 */
public class SumaLineal {
    
    public static void main(String[] args){
        int[] a1 = new int[5];
        for (int i = 0; i < a1.length; i++){
            a1[i] = i;
        }
        /* Si se ingresa un int negativo el programa no compila
        porque se intenta ingresar a una posicion en el arreglo que no existe
        */
        //System.out.println(suma(a1, -2));
        
        /* Si se ingresa un arreglo vacio el programa no compila
        porque se intenta igresar a datos que no estan inicializados
        */
        int[] a2 = new int[0];
        //System.out.println(suma(a2,2));
    }
    
    public static int suma(int[] A, int n){
        if (n==0){
            return A[0];
        } else {
            return suma(A,n-1) + A[n-1];
        }
    }
}
