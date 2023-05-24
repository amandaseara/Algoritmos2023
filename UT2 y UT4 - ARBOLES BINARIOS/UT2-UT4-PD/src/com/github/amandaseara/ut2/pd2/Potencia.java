/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut2.pd2;

/**
 *
 * @author Amanda
 */
public class Potencia {
    
    public static void main(String[] args){
        /* Mi algoritmo solo soporta numeros enteros, ya que el algoritmo para float se realizaria diferente
        teniendo en cuenta los decimales
        */
        //int pruebaReales = potenciaEnteros(5.3,8.9);
        
        /* Si el numero a elevar es negativo se calcula la potencia correctamente
        tanto si el resultado es positivo o negativo
        */
        int pruebaNeg1 = potenciaEnteros(-2,4);
        int pruebaNeg2 = potenciaEnteros(-2,3);
        System.out.println(pruebaNeg1);
        System.out.println(pruebaNeg2);
        
        /* Si el exponente es negativo no compila
        StackOverflowError
        */
        //int pruebaNeg3 = potenciaEnteros(3,-3);
        
        /* Si ambos son negativos ocurre el mismo error
        */
        //int pruebaNeg4 = potenciaEnteros(-3,-3);
    }
    
    public static int potenciaEnteros (int numero, int exponente){
        if (exponente == 0){
            return 1;
        } else {
            return numero * potenciaEnteros(numero, exponente - 1);
        }
    }
    
}
