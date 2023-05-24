/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut5.pd1;

/**
 *
 * @author Amanda
 */
public class TArbolG<T> implements IArbolG<T> {
    
    private INodoAG<T> raiz;
    
    public TArbolG(){
        this.raiz = null;
    }
    
    @Override
    public INodoAG<T> getRaiz(){
        return this.raiz;
    }
    
    @Override
    public void setRaiz(INodoAG<T> raiz){
        this.raiz = raiz;
    }
    
    @Override
    public boolean insertar(String unaEtiqueta, Comparable etiquetaPadre){
        if (raiz != null){
            return raiz.insertar(unaEtiqueta, etiquetaPadre);
        } else {
            if (etiquetaPadre == ""){
                INodoAG nuevo = new TNodoAG(unaEtiqueta);
                raiz = nuevo;
                return true;
            }
        }
        return false;
    }

    @Override
    public INodoAG<T> buscar(Comparable unaEtiqueta){
        if (raiz != null){
            return raiz.buscar(unaEtiqueta);
        }
        return null;
    }

    @Override
    public String listarIndentado(){
        if (raiz != null){
            return raiz.listarIndentado("");
        }
        return "";
    }
    
}
