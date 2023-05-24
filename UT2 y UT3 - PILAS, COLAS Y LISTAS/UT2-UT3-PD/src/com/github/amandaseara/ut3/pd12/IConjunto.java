/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.amandaseara.ut3.pd12;

/**
 *
 * @author Amanda
 */
public interface IConjunto<T> extends ILista<T> {
    
    Lista<T> getLista();
    
    void setLista(Lista<T> list);

    IConjunto<T> union(IConjunto<T> otroConjunto);

    IConjunto<T> interseccion(IConjunto<T> otroConjunto);

}
