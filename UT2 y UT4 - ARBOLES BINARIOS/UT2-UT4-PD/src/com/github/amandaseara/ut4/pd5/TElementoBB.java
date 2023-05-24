/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd5;

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
