/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut6.pd1;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public class TArbolTrie implements IArbolTrie, Serializable {

    private INodoTrie raiz;
    
    public TArbolTrie(){
        raiz = null;
    }

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        return this.raiz.buscar(palabra);
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        LinkedList<String> palabras = new LinkedList<>();
        this.raiz.predecir(prefijo, palabras);
        return palabras;
    }
    
}
