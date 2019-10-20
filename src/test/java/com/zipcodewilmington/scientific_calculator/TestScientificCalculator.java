package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.ScientificCalculator;


import static  org.junit.Assert.*;

public class TestScientificCalculator {

    ///System.out.println("Sin method: " + Math.sin(nrSine));

    @org.junit.Before
    public void setUp()throws Exception {
    }

    @org.junit.After
    public void tearDown()throws Exception {
    }

    //  *************  actual tests bellow  ***********

    @org.junit.Test
    public void testFactorial(){
        ScientificCalculator testFactorial = new ScientificCalculator();

        assertEquals(6, testFactorial.calculateFactorial(3));
        assertEquals(720, testFactorial.calculateFactorial(6));
        assertEquals(3628800, testFactorial.calculateFactorial(10));
    }

    @org.junit.Test
    public void testExponent(){
        ScientificCalculator testExponent = new ScientificCalculator();

        assertEquals(9, testExponent.calculateExponent(3,2),0.0);
        assertEquals(8, testExponent.calculateExponent(2,3),0.0);
        assertEquals(1000, testExponent.calculateExponent(10,3),0.0);
    }

    @org.junit.Test
    public void testinverseCosineRad(){
        ScientificCalculator testarcCosine = new ScientificCalculator();

        assertEquals(0, testarcCosine.inverseCosineRad(1),0.0);
        assertEquals(1.5707963267948966, testarcCosine.inverseCosineRad(0),0.0);
        assertEquals(3.141592653589793, testarcCosine.inverseCosineRad(-1),0.0);
    }

    @org.junit.Test
    public void testinverseCosineDeg(){
        ScientificCalculator testarcCosineDeg = new ScientificCalculator();

        assertEquals(0, testarcCosineDeg.inverseCosineRDeg(1),0.0);
        assertEquals(90, testarcCosineDeg.inverseCosineRDeg(0),0.0);
        assertEquals(180, testarcCosineDeg.inverseCosineRDeg(-1),0.0);
    }

    @org.junit.Test
    public void testinverseSineRad(){
        ScientificCalculator testarcSine = new ScientificCalculator();

        assertEquals(1.5707963267948966, testarcSine.inverseSineRad(1),0.0);
        assertEquals(0.0, testarcSine.inverseSineRad(0),0.0);
        assertEquals(-1.5707963267948966, testarcSine.inverseSineRad(-1),0.0);
    }

    @org.junit.Test
    public void testinverseSineDeg(){
        ScientificCalculator testarcSineDeg = new ScientificCalculator();

        assertEquals(90, testarcSineDeg.inverseSineDeg(1),0.0);
        assertEquals(0.0, testarcSineDeg.inverseSineDeg(0),0.0);
        assertEquals(-90, testarcSineDeg.inverseSineDeg(-1),0.0);
    }

    @org.junit.Test
    public void testCosineDeg(){
        ScientificCalculator testdegCosine = new ScientificCalculator();

        assertEquals(0.7071067811865476, testdegCosine.calculateCosineDeg(45),0.0);
        assertEquals(0.8660254037844387, testdegCosine.calculateCosineDeg(-30),0.0);
        assertEquals(0.6427876096865394, testdegCosine.calculateCosineDeg(50),0.0);

    }

    @org.junit.Test
    public void testSineDeg(){
        ScientificCalculator testdegSine = new ScientificCalculator();

        assertEquals(0.7071067811865475, testdegSine.calculateSineDeg(45),0.0);
        assertEquals(-0.49999999999999994, testdegSine.calculateSineDeg(-30),0.0);
        assertEquals(0.766044443118978, testdegSine.calculateSineDeg(50),0.0);
    }

    @org.junit.Test
    public void testSineRad(){
        ScientificCalculator testradSine = new ScientificCalculator();

        assertEquals(0.8509035245341184, testradSine.calculateSineRad(45),0.0);
        assertEquals(0.9880316240928618, testradSine.calculateSineRad(-30),0.0);
        assertEquals(-0.26237485370392877, testradSine.calculateSineRad(50),0.0);
    }

