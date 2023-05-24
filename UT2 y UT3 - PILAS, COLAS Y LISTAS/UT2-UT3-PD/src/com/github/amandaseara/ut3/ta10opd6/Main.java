/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.ta10opd6;

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {

        // PRUEBA DEL PROGRAMA
        // Parte1
        ListaSucursales sucursales1 = new ListaSucursales();

        for (String s : ManejadorArchivosGenerico.leerArchivo("./src/com/github/amandaseara/ut3/ta10opd6/suc1.txt")) {
            Sucursal sucursal = new Sucursal(s);
            sucursales1.add(sucursal);
        }

        System.out.println("La cantidad de sucursales luego de cargar el archivo 'suc1.txt' es: " + sucursales1.size());

        // Parte2
        sucursales1.quitar("Chicago");
        int indice = sucursales1.indexOf(sucursales1.buscar("Hong Kong"));
        System.out.println("La ciudad que le sigue a Hong Kong en la lista es: " + sucursales1.get(indice + 1).getNombre());

        // Parte3
        ListaSucursales sucursales2 = new ListaSucursales();

        for (String s : ManejadorArchivosGenerico.leerArchivo("./src/com/github/amandaseara/ut3/ta10opd6/suc2.txt")) {
            Sucursal sucursal = new Sucursal(s);
            sucursales2.add(sucursal);
        }

        boolean exc = false;
        try {
            sucursales2.quitar("﻿Tokio");
            sucursales2.quitar("Shenzhen");
        } catch (Exception e) {
            exc = true;
        }
        System.out.println("Quedan 5 ciudades: " + (sucursales2.size() == 5));
        System.out.println("Queda 1 ciudad y da error de ejecución: " + (sucursales2.size() == 1 && exc));
        System.out.println("Queda vacía y da error de ejecución: " + (sucursales2.isEmpty() && exc));

        // Parte 4
        ListaSucursales sucursales3 = new ListaSucursales();

        for (String s : ManejadorArchivosGenerico.leerArchivo("./src/com/github/amandaseara/ut3/ta10opd6/suc3.txt")) {
            Sucursal sucursal = new Sucursal(s);
            sucursales3.add(sucursal);
        }

        System.out.println(sucursales3.imprimir(";_"));
    }
}
