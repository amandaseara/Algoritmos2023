
public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB<T> hijoIzquierdo;
    private TElementoAB<T> hijoDerecho;
    private T dato;

    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzquierdo;
    }

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDerecho;
    }

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @return Elemento a ser asignado como hijo izquierdo.
     */
    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzquierdo = elemento;
    }

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @return Elemento a ser asignado como hijo derecho.
     */
    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDerecho = elemento;
    }

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (this.getEtiqueta().compareTo(unaEtiqueta) == 0) {
            return this;
        } else if (this.getEtiqueta().compareTo(unaEtiqueta) > 0) {
            if (this.hijoIzquierdo != null) {
                return this.hijoIzquierdo.buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else {
            if (this.hijoDerecho != null) {
                return this.hijoDerecho.buscar(unaEtiqueta);
            } else {
                return null;
            }
        }
    }
    
    private static int contadorInsertar;
    
    public void setContadorI(int cont){
        contadorInsertar = cont;
    }
    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operacion.
     */
    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        contadorInsertar++;
        /*System.out.println("Esta es la vez numero " + contadorInsertar + " que se ingresa al metodo al insertar el numero "+
                elemento.getEtiqueta());*/
        if (this.getEtiqueta().compareTo(elemento.getEtiqueta()) == 0) {
            System.out.println("El elemento '" + elemento.getEtiqueta()
                    + "' ya se encuentra dentro del arbol.");
            return false;
        } else if (elemento.getEtiqueta().compareTo(this.getEtiqueta()) < 0) {
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = elemento;
                return true;
            } else {
                return this.hijoIzquierdo.insertar(elemento);
            }
        } else {
            if (this.hijoDerecho == null) {
                this.hijoDerecho = elemento;
                return true;
            } else {
                return this.hijoDerecho.insertar(elemento);
            }
            
        }
    }

    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @return String conteniendo el PreOrden
     */
    @Override
    public String preOrden() {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(this.etiqueta.toString());
        if(this.hijoIzquierdo != null) {
            tempStr.append("-");
            tempStr.append(this.hijoIzquierdo.preOrden());
        }
        if(this.hijoDerecho != null) {
            tempStr.append("-");
            tempStr.append(this.hijoDerecho.preOrden());
        }
        return tempStr.toString();
    }

    /**
     * Imprime en inorden el arbol separado por guiones.
     *
     * @return String conteniendo el InOrden
     */
    @Override
    public String inOrden() {
        String output = "";
        if (this.hijoIzquierdo != null) {
            output += this.hijoIzquierdo.inOrden();
        }
        output += this.etiqueta.toString() + "-";
        if (this.hijoDerecho != null) {
            output += this.hijoDerecho.inOrden();
        }
        return output;
    }

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @return String conteniendo el PostOrden
     */
    @Override
    public String postOrden() {
        String output = "";
        if (this.hijoIzquierdo != null) {
            output += this.hijoIzquierdo.postOrden();
        }
        if (this.hijoDerecho != null) {
            output += this.hijoDerecho.postOrden();
        }
        output += this.etiqueta.toString() + "-";
        return output;
    }

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    @Override
    public T getDatos() {
        return this.dato;
    }

    /**
     * Elimina un elemento dada una etiqueta.
     *
     * @param unaEtiqueta
     * @return
     */
    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        // cambiar
        return null;
    }
    
    public int obtenerAltura(){
        int altIzq = -1;
        int altDer = -1;
        if (this.hijoIzquierdo != null) {
            altIzq = this.hijoIzquierdo.obtenerAltura();
        }

        if (this.hijoDerecho != null) {
            altDer = this.hijoDerecho.obtenerAltura();
        }

        return Math.max(altDer, altIzq) + 1;
    }
    
    public int obtenerCantidadHojas() {
        int hojas = 0;

        if(this.hijoIzquierdo == null && this.hijoDerecho == null) return 1;

        if(this.hijoIzquierdo != null){
            hojas += this.hijoIzquierdo.obtenerCantidadHojas();
        }

        if(this.hijoDerecho != null){
            hojas += this.hijoDerecho.obtenerCantidadHojas();
        }

        return hojas;
    }

}
