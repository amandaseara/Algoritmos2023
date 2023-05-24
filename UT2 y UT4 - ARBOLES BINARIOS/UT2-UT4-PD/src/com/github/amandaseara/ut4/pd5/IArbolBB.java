/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.amandaseara.ut4.pd5;

/**
 *
 * @author Amanda
 */
public interface IArbolBB<T> {
    
    boolean insertar(TElementoBB<T> unElemento);
    
    IElementoBB<T> getRaiz();
    
    boolean esVacio();
    
    /**
     * Obtiene la etiqueta de menor valor en el árbol.
     * @return La etiqueta de menor valor.
     */
    Comparable getMenorEtiqueta();
    
    /**
     * Obtiene la etiqueta de mayor valor en el árbol.
     * @return La etiqueta de mayor valor en el árbol.
     */
    Comparable getMayorEtiqueta();
    
    /**
     * Obtiene el nodo padre del nodo que contiene la clave dada.
     * @param clave La clave a buscar.
     * @return La etiqueta del nodo padre del nodo que contiene la clave dada.
     */
    Comparable anteriorA(Comparable clave);
    
    /**
     * Obtiene la cantidad de nodos que existen en el nivel dado.
     * @param nivel El nivel a buscar.
     * @return La cantidad de nodos que existen en el nivel dado (entre 0 y 2^n).
     */
    int nodosEnNivel(int nivel);
    
    /**
     * Obtiene una String que contiene todas las hojas del árbol con su respectivo nivel.
     * @return Una string en formato ", hoja, hoja", y cada hoja con formato "{dato} - {nivel}"
     */
    String hojasConNivel();
    
    /**
     * Verifica si este árbol binario es efectivamente de busqueda.
     * @return True si el árbol es de busqueda.
     */
    boolean deBusqueda();
    
}
