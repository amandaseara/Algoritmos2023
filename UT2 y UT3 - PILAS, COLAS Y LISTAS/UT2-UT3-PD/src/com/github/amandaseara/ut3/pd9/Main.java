/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd9;

import java.util.Stack;

/**
 *
 * @author Amanda
 */
public class Main {
    
    public static void main(String[] args) {
        
        String prueba1 = "{}{}{}{}";
        System.out.println("La expresion "+prueba1+" es: "+Expresion.controlCorchetes(prueba1));
        
        
        String prueba2 = "{{{}}}";
        System.out.println("La expresion "+prueba2+" es: "+Expresion.controlCorchetes(prueba2));
        
        String prueba3 = "{}{}{}{}}}}}}}}}}";
        System.out.println("La expresion "+prueba3+" es: "+Expresion.controlCorchetes(prueba3));
        
        
        String prueba4 = "{}";
        System.out.println("La expresion "+prueba4+" es: "+Expresion.controlCorchetes(prueba4));
        
        
        String prueba5 = "}";
        System.out.println("La expresion "+prueba5+" es: "+Expresion.controlCorchetes(prueba5));
        
        
        String prueba6 = "{";
        System.out.println("La expresion "+prueba6+" es: "+Expresion.controlCorchetes(prueba6));
        
    }
    
}
