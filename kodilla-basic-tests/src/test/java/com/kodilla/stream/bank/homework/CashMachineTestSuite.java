package com.kodilla.stream.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    private CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int[] completedTransactions = cashMachine.completedTransactions;
        assertEquals( 0, completedTransactions.length );
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );

        assertEquals( 2, cashMachine.completedTransactions.length );
        assertEquals( 1000, cashMachine.completedTransactions[0] );
        assertEquals( -500, cashMachine.completedTransactions[1] );

    }

    @Test
    public void shouldAddFourElementsToArray_numberOfPayOut() {
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );

        int numberOfPayOut = cashMachine.numberOfPayOut();
        assertEquals( 2, cashMachine.numberOfPayOut() );

    }

   @Test
    public void shouldAddFourElementsToArray_numberOfPayIn() {
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );

        int numberOfPayIn = cashMachine.numberOfPayIn();
        assertEquals( 2, cashMachine.numberOfPayIn() );
    }

    @Test
    public void shouldAddFourElementsToArray_sumOfPayOut() {
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );

        int sumOfPayOut = cashMachine.sumOfPayOut();
        assertEquals( -1000, cashMachine.sumOfPayOut());

    }


    @Test
    public void shouldAddFourElementsToArray_sumOfPayIn() {
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );
        cashMachine.payOut( 100 );
        cashMachine.payIn( 500 );

        int sumOfPayIn = cashMachine.sumOfPayIn();
        assertEquals( 1500, cashMachine.sumOfPayIn());
    }

    @Test
    public void shouldAddFourElementsToArray_transactionCounter() {
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );
        cashMachine.payIn( 1000 );
        cashMachine.payOut( 500 );

        int transactionCounter = cashMachine.transactionCounter();
        assertEquals( 4,cashMachine.transactionCounter() );

    }

    @Test void shouldAddFourElementsToArray_balance(){
        cashMachine.payIn( 5000 );
        cashMachine.payOut( 500 );
        cashMachine.payIn( 300 );
        cashMachine.payOut( 2500 );

        int balance = cashMachine.balance();
        assertEquals( 2300, cashMachine.balance() );
    }
}