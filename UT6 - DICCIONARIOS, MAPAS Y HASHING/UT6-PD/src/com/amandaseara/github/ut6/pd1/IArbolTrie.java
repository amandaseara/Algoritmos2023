/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.amandaseara.github.ut6.pd1;

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public interface IArbolTrie {
    
    void imprimir();
    
    int buscar(String palabra);

    void insertar(String palabra);

    LinkedList<String> predecir(String prefijo);    
    
}
