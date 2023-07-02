/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut6.pd1;

/**
 *
 * @author Amanda
 */
public class MedibleTArbolTrieHashMap extends Medible{

    TArbolTrie tArbolTrieHashMap;

    public MedibleTArbolTrieHashMap(TArbolTrie tArbolTrieHashMap) {
        this.tArbolTrieHashMap = tArbolTrieHashMap;
    }

    @Override
    public void ejecutar(Object... params) {
        for (String s : this.tArbolTrieHashMap.predecir("")) {
            this.tArbolTrieHashMap.predecir(s);
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.tArbolTrieHashMap;
    }
    
}