    @org.junit.Test
    public void testCosineRad(){
        ScientificCalculator testradCosine = new ScientificCalculator();

        assertEquals(0.5253219888177297, testradCosine.calculateCosineRad(45),0.0);
        assertEquals(0.15425144988758405, testradCosine.calculateCosineRad(-30),0.0);
        assertEquals(0.9649660284921133, testradCosine.calculateCosineRad(50),0.0);

    }

    @org.junit.Test
    public void testTangentRad(){
        ScientificCalculator testTangent = new ScientificCalculator();

        assertEquals(0.6483608274590866, testTangent.calculateTangentRad(10),0.0);
        assertEquals(-0.6483608274590866, testTangent.calculateTangentRad(-10),0.0);
        assertEquals(1.3386902103511544, testTangent.calculateTangentRad(180),0.0);

    }

    @org.junit.Test
    public void testTangentDeg(){
        ScientificCalculator testTangentDeg = new ScientificCalculator();

        assertEquals(37.14833901501544, testTangentDeg.calculateTangentDeg(10),0.0);
        assertEquals(-37.14833901501544, testTangentDeg.calculateTangentDeg(-10),0.0);
        assertEquals(76.70129912860153, testTangentDeg.calculateTangentDeg(180),0.0);

    }

    @org.junit.Test
    public void testinverseTangentRad(){
        ScientificCalculator testinvTangentRad = new ScientificCalculator();

        assertEquals(1.5208379310729538, testinvTangentRad.inverseTangentRad(20),0.0);
        assertEquals(-1.4711276743037347, testinvTangentRad.inverseTangentRad(-10),0.0);
        assertEquals(1.565240828394204, testinvTangentRad.inverseTangentRad(180),0.0);

    }

    @org.junit.Test
    public void testinverseTangentDeg(){
        ScientificCalculator testinvTangentDeg = new ScientificCalculator();

        assertEquals(87.13759477388825, testinvTangentDeg.inverseTangentDeg(20),0.0);
        assertEquals(-84.28940686250037, testinvTangentDeg.inverseTangentDeg(-10),0.0);
        assertEquals(89.68169338854864, testinvTangentDeg.inverseTangentDeg(180),0.0);

    }

    @org.junit.Test
    public void testLogarithm(){
        ScientificCalculator testLog = new ScientificCalculator();

        assertEquals(2, testLog.calcLog(100),0.0);
        assertEquals(1.6989700043360187, testLog.calcLog(50),0.0);
        assertEquals(1.3979400086720377, testLog.calcLog(25),0.0);
    }

    @org.junit.Test
    public void testInverseLog(){
        ScientificCalculator testFactorial = new ScientificCalculator();

        assertEquals(0.5, testFactorial.calculateInverseLog(100), 0.00);
        assertEquals(1.2850972089384687, testFactorial.calculateInverseLog(6), 0.00);
        assertEquals(0.33460942696089374, testFactorial.calculateInverseLog(974), 0.00);
    }

    @org.junit.Test
    public void testNatLogarithm(){
        ScientificCalculator testFactorial = new ScientificCalculator();

        assertEquals(4.605170185988092, testFactorial.calculateNatLogarithm(100), 0.00);
        assertEquals(8.37930948405285, testFactorial.calculateNatLogarithm(4356), 0.00);
        assertEquals(2.302585092994046, testFactorial.calculateNatLogarithm(10), 0.00);
    }

    @org.junit.Test
    public void testinvNatLogarithm(){
        ScientificCalculator testFactorial = new ScientificCalculator();

        assertEquals(6, testFactorial.calculateInverseNaturalLog(3));
        assertEquals(720, testFactorial.calculateInverseNaturalLog(6));
        assertEquals(3628800, testFactorial.calculateInverseNaturalLog(10));
    }

    @org.junit.Test
    public void genericTest(){




        System.out.println("Tan method: " + Math.atan(180));
        System.out.println("Tan method: " + Math.toDegrees(Math.atan(180)));


    }
}

