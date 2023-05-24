/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package arbolbb;

/**
 *
 * @author Amanda
 */
public interface IArbolBB<T> {
    
    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operacián
     */
    boolean insertar(TElementoBB<T> unElemento);



    /**
     * Busca un elemento dentro del árbol.
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    TElementoBB<T> buscar(Comparable unaEtiqueta);

    /**
     * Imprime en PreOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    String preOrden();

    /**
     * Imprime en InOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    String inOrden();

    /**
     * Imprime en PostOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    String postOrden();


    /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     */
    void eliminar(Comparable unaEtiqueta);

    IElementoBB<T> getRaiz();

    /**
     * Retorna la altura del arbol.
     * @return Altura del arbol.
     */
    int obtenerAltura();

    /**
     * Retorna el tamaño del arbol.
     * @return Tamaño del arbol.
     */
    int obtenerTamano();

    /**
     * Retorna el nivel del arbol a partir de la etiqueta indicada
     * @param unaEtiqueta
     * @return Nivel
     */
    int obtenerNivel(Comparable unaEtiqueta);

    /**
     * Retorna la cantidad de hojas del arbol.
     * @return Cantidad de hojas del arbol.
     */
    int obtenerCantidadHojas();

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
    
    //boolean encuentraLinealUno(String nombreAtributo,  valorAtributo);
    
    //boolean IElementoBB encuentraLinealTres(nombreAtributo, valorAtributo): devuelve la referencia al primer elemento encontrado, y nulo en caso contrario
    
}
