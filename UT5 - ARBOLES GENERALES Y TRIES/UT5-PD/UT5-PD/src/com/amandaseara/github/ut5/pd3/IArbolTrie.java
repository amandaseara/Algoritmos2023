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
public interface IArbolTrie {
    
    void imprimir();
    
    void imprimirIndice();
    
    void indizarLibro(String rutaArchivo);
    
    void insertarConIndice(String palabra, int pagina);
    
    void insertar(String palabra);
    
    int buscar(String palabra);

    LinkedList<String> predecir(String prefijo);
    
}
