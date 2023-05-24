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

public class Expresion {

    public static boolean controlCorchetes(String listaDeEntrada){
        Stack<Character> stack = new Stack<>();
        for (char c : listaDeEntrada.toCharArray())
            if (c == '{')
                stack.push(c);
            else if (c == '}') {
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
        return stack.isEmpty();
    }
    
}
