/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd7;

/**
 *
 * @author Amanda
 */
public class TAlumno {
    private final int cedula;
    private final String nombre;

    public TAlumno(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    TAlumno(int cedula, String[] nombres) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the codigo
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    
    
}
