/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd2;

/**
 *
 * @author Amanda
 */
public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    private static int invInsertar = 0;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }

    public void setHijoIzq(TElementoAB<T> elemento) {
        hijoIzq = elemento;
    }

    public void setHijoDer(TElementoAB<T> elemento) {
        hijoDer = elemento;
    }

    public T getDatos() {
        return datos;
    }

    public boolean insertar(TElementoAB<T> elemento) {
        int comp = elemento.getEtiqueta().compareTo(etiqueta);
        if (comp < 0) {
            if (hijoIzq != null) {
                return hijoIzq.insertar(elemento);
            } else {
                hijoIzq = elemento;
                invInsertar = 0;
                return true;
            }
        } else if (comp > 0) {
            if (hijoDer != null) {
                return hijoDer.insertar(elemento);
            } else {
                hijoDer = elemento;
                invInsertar = 0;
                return true;
            }
        } else {
            invInsertar = 0;
            return false;
        }
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (getEtiqueta().equals(unaEtiqueta)) {
            return this;
        }
        if (getHijoIzq() != null && unaEtiqueta.compareTo(getEtiqueta()) < 0) {
            return getHijoIzq().buscar(unaEtiqueta);
        } 
        if (getHijoDer() != null && unaEtiqueta.compareTo(getEtiqueta()) > 0) {
            return getHijoDer().buscar(unaEtiqueta);
        }
        return null;
    }

    @Override
    public String preOrden() {
        String resultado = etiqueta.toString();

        if (hijoIzq != null) {
            resultado += " - " + hijoIzq.preOrden();
        }

        if (hijoDer != null) {
            resultado += " - " + hijoDer.preOrden();
        }

        return resultado;
    }

    public String inOrden() {
        String resultado = "";

        if (hijoIzq != null) {
            resultado = hijoIzq.inOrden();

            if (resultado != "") {
                resultado += " - ";
            }
        }

        resultado += etiqueta.toString();

        if (hijoDer != null) {
            String der = hijoDer.inOrden();

            if (der != "") {
                resultado += " - " + der;
            }
        }

        return resultado;
    }

    public String postOrden() {
        String resultado = "";
        
        if (hijoIzq != null) {
            resultado += hijoIzq.postOrden() + " - ";
        }

        if (hijoDer != null) {
            resultado += hijoDer.postOrden() + " - ";
        }
        resultado += etiqueta.toString();

        return resultado;
    }

    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
