/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.amandaseara.ut3.pd7;

/**
 *
 * @author Amanda
 * @param <T>
 */
public interface IConjunto<T> extends ILista<T> {
    
    Lista<T> getLista();

    IConjunto<T> union(IConjunto<T> otroConjunto);

    IConjunto<T> interseccion(IConjunto<T> otroConjunto);

}
