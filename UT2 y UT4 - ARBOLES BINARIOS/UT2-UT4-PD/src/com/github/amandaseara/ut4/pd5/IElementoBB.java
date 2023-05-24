/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.amandaseara.ut4.pd5;

/**
 *
 * @author Amanda
 */
public interface IElementoBB<T> {
    
    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Éxito de la operación.
     */
    boolean insertar(TElementoBB<T> elemento);
    
    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    TElementoBB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    TElementoBB<T> getHijoDer();
    
    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return los datos contenidos en el elemento.
     */
    T getDatos();
    
    /**
     * Obtiene el nodo padre de un nodo con la clave dada.
     * @param clave La clave a buscar.
     * @return El nodo padre del nodo a buscar, o null si no existe nodo con esa etiqueta, o si el mismo es la raíz.
     */
    Comparable anteriorA(Comparable clave);
    
    public int nodosEnNivel(int nivel);

    /**
     * Obtiene una String que contiene todas las hojas del árbol con su respectivo nivel.
     * @return Una string en formato ", hoja, hoja", y cada hoja con formato "{dato} - {nivel}"
     */
    String hojasConNivel(int nivelActual);

    /**
     * Verifica si el subárbol binario del nodo es efectivamente de búsqueda.
     * @return True si el subárbol es de búsqueda.
     */
    boolean deBusqueda();
    
}
