/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut2.pd1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Amanda
 */
public class Ejercicio2 {
    
    public static void main(String[] args) throws IOException {
        HashMap salidas = ordenarArreglo("src/main/java/com/github/amandaseara/pd1/Numeros.txt");
        System.out.println("El largo del arreglo es: " + salidas.get("largoArr"));
        System.out.println("Se ingresa " + salidas.get("contadorIf") + " veces al if.");
        System.out.println("El numero en primer posicion es: " + salidas.get("primeraPos"));
        System.out.println("El numero en ultima posicion es: " + salidas.get("ultimaPos"));
    }
    
    /* Lee un archivo y crea un String[] en el que cada una de sus posiciones es cada una de las lineas del archivo */
    public static String[] leerE(String rutaArchivo) throws IOException{
        ArrayList<String> lineas = new ArrayList<>();
        FileReader fr = new FileReader(rutaArchivo);
        BufferedReader br = new BufferedReader(fr);
        String lineaActual = br.readLine();
        int index = 0;
        
        while(lineaActual != null){
            lineas.add(lineaActual);
            lineaActual = br.readLine();
            index++;
        }
        
        return lineas.toArray(new String[0]);
    }
    
    public static HashMap ordenarArreglo(String rutaArchivo) throws IOException{
        String[] entradas = leerE(rutaArchivo);
        int n = Integer.parseInt(entradas[0]);
        int[] arreglo = new int[n];
        for (int j = 1; j < n; j++){
            arreglo[j] = Integer.parseInt(entradas[j]);
        }
        int contadorIf = 0;
        int aux = 0;
        for (int i = 0; i <= n-1; i++){
            for (int j = n; j >= i+1; j--){
                if (arreglo[i] < arreglo[j-1]){
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j-1];
                    arreglo[j-1] = aux;
                    contadorIf++;
                }
            }
        }
        HashMap<String, Integer> resultados = new HashMap<>();
        resultados.put("contadorIf", contadorIf);
        resultados.put("largoArr", n);
        resultados.put("primeraPos", arreglo[0]);
        resultados.put("ultimaPos", arreglo[n-1]);
        return resultados;
    }
    
}
