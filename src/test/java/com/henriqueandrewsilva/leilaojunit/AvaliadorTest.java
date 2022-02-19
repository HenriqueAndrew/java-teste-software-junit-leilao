/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.henriqueandrewsilva.leilaojunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henri
 */
public class AvaliadorTest {
    
    public AvaliadorTest() {
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
     * Test of avalia method, of class Avaliador.
     */
    @Test
    public void testAvalia() {
        System.out.println("avalia");
        Leilao leilao = null;
        Avaliador instance = new Avaliador();
        instance.avalia(leilao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaiorLance method, of class Avaliador.
     */
    @Test
    public void testGetMaiorLance() {
        System.out.println("getMaiorLance");
        Avaliador instance = new Avaliador();
        double expResult = 0.0;
        double result = instance.getMaiorLance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenorLance method, of class Avaliador.
     */
    @Test
    public void testGetMenorLance() {
        System.out.println("getMenorLance");
        Avaliador instance = new Avaliador();
        double expResult = 0.0;
        double result = instance.getMenorLance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
