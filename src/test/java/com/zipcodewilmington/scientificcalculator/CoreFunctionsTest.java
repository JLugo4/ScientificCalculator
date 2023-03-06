package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CoreFunctionsTest extends TestCase {

    @Test

    @After
    public void reset(){
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 0;
    }


    public void testAdd() {
        CoreFunctions coreFunctions = new CoreFunctions();
        assertEquals(2.0, coreFunctions.add(2));
    }

    public void testSubtract() {
        CoreFunctions coreFunctions = new CoreFunctions();
        assertEquals(-8.0, coreFunctions.subtract(8));
    }

    public void testMultiply() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 5;
        assertEquals(25.0, coreFunctions.multiply(5));

    }

    public void testDivide() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 30;
        assertEquals(5.0, coreFunctions.divide(6));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    public void testDivideZero() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 30;
        assertEquals(0.0, coreFunctions.divide(0));
    }

    public void testSqrRt() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 9;
        assertEquals(3.0, coreFunctions.sqrRt());
    }

    public void testSqrNum() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 9;
        assertEquals(81.0, coreFunctions.sqrNum());
    }

    public void testExponent() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 7;
        assertEquals(49.0, coreFunctions.exponent(2));
    }

    public void testInverse() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 2;
        assertEquals(0.5, coreFunctions.inverse());
    }

    public void testInvertSign() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 5;
        assertEquals(-5.0, coreFunctions.invertSign());
    }

    public void testClearErr() {
    }
}