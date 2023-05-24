/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd3;

/**
 *
 * @author Amanda
 */
public class Nodo<T> implements INodo<T> {
    
    private final Comparable etiqueta;
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(Comparable etiqueta, T dato ) {
        this.etiqueta = etiqueta;
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;

    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    @Override
    public void imprimir() {
        System.out.println(dato.toString());
    }

    @Override
    public void imprimirEtiqueta() {
        System.out.println(etiqueta);
    }

    public Nodo<T> clonar() {
        return new Nodo<>(etiqueta, dato);
    }

    public boolean equals(Nodo unNodo) {
        return dato.equals(unNodo.getDato());
    }

    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }

    @Override
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(Nodo<T> nodo) {
        this.siguiente = nodo;
    }
    
}
