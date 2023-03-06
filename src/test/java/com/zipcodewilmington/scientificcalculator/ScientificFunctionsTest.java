package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Test;

public class ScientificFunctionsTest extends TestCase {

    @Test

    @After
    public void reset() {
        CoreFunctions coreFunctions = new CoreFunctions();
        coreFunctions.currentValue = 0;
    }
    public void testSineDegrees() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 0;
        assertEquals(1.0, scientificFunctions.sine(90));
    }

    public void testSineRadians() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 1;
        assertEquals(0.8414709848078965, scientificFunctions.sine(1));
    }

    public void testCosineDegrees() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 0;
        assertEquals(0.5000000000000001, scientificFunctions.cosine(60));
    }

    public void testCosineRadians() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 1;
        assertEquals(0.5403023058681398, scientificFunctions.cosine(1));
    }

    public void testTangentDegrees() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 0;
        assertEquals(0.9999999999999999, scientificFunctions.tangent(45));
    }

    public void testTangentRadians() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 1;
        assertEquals(1.5574077246549023, scientificFunctions.tangent(1));
    }

    public void testInverseSineDegrees() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 0;
        assertEquals(0.5510695830994463, scientificFunctions.inverseSine(30));
    }

    public void testInverseSineRadians() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 1;
        assertEquals(1.5707963267948966, scientificFunctions.inverseSine(1));
    }

    public void testInverseCosineDegrees() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 0;
        assertEquals(1.5795230838206837, scientificFunctions.inverseCosine(-0.5));

    }

    public void testInverseTangentDegrees() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 0;
        assertEquals(1.570408475869457, scientificFunctions.inverseTangent(45));
    }

    public void testInverseTangentRadians() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        scientificFunctions.unitsMode = 1;
        assertEquals(0.7853981633974483, scientificFunctions.inverseTangent(1));
    }

    public void testLog() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(1.0, scientificFunctions.log(10));
    }

    public void testInverseLog() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(1.0, scientificFunctions.inverseLog(1, 10));
    }

    public void testNaturalLog() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(0.6931471805599453, scientificFunctions.naturalLog(2));

    }

    public void testInverseNaturalLog() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(2.7182818284590455, scientificFunctions.inverseNaturalLog(1));
    }

    public void testFactorial() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(120.0, scientificFunctions.factorial(5));
    }

    public void testGetHypotenuse() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(3.605551275463989, scientificFunctions.getHypotenuse(2,3 ));
    }

    public void testGetCircleArea() {
        ScientificFunctions scientificFunctions = new ScientificFunctions();
        assertEquals(12.566370614359172, scientificFunctions.getCircleArea(2));
    }
}