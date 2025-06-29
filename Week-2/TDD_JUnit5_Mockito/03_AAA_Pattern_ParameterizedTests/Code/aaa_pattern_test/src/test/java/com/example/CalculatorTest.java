package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        calculator.clear();
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAdd() {
        int a = 12;
        int b = 8;
        int result = calculator.add(a, b);
        assertEquals(20, result);
    }

    @Test
    public void testMultiply() {
        int a = 7;
        int b = 4;
        int result = calculator.multiply(a, b);
        assertEquals(28, result);
    }
}
