/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoalgoritimos.ListaEncadeada;

import java.util.Comparator;
import static javafx.scene.input.KeyCode.T;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author jonh_
 */
public class LinkedListNGTest {
    
    public LinkedListNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método isEmpty, da classe LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método append, da classe LinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        Object data = null;
        LinkedList instance = new LinkedList();
        instance.append(data);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método iterator, da classe LinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        LinkedList instance = new LinkedList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método efficientSort, da classe LinkedList.
     */
    @Test
    public void testEfficientSort() {
        System.out.println("efficientSort");
        Comparator<Object> cmp = null;
        LinkedList instance = new LinkedList();
        instance.efficientSort(cmp);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
