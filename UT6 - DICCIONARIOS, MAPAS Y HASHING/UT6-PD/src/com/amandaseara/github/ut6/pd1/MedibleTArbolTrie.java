/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut6.pd1;

/**
 *
 * @author Amanda
 */
public class MedibleTArbolTrie extends Medible{

    TArbolTrieNormal tArbolTrie;

    public MedibleTArbolTrie(TArbolTrieNormal tArbolTrie) {
        this.tArbolTrie = tArbolTrie;
    }

    @Override
    public void ejecutar(Object... params) {
        for (String s : this.tArbolTrie.predecir("")) {
            this.tArbolTrie.predecir(s);
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.tArbolTrie;
    }
}
