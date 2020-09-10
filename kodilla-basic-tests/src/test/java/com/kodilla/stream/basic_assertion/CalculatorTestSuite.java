package com.kodilla.stream.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.addition(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testPower(){
        Calculator calculator = new Calculator();
        int e = 5;
        int powerResult = calculator.power( e );
        assertEquals( 25,powerResult );
    }

    @Test
    public void testPower_2(){
        Calculator calculator = new Calculator();
        int e = -5;
        int powerResult = calculator.power( e );
        assertEquals( 25,powerResult );

    }

    @Test
    public void testPower_3(){
        Calculator calculator = new Calculator();
        int e = 0;
        int powerResult = calculator.power( e );
        assertEquals( 0,powerResult );

    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int c = 30;
        int d = 13;
        int sumResult = calculator.subtraction(c, d);
        assertEquals(17, sumResult);
    }
}
