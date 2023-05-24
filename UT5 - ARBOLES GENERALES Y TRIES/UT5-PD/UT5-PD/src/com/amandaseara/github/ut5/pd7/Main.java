/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut5.pd7;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Amanda
 */
public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolTrieTelefonos trieAbonados = new TArbolTrieTelefonos();

       // CARGAR EN EL TRIE LOS TELÉFONOS Y NOMBRES A PARTIR DEL ARCHIVO ABONADOS.TXT
       
       String[] palabras = ManejadorArchivosGenerico.leerArchivo("src\\com\\amandaseara\\github\\ut5\\pd7\\abonados.txt");
        for (String p : palabras){
            String[] abonado = p.split(",");
            trieAbonados.insertar(new TAbonado(abonado[0], abonado[1]));
        }
        
        String codigoPais = "598" ; // utilizar el indicado en el archivo "codigos.txt"
        String codigoArea = "93" ;// utilizar el indicado en el archivo "codigos.txt"
        LinkedList<TAbonado> ab = trieAbonados.buscarTelefonos(codigoPais, codigoArea);
        
        // crear el archivo "salida.txt", con los abonados (1 por linea) 
        // correspondientes al pais y area 
        // imprimir Nombre y teléfono, 
        // ordenados alfabeticamente por nombre
        
      
        
    }
    
}
