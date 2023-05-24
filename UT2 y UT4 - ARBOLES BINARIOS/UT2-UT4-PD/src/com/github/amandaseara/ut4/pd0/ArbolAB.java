/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.pd0;

/**
 *
 * @author Amanda
 */
public class ArbolAB {
    
    private Nodo primero;
    
    public void ArbolAB(){
        this.primero = null;
    }
    
    //Setea el primero
    public void setPrimero(Nodo primero){
        this.primero = primero;
    }
    
    //Devuelve el primero
    public Nodo getPrimero(){
        return this.primero;
    }
    
    //Precondiciones: Debe existir el arbol y estar vacio, la operacion pasada por string debe contener parentesis en todas sus operaciones.
    //Postcondicion: Se modifica el arbol, de manera que su recorrido inOrden ser la operacion aritmetica escrita en el string.
    public Nodo insertarOperacion(String operacion){
        for (int i = 0; i < operacion.length(); i++){
            if (!operacion.substring(i, i+1).contains(")") && !operacion.substring(i, i+1).contains("(")){
                if (this.primero == null){
                    Nodo nuevo = new Nodo();
                    nuevo.setDato(operacion.substring(i, i+1));
                    nuevo.setOperacion(false);
                    primero = nuevo;
                }
                else if (operacion.substring(i, i+1).contains("+") || operacion.substring(i, i+1).contains("-") || operacion.substring(i, i+1).contains("/") || operacion.substring(i, i+1).contains("*")){
                    Nodo nuevo = new Nodo();
                    nuevo.setDato(operacion.substring(i, i+1));
                    nuevo.setOperacion(true);
                    nuevo.setIzquierdo(primero);
                    primero = nuevo;
                    if (operacion.substring(i+1, i+2).contains("(")){
                        primero.setDerecho(insertarOperacion(operacion.substring(i+1)));
                    }
                } else {
                    Nodo nuevo = new Nodo();
                    nuevo.setDato(operacion.substring(i, i+1));
                    nuevo.setOperacion(false);
                    primero.setDerecho(nuevo);
                }
            }
        }
        return primero;
    }
    
    //Precondiciones: El arbol debe existir y contener una operacion aritmetica que su recorrido inOrden la exprese.
    //Postcondiciones: No se realizan cambios en el arbol y se devuelve un int con el resultado de la operacion.
    public int calcularOperacion(){
        if (primero != null)
            return primero.calcularOperacion();
        else
            return 0;
    }
}
