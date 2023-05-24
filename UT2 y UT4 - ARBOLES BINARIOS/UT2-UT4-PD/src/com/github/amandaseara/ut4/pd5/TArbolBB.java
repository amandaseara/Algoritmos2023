/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd5;

/**
 *
 * @author Amanda
 */
public class TArbolBB<T> implements IArbolBB<T> {
    
    private TElementoBB<T> raiz;

    public TArbolBB() {
        this.raiz = null;
    }


    @Override
    public IElementoBB<T> getRaiz() {
        return this.raiz;
    }
    
    public boolean esVacio(){
        return this.raiz == null;
    }
    
    @Override
    public boolean insertar(TElementoBB<T> unElemento) {
        if (this.raiz == null) {
            this.raiz = unElemento;
            return true;
        }
        return this.raiz.insertar(unElemento);
    }
    
    @Override
    public Comparable getMenorEtiqueta() {
        if(esVacio()){
            return null;
        }
        IElementoBB<T> temp = this.raiz;
        while(temp.getHijoIzq() != null){
            temp = temp.getHijoIzq();
        }
        return temp.getEtiqueta();
    }

    @Override
    public Comparable getMayorEtiqueta() {
        if(esVacio()){
            return null;
        }
        IElementoBB<T> temp = this.raiz;
        while(temp.getHijoDer() != null){
            temp = temp.getHijoDer();
        }
        return temp.getEtiqueta();
    }

    @Override
    public Comparable anteriorA(Comparable clave) {
        if(esVacio()){
            return null;
        }
        return this.raiz.anteriorA(clave);
    }

    public int nodosEnNivel(int nivel){
        if(esVacio()){
            return 0;
        }
        return this.raiz.nodosEnNivel(nivel);
    }

    @Override
    public String hojasConNivel() {
        if(esVacio()) {
            return "Arbol vacío";
        }
        return this.raiz.hojasConNivel(0);
    }

    @Override
    public boolean deBusqueda() {
        if(esVacio()) {
            return true;
        }
        return this.raiz.deBusqueda();
    }
    
}
