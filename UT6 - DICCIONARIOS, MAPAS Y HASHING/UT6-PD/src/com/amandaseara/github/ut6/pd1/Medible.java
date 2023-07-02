/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.amandaseara.github.ut6.pd1;

import java.io.Serializable;

/**
 *
 * @author Amanda
 */
public abstract class Medible implements Serializable {

    public Medicion medir(Object... params){
        long init = System.nanoTime();
        ejecutar(params);
        long fin = System.nanoTime();
        return new Medicion(this.getClass().getSimpleName(), ObjectSizeFetcher.getObjectSize(getObjetoAMedirMemoria()), fin-init);
    }
    
    abstract public void ejecutar(Object... params);
    
    abstract public Object getObjetoAMedirMemoria();
    
}