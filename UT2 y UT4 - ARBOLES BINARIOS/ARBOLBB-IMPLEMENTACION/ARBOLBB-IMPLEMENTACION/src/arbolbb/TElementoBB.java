/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbb;

/**
 *
 * @author Amanda
 */
public class TElementoBB<T> implements IElementoBB<T> {
    
    private final Comparable etiqueta;
    private final T datos;
    private TElementoBB<T> hijoIzq;
    private TElementoBB<T> hijoDer;

    public TElementoBB(Comparable unaEtiqueta, T unosDatos) {
        this.etiqueta = unaEtiqueta;
        this.datos = unosDatos;
    }


    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public T getDatos() {
        return this.datos;
    }

    @Override
    public TElementoBB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoBB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoBB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoBB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public boolean insertar(TElementoBB<T> unElemento) {
        if(unElemento.getEtiqueta().compareTo(this.etiqueta) < 0) {
            if(this.hijoIzq == null) {
                this.hijoIzq = unElemento;
                return true;
            }
            return this.hijoIzq.insertar(unElemento);
        }
        if(unElemento.getEtiqueta().compareTo(this.etiqueta) > 0) {
            if(this.hijoDer == null) {
                this.hijoDer = unElemento;
                return true;
            }
            return getHijoDer().insertar(unElemento);
        }
        // ya existe un elemento con la misma etiqueta.
        return false;
    }
    
        @Override
    public TElementoBB<T> buscar(Comparable unaEtiqueta) {
        if(unaEtiqueta.compareTo(this.etiqueta) == 0) {
            return this;
        }
        if(unaEtiqueta.compareTo(this.etiqueta) < 0) {
            if(this.hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta);
            }
        }
        if(unaEtiqueta.compareTo(this.etiqueta) > 0) {
            if(this.hijoDer != null) {
                return getHijoDer().buscar(unaEtiqueta);
            }
        }

