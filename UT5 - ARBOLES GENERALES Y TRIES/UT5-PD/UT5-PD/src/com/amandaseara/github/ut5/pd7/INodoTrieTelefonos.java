/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.amandaseara.github.ut5.pd7;

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public interface INodoTrieTelefonos {

    void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados);

    void insertar(TAbonado unAbonado);
    
}
