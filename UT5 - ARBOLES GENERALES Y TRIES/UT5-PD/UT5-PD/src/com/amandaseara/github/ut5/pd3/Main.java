/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut5.pd3;

/**
 *
 * @author Amanda
 */
public class Main {
    
    public static void main(String[] args){
        
        TArbolTrie trie = new TArbolTrie();
        
        String[] palabras = ManejadorArchivosGenerico.leerArchivo("src\\com\\amandaseara\\github\\ut5\\pd3\\PalabrasIndice.txt");
        for (String p : palabras){
            trie.insertar(p);
        }
        
        trie.indizarLibro("src\\com\\amandaseara\\github\\ut5\\pd3\\libro.txt");
        
        trie.imprimirIndice();
    }
    
}