/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.github.amandaseara.ut4.pd0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amanda
 */
public class ArbolABTest {
    
    public ArbolABTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertarOperacion
     */
    @Test
    public void testInsertarOperacion(){
        System.out.println("testInsertarOperacion");
        
        ArbolAB arbol = new ArbolAB();
        arbol.insertarOperacion("((1+2)+3)");        
        
        String expResult = "1";
        String result = arbol.getPrimero().getIzquierdo().getIzquierdo().getDato();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of insertarOperacion
     */
    @Test
    public void testInsertarOperacion2(){
        System.out.println("testInsertarOperacion2");
        
        ArbolAB arbol = new ArbolAB();
        arbol.insertarOperacion("(((1+2)+3)*4)");        
        
        String expResult = "4";
        String result = arbol.getPrimero().getDerecho().getDato();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of insertarOperacion
     */
    @Test
    public void testInsertarOperacion3(){
        System.out.println("testInsertarOperacion3");
        
        ArbolAB arbol = new ArbolAB();
        arbol.insertarOperacion("(((1+2)+3)*4)");        
        
        String expResult = "+";
        String result = arbol.getPrimero().getIzquierdo().getIzquierdo().getDato();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calcularOperacion
     */
    public void testCalcularOperacion(){
        System.out.println("testCalcularOperacion");
        
        ArbolAB arbol = new ArbolAB();
        
        int expResult = 0;
        int result = arbol.calcularOperacion();
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calcularOperacion
     */
    public void testCalcularOperacion2(){
        System.out.println("testCalcularOperacion2");
        
        ArbolAB arbol = new ArbolAB();
        arbol.insertarOperacion("((1+2)+3)");
        
        int expResult = 6;
        int result = arbol.calcularOperacion();
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calcularOperacion
     */
    public void testCalcularOperacion3(){
        System.out.println("testCalcularOperacion3");
        
        ArbolAB arbol = new ArbolAB();
        arbol.insertarOperacion("(((1+2)+3)*4)");
        
        int expResult = 24;
        int result = arbol.calcularOperacion();
        assertEquals(expResult,result);
    }
    
}
