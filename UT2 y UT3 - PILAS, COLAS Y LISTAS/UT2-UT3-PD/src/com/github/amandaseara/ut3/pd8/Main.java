/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amanda
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<String> sucursales = new ArrayList<>();
        for (String s : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd8/sucursales.txt")) {
            sucursales.add(s);
        }
        System.out.println("La cantidad de sucursales luego de cargar el archivo 'sucursales.txt' es: "+
                sucursales.size());
        
        List<String> sucursales1 = new ArrayList<>();
        for (String s : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd8/suc1.txt")) {
            sucursales1.add(s);
        }
        System.out.println("La cantidad de sucursales luego de cargar el archivo 'suc1.txt' es: "+
                sucursales1.size());

        sucursales1.remove("Chicago");
        System.out.println("La cantidad de sucursales luego de cargar el archivo 'sucucursales.txt y eliminar Chicago' es: "+
                sucursales1.size());
        System.out.println("En esta modificada sucursales el siguiente ciudad a Hong Kong es: "+
                sucursales.get(sucursales1.indexOf("Hong Kong")));

        List<String> sucursales2 = new ArrayList<>();
        for(String line : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd8/suc2.txt")){
            sucursales2.add(line);
        }

        sucursales2.remove("Shenzen");
        sucursales2.remove("Tokio");

        System.out.println("La cantidad de sucursales luego de eliminar 'Shenzen' y 'Tokio' de 'suc2' es: "+
                sucursales2.size());

        List<String> sucursales3 = new ArrayList<>();
        for (String line : ManejadorArchivosGenerico.leerArchivo("src/com/github/amandaseara/ut3/pd8/suc3.txt")) {
            sucursales3.add(line);
        }

        System.out.println("El resultado de imprimir 'suc3' es: ");
        StringBuilder sb = new StringBuilder();
        for (String sucursal : sucursales3) {
            sb.append(sucursal).append(";_");
        }
        System.out.println(sb.toString());
    }
    
}
