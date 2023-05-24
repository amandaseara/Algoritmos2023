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
public class TArbolTrieTelefonos implements IArbolTrieTelefonos {

    private TNodoTrieTelefonos raiz;
    
    public TArbolTrieTelefonos(){
        this.raiz = null;
    }

    @Override
    public LinkedList<TAbonado> buscarTelefonos(String pais, String area) {
        LinkedList<TAbonado> abonados = new LinkedList<>();
        if (raiz != null)
            this.raiz.buscarTelefonos(pais+area, abonados);
        return abonados;
    }

    @Override
    public void insertar(TAbonado unAbonado) {
        if (raiz == null) {
            raiz = new TNodoTrieTelefonos();
        }
        raiz.insertar(unAbonado);
    }

}
