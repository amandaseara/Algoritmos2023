/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amandaseara.github.ut8.grafoNoDirigido;

/**
 *
 * @author Amanda
 */
public interface IArista {

    double getCosto();

    Comparable getEtiquetaDestino();

    Comparable getEtiquetaOrigen();

    void setCosto(double costo);

    void setEtiquetaDestino(Comparable etiquetaDestino);

    void setEtiquetaOrigen(Comparable etiquetaOrigen);
	
	public TArista aristaInversa ();
    
}
