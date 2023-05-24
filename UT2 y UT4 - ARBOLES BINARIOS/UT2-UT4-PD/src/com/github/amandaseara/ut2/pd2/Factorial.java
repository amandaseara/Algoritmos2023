/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut2.pd2;

/**
 *
 * @author Amanda
 */
public class Factorial {
    
    public static void main(String[] args){
        /*Si el numero es negativo se devuelve como resultado 1*/
        System.out.println(calculoFactorial(-2));
        
        System.out.println("El factorial de 4 es: " + calculoFactorial(4));
        System.out.println("El factorial de 5 es: " + calculoFactorial(5));
        System.out.println("El factorial de 0 es: " + calculoFactorial(0));
    }
    
    /*Devuelve el calculo factorial de un entero n,
    como no existe el factorial para numeros no naturales se devuelve 1 para los demas*/
    public static int calculoFactorial(int n){
        int res = 1;
        if (n > 0){
            res = n * calculoFactorial(n-1);
        }
        return res;
    }
}
