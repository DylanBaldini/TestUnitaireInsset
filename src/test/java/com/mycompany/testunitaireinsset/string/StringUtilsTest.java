/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        System.out.println("isChaineValide");
        String str = "frt";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isChaineValide(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
     /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test (expected=IllegalArgumentException.class)
    public void testIsChaineValideFALSE() {
        System.out.println("isChaineValide");
        String str = "f";
        StringUtils instance = new StringUtils();
        instance.isChaineValide(str);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        String str = "test";
        StringUtils instance = new StringUtils();
        String expResult = "tset";
        String result = instance.inverse(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
     /**
     * Test of inverse method, of class StringUtils.
     */
  /*  @Test
    public void testInverseFALSE() {
        System.out.println("inverse");
        String str = "test";
        StringUtils instance = new StringUtils();
        String expResult = "ssssss";
        String result = instance.inverse(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }*/

    /**
//     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeFALSE() {
        System.out.println("isPalindrome");
        String str = "kaya";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
    
     /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurencesTRUE() {
        System.out.println("compterOccurences");
        String str = "papa";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put("p",2);
        expResult.put("a",2);
        Map<String, Integer> result = instance.compterOccurences(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
