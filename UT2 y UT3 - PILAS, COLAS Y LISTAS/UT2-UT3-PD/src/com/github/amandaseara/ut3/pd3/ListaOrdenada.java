/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd3;

/**
 *
 * @author Amanda
 */
public class ListaOrdenada<T> extends Lista<T> {

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        Nodo<T> unNodo = new Nodo<T>(etiqueta, dato);
        if (esVacia()){
            setPrimero(unNodo);
            return;            
        }
        if (unNodo.getEtiqueta().compareTo(getPrimero().getEtiqueta()) < 0){
            unNodo.setSiguiente(getPrimero());
            setPrimero(unNodo);
            return;
        }
        Nodo<T> nodoTemp = getPrimero();
        while ((nodoTemp.getSiguiente() != null) && (nodoTemp.getSiguiente().getEtiqueta().compareTo(unNodo.getEtiqueta()) < 0)){
            nodoTemp = nodoTemp.getSiguiente();
        }
        unNodo.setSiguiente(nodoTemp.getSiguiente());
        nodoTemp.setSiguiente(unNodo);
    }
    
}
