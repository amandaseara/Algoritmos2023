/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.amandaseara.github.ut5.pd3;

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public interface INodoTrie {
    
    int buscar(String s); // devuelve la cantidad de comparaciones!
    
    public TNodoTrie buscarNodoTrie(String s);
    
    void imprimir();
    
    String imprimirIndice(String s, TNodoTrie nodo, String res);

    void insertarConIndice(String unaPalabra, String pagina);
    
    void insertar(String unaPalabra);
    
    public void predecir(String prefijo, LinkedList<String> palabras);
    
}
