/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut5.pd7;

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public class TNodoTrieTelefonos implements INodoTrieTelefonos {
    
    private static final int CANT_CHR_ABECEDARIO = 10;
    private TNodoTrieTelefonos[] hijos;
    private boolean esAbonado;
    private TAbonado abonado;

    public TNodoTrieTelefonos() {
        this.hijos = new TNodoTrieTelefonos[CANT_CHR_ABECEDARIO];
        this.esAbonado = false;
    }
    
    @Override
    public void insertar(TAbonado unAbonado) {
        TNodoTrieTelefonos nodo = this;
        String numero = unAbonado.getTelefono();
        for (int c = 0; c < numero.length(); c++) {
            int indice = numero.charAt(c);
            if(indice >= 0 && indice < 11){
                if (nodo.hijos[indice] == null){
                    nodo.hijos[indice] = new TNodoTrieTelefonos();
                }
                nodo = nodo.hijos[indice];
            }
           
        }
        nodo.esAbonado = true;
        nodo.abonado = unAbonado;
    }

    @Override
    public void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados) {
        predecir(primerosDigitos, abonados);
    }
    
    private TNodoTrieTelefonos buscarNodoTrie(String s) {
        TNodoTrieTelefonos nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c);
            if(indice >= 0 && indice < 11){
                if(nodo.hijos[indice] == null){
                    return null;
                }
                nodo = nodo.hijos[indice];
            }
        }
        return nodo;
    }

    private void predecirAux(String s, LinkedList<TAbonado> abonados, TNodoTrieTelefonos nodo) {
        if (nodo != null) {
            if (nodo.esAbonado) {
                abonados.add(buscarNodoTrie(s).abonado);
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (c == 10) {
                    if (nodo.hijos[c] != null) {
                        predecirAux(s + ".", abonados, nodo.hijos[c]);
                    }
                }
                if (nodo.hijos[c] != null) {
                    predecirAux(s + c, abonados, nodo.hijos[c]);
                }
            }
        }
    }

    public void predecir(String prefijo, LinkedList<TAbonado> abonados) {
        TNodoTrieTelefonos actual = this.buscarNodoTrie(prefijo);
        predecirAux(prefijo, abonados, actual);
    }

}