        return null;
    }

    @Override
    public String preOrden() {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(this.etiqueta.toString());
        if(this.hijoIzq != null) {
            tempStr.append("-");
            tempStr.append(this.hijoIzq.preOrden());
        }
        if(this.hijoDer != null) {
            tempStr.append("-");
            tempStr.append(this.hijoDer.preOrden());
        }
        return tempStr.toString();
    }

    @Override
    public String inOrden() {
        StringBuilder tempStr = new StringBuilder();
        if(this.hijoIzq != null) {
            tempStr.append(this.hijoIzq.inOrden());
            tempStr.append("-");
        }
        tempStr.append(this.etiqueta.toString());
        if(this.hijoDer != null) {
            tempStr.append("-");
            tempStr.append(this.hijoDer.inOrden());
        }
        return tempStr.toString();
    }

    @Override
    public String postOrden() {
        StringBuilder tempStr = new StringBuilder();
        if(this.hijoIzq != null) {
            tempStr.append(this.hijoIzq.postOrden());
            tempStr.append("-");
        }
        if(this.hijoDer != null) {
            tempStr.append(this.hijoDer.postOrden());
            tempStr.append("-");
        }
        tempStr.append(this.etiqueta.toString());
        return tempStr.toString();
    }

    @Override
    public TElementoBB<T> eliminar(Comparable unaEtiqueta) {
        if(unaEtiqueta.compareTo(this.etiqueta) < 0) {
            if(this.hijoIzq != null) {
                this.hijoIzq = this.hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }
        if(unaEtiqueta.compareTo(this.etiqueta) > 0) {
            if(this.hijoDer != null) {
                this.hijoDer = this.hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }
        
        //Es igual
        return quitaElNodo();
    }

    @Override
    public TElementoBB<T> quitaElNodo() {
        if(this.hijoIzq == null) {
            return this.hijoDer;
        }
        if(this.hijoDer == null) {
            return this.hijoIzq;
        }
        //es un nodo completo
        TElementoBB<T> elPadre = this;
        TElementoBB<T> elHijo = this.hijoIzq;
        while (elHijo.hijoDer != null) {
            elPadre = elHijo;
            elHijo = elHijo.hijoDer;
        }

        if (elPadre != this){
            elPadre.hijoDer = elHijo.hijoIzq;
            elHijo.hijoIzq = this.hijoIzq;
        }

        elHijo.hijoDer = this.hijoDer;
        return elHijo;
    }

    @Override
    public int obtenerAltura() {
        int altIzq = -1;
        int altDer = -1;
        if (this.hijoIzq != null) {
            altIzq = this.hijoIzq.obtenerAltura();
        }

        if (this.hijoDer != null) {
            altDer = this.hijoDer.obtenerAltura();
        }

        return Math.max(altDer, altIzq) + 1;
    }

    @Override
    public int obtenerTamano() {
        int tamSubArboles = 0;
        if (this.hijoIzq != null) {
            tamSubArboles += this.hijoIzq.obtenerTamano();
        }

        if (this.hijoDer != null) {
            tamSubArboles += this.hijoDer.obtenerTamano();
        }
        return tamSubArboles + 1;
    }


    @Override
    public int obtenerNivel(Comparable unaEtiqueta, int nivelActual) {
        if(this.etiqueta.compareTo(unaEtiqueta) == 0){
            return nivelActual;
        }
        if(unaEtiqueta.compareTo(this.etiqueta) < 0 &&
                this.hijoIzq != null){
            return this.hijoIzq.obtenerNivel(unaEtiqueta, nivelActual+1);
        }
        if(unaEtiqueta.compareTo(this.etiqueta) > 0 &&
                this.hijoDer != null){
            return this.hijoDer.obtenerNivel(unaEtiqueta, nivelActual+1);

        }
        return -1;
    }

    @Override
    public int obtenerCantidadHojas() {
        int hojas = 0;

        if(this.hijoIzq == null && this.hijoDer == null) return 1;

        if(this.hijoIzq != null){
            hojas += this.hijoIzq.obtenerCantidadHojas();
        }

        if(this.hijoDer != null){
            hojas += this.hijoDer.obtenerCantidadHojas();
        }

        return hojas;
    }

    @Override
    public Comparable anteriorA(Comparable clave) {
        if(clave.compareTo(this.etiqueta) < 0){
            if(this.hijoIzq != null){
                if(this.hijoIzq.getEtiqueta().compareTo(clave) == 0){
                    return this.etiqueta;
                }else{
                    return this.hijoIzq.anteriorA(clave);
                }
            }
        }
        if(clave.compareTo(this.etiqueta) > 0){
            if(this.hijoDer != null){
                if(this.hijoDer.getEtiqueta().compareTo(clave) == 0){
                    return this.etiqueta;
                }else{
                    return this.hijoDer.anteriorA(clave);
                }
            }
        }
        return null;
    }
    
    @Override
    public int nodosEnNivel(int nivel){
        if(nivel == 0) return 1;

        int suma = 0;
        if(this.hijoIzq != null){
            suma += this.hijoIzq.nodosEnNivel(nivel-1);
        }
        if(this.hijoDer != null){
            suma += this.hijoDer.nodosEnNivel(nivel-1);
        }

        return suma;
    }

    @Override
    public String hojasConNivel(int nivelActual) {
        if(this.hijoIzq == null && this.hijoDer == null){
            return ", "+this.datos+" - "+nivelActual;
        }
        String res = "";
        if(this.hijoIzq != null){
            res += this.hijoIzq.hojasConNivel(nivelActual + 1);
        }
        if(this.hijoDer != null){
            res += this.hijoDer.hojasConNivel(nivelActual + 1);
        }

        return res;
    }

    @Override
    public boolean deBusqueda() {
        if(this.hijoIzq != null){
            if(this.hijoIzq.getEtiqueta().compareTo(this.etiqueta) >= 0) {
                return false;
            }
            return this.hijoIzq.deBusqueda();
        }
        if(this.hijoDer != null){
            if(this.hijoDer.getEtiqueta().compareTo(this.etiqueta) <= 0){
                return false;
            }
            return this.hijoDer.deBusqueda();
        }
        return true;
    }
    
}
