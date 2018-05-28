/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class Calculadora1Test {
    
    public Calculadora1Test() {
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
     * Test of suma method, of class Calculadora1.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        Calculadora1 instance = new Calculadora1();
        int expResult = 0;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora1.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        Calculadora1 instance = new Calculadora1();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculadora1.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        Calculadora1 instance = new Calculadora1();
        int expResult = 0;
        int result = instance.add(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divi method, of class Calculadora1.
     */
    @Test
    public void testDivi() {
        System.out.println("divi");
        int a = 0;
        int b = 0;
        Calculadora1 instance = new Calculadora1();
        int expResult = 0;
        int result = instance.divi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Calculadora1.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 0;
        Calculadora1 instance = new Calculadora1();
        int expResult = 0;
        int result = instance.sub(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Calculadora1.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Calculadora1 instance = new Calculadora1();
        int expResult = 0;
        int result = instance.clear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optima method, of class Calculadora1.
     */
    @Test
    public void testOptima() {
        System.out.println("optima");
        Calculadora1 instance = new Calculadora1();
        instance.optima();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
