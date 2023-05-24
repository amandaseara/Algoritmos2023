/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd7;

/**
 *
 * @author Amanda
 */
public class Conjunto<T> implements IConjunto<T> {

    private final Lista<T> lista = new Lista<>();
    
    @Override
    public Lista<T> getLista(){
        return lista;
    }

    @Override
    public IConjunto<T> union(IConjunto<T> otroConjunto) {
        Conjunto<T> conjunto = new Conjunto<>();
        INodo<T> nodo = this.lista.getPrimero();
        while(nodo != null){
            conjunto.getLista().insertar(new Nodo<>(nodo.getEtiqueta(), nodo.getDato()));
            nodo = nodo.getSiguiente();
        }
        nodo = otroConjunto.getLista().getPrimero();
        while(nodo != null){
            conjunto.getLista().insertar(new Nodo<>(nodo.getEtiqueta(), nodo.getDato()));
            nodo = nodo.getSiguiente();
        }
        return conjunto;
    }

    @Override
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto) {
        Conjunto<T> conjunto = new Conjunto<>();
        INodo<T> nodo = this.lista.getPrimero();
        while(nodo != null){
            INodo<T> otroNodo = otroConjunto.getLista().getPrimero();
            while(otroNodo != null){
                if(otroNodo.compareTo(nodo.getEtiqueta()) == 0){
                    conjunto.getLista().insertar(new Nodo<>(nodo.getEtiqueta(), nodo.getDato()));
                    break;
                }
                otroNodo = otroNodo.getSiguiente();
            }
            nodo = nodo.getSiguiente();
        }

        return conjunto;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

