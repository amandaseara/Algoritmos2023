/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd0;

/**
 *
 * @author Amanda
 */
public class Nodo {
    
    private String dato;
    private Nodo izquierdo;
    private Nodo derecho;
    private boolean operacion;
    
    public void Nodo(){
        this.izquierdo = null;
        this.derecho = null;
    }


    public String getDato(){
        return this.dato;
    }
    
    public void setDato(String dato){
        this.dato = dato;
    }
    
    public boolean getOperacion(){
        return this.operacion;
    }
    
    public void setOperacion(boolean operacion){
        this.operacion = operacion;
    }

    public Nodo getIzquierdo(){
        return this.izquierdo;
    }
    
    public void setIzquierdo(Nodo nodo){
        this.izquierdo = nodo;
    }

    public Nodo getDerecho(){
        return this.derecho;
    }
    
    public void setDerecho(Nodo nodo){
        this.derecho = nodo;
    }
    
    public int calcularOperacion(){
        int valorIzquierda = 0;
        int valorDerecha = 0;
        
        if(this.getIzquierdo() != null){
            valorIzquierda = this.getIzquierdo().calcularOperacion();
        }
        if(this.getDerecho() != null){
            valorDerecha = this.getDerecho().calcularOperacion();
        }
        if (this.getDato().contains("+"))
            return valorIzquierda + valorDerecha;
        else if (this.getDato().contains("-"))
            return valorIzquierda - valorDerecha;
        else if (this.getDato().contains("*"))
            return valorIzquierda * valorDerecha;
        else if (this.getDato().contains("/"))
            return valorIzquierda / valorDerecha;
        else
            return Integer.parseInt(this.getDato());
    }
}
