/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package arbolbb;

/**
 *
 * @author Amanda
 */
public interface IElementoBB<T> {
    
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
     * Asigna el hijo izquierdo del nodo.
     *
     * @param elemento El elemento a asignar como hijo izquierdo.
     */
    void setHijoIzq(TElementoBB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @param elemento El elemento a ser asignado como hijo derecho.
     */
    void setHijoDer(TElementoBB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    TElementoBB<T> buscar(Comparable unaEtiqueta);

    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Éxito de la operación.
     */
    boolean insertar(TElementoBB<T> elemento);

    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @return String conteniendo el PreOrden
     */
    String preOrden();

    /**
     * Imprime en inorden el arbol separado por guiones.
     *
     * @return String conteniendo el InOrden
     */
    String inOrden();

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @return String conteniendo el PostOrden
     */
    String postOrden();

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return los datos contenidos en el elemento.
     */
    T getDatos();

    /**
     * Elimina el elemento con la etiqueta dada del subárbol de este nodo.
     * @param unaEtiqueta La etiqueta del nodo a eliminar.
     * @return True si logró encontrar y eliminar el nodo.
     */
    TElementoBB<T> eliminar(Comparable unaEtiqueta);

    /**
     * Quita el nodo y produce una rotación en el árbol de ser necesario
     * @return El nodo que suplantará la posición de este nodo.
     */
    TElementoBB<T> quitaElNodo();

    /**
     * Retorna la altura del arbol cuya raíz es la del nodo actual.
     * @return Altura del subárbol.
     */
    int obtenerAltura();

    /**
     * Retorna el tamaño del arbol cuya raíz es la del nodo actual.
     * @return tamaño del subárbol.
     */
    int obtenerTamano();

    /**
     * Retorna el nivel del elemento cuya etiqueta es la pasada por parámetro.
     * @param unaEtiqueta La etiqueta a buscar.
     * @return El nivel del nodo que contiene la etiqueta dada, -1 si no se encuentra.
     */
    int obtenerNivel(Comparable unaEtiqueta, int nivelActual);

    /**
     * Retorna la cantidad de hojas del arbol cuya raíz es la del nodo actual.
     * @return Cantidad de hojas del subárbol.
     */
    int obtenerCantidadHojas();

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
