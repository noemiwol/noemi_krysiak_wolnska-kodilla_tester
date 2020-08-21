package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculatoradd = new Calculator();
        int a = 5;
        int b = 8;
        int addResult = calculatoradd.addition(a, b);
        boolean correct = ResultChecker.assertEquals(13, addResult);
        if (correct) {
            System.out.println("Metoda addition działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda addition nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculatorSub = new Calculator();
        int c = 30;
        int d = 13;
        int subResult = calculatorSub.subtraction( c,d );
        boolean correctSub = ResultChecker.assertEquals( 17,subResult );
        if (correctSub) {
            System.out.println("Metoda subtraction działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda subtraction nie działa poprawnie dla liczb " + c + " i " + d);
        }

        Calculator calculatorExponentiation = new Calculator();
        int e = 5;
        int exponentiationResult = calculatorExponentiation.exponentiation( e );
        boolean correectExponentiation = ResultChecker.assertEquals( 25,exponentiationResult );
        if (correectExponentiation){
            System.out.println("Metoda exponentiation działa poprawnie dla liczby " + e );
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczby " + e);
        }

    }
}
