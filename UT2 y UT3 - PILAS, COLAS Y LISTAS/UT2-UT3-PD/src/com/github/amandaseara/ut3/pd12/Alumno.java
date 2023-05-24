/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd12;

/**
 *
 * @author Amanda
 */
public class Alumno {
    
    private final int codigo;
    private final String Nombre;

    public Alumno(int codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }
    
}
