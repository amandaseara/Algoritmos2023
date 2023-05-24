package com.github.amandaseara.ut3.ta10opd6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public class ListaSucursales extends LinkedList<Sucursal> {

    public Sucursal buscar(String nombreSucursal) {
        for (Sucursal suc : this) {
            if (suc.getNombre().equals(nombreSucursal)) {
                return suc;
            }
        }
        return null;
    }

    public boolean quitar(String nombreSucursal) {
        Sucursal suc = this.buscar(nombreSucursal);
        if (suc != null) {
            this.remove(suc);
            return true;
        }
        return false;
    }

    public String imprimir(String separador) {
        StringBuilder cadena = new StringBuilder();
        for (Sucursal suc : this) {
            cadena.append(suc.getNombre()).append(separador);
        }
        return cadena.toString();
    }
}
