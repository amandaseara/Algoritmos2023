/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut6.pd1;

/**
 *
 * @author Amanda
 */
public class Main {
    
    public static void main(String[] args) {
        
        TArbolTrie tArbolTrieHashMap = new TArbolTrie();
        TArbolTrieNormal tArbolTrie = new TArbolTrieNormal();

        for (String linea : ManejadorArchivosGenerico.leerArchivo("src\\com\\amandaseara\\github\\ut6\\pd1\\palabras.txt")) {
            tArbolTrieHashMap.insertar(linea);
            tArbolTrie.insertar(linea);
        }
        MedibleTArbolTrieHashMap mtathm = new MedibleTArbolTrieHashMap(tArbolTrieHashMap);
        Medicion mtathmMedicion = mtathm.medir();
        mtathmMedicion.print();


        //No anda predecir
//        MedibleTArbolTrie mtat = new MedibleTArbolTrie(tArbolTrie);
//        Medicion mtatMedicion = mtat.medir();
//        mtatMedicion.print();

    }
    
    
}
