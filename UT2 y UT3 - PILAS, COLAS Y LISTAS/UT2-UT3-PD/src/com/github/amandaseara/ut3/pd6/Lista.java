/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd6;

/**
 *
 * @author Amanda
 */
public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (esVacia()) {
            setPrimero(nodo);
        } else {
            Nodo<T> ultimo = primero;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nodo);
        }
    }
    
    @Override
    public void insertar (Comparable etiqueta, T dato ){
        Nodo<T> nodo = new Nodo<T>(etiqueta,dato);
        if (esVacia()) {
            setPrimero(nodo);
        } else {
            Nodo<T> ultimo = primero;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> actual = this.primero;
        while(actual != null){
            if(actual.getEtiqueta().compareTo(clave) == 0){
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.compareTo(clave) == 0) {
            setPrimero(primero.getSiguiente());
            return true;
        }
        INodo<T> aux = primero;
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().compareTo(clave) == 0) {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        String imprimir = "";
        if (!esVacia()){
            INodo<T> aux = primero;
            while (aux != null){
                imprimir += aux.getEtiqueta().toString();
                aux = aux.getSiguiente();
            }
        }
        return imprimir;
    }

    @Override
    public String imprimir(String separador) {
        String imprimir = "";
        if (!esVacia()){
            INodo<T> aux = primero;
            while (aux.getSiguiente() != null){
                imprimir += aux.getEtiqueta().toString();
                imprimir += separador;
                aux = aux.getSiguiente();
            }
            imprimir += aux.getEtiqueta().toString();
        }
        return imprimir;
    }

    @Override
    public int cantElementos() {
        int cant = 0;
        INodo<T> aux = primero;
        while(aux != null){
            cant++;
            aux = aux.getSiguiente();
        }
        return cant;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        primero = unNodo;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

}
