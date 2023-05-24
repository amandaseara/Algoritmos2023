/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd2;

/**
 *
 * @author Amanda
 */
public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
            if (raiz == null) {
                    raiz = unElemento;
                    System.out.println("Contador insertar(): 0");
                    return true;
            } else {
                    return raiz.insertar(unElemento);
            }
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
            if(raiz.equals(unaEtiqueta)){
                return raiz;
            } else {
                return raiz.buscar(unaEtiqueta);
            }
    }

    @Override
    public String preOrden() {
        if (raiz != null) {
                return raiz.preOrden();
        } else {
                return "";
        }
    }

    @Override
    public String inOrden() {
        if (raiz != null) {
                return raiz.inOrden();
        } else {
                return "";
        }
    }

    @Override
    public String postOrden() {
        if (raiz != null) {
                return raiz.postOrden();
        } else {
                return "";
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
