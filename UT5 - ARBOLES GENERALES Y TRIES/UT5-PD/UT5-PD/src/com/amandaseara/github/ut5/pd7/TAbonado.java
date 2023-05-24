/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut5.pd7;

/**
 *
 * @author Amanda
 */
public class TAbonado implements Comparable {

    private String nombre;
    private String telefono;

    TAbonado(String unNombre, String unTelefono) {

        this.nombre = unNombre;
        this.telefono = unTelefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public int compareTo(Object o) {
        return (this.nombre.compareTo(((TAbonado)o).getNombre()));
    }
}
