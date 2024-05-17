/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing_group_two;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Novashnee
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }

    @Test
    public void testAdditionMethod() {
        // create an instance of the class 
        UnitTesting ut = new UnitTesting();
        
        int expected = 8; 
        int actual = ut.addition(4, 4); 
        
        assertEquals(expected, actual);
        
    }
    
    @Test 
    public void testSubtractionMethod(){
        // Create an instance of the class 
        UnitTesting ut = new UnitTesting(); 
        
        int expected = 8; 
        int actual = ut.subtraction(10, 2);
        
        assertEquals(expected, actual);
    }
    @Test 
    public void testMessage(){
        // Create an Instance of the class 
        UnitTesting ut = new UnitTesting(); 
        
        String expected = "Hello World!"; 
        String actual = ut.message(); 
        
        assertEquals(expected, actual);
        
    }
    
}



