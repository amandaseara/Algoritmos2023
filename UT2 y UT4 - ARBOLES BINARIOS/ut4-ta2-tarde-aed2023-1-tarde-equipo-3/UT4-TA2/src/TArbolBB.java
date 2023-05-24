
public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;
    
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        this.raiz = null;
    }
    
    public boolean esVacio(){
        return raiz == null;
    }
    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operacián
     */

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        unElemento.setContadorI(0);
        if(esVacio()){
            this.raiz = unElemento;
            return true;
        }
        return this.raiz.insertar(unElemento);
    }

    /**
     * Busca un elemento dentro del árbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar. .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta){
        if(esVacio()){
            return null;
        }
        return this.raiz.buscar(unaEtiqueta);
    }

    /**
     * Imprime en PreOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    @Override
    public String preOrden(){
        if(esVacio()){
            return "";
        }
        return this.raiz.preOrden();
    }

    /**
     * Imprime en InOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    @Override
    public String inOrden(){
        if(esVacio()){
            return "";
        }
        return this.raiz.inOrden();
    }

    /**
     * Imprime en PostOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    @Override
    public String postOrden(){
        if(esVacio()){
            return "arbol vacio";
        }
        return this.raiz.postOrden();
    }

    /**
     * Elimina un elemento dada una etiqueta.
     *
     * @param unaEtiqueta
     */
    @Override
    public void eliminar(Comparable unaEtiqueta){
        if(!esVacio()){
            this.raiz.eliminar(unaEtiqueta);
        }
    }
    
    public int obtenerAltura() {
        if(esVacio()) {
            return -1;
        }
        return this.raiz.obtenerAltura();
    }

    public int obtenerCantidadHojas() {
        if(esVacio()) {
            return 0;
        }
        return this.raiz.obtenerCantidadHojas();
    }

}
