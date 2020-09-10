package com.kodilla.stream.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {




    @Test
    public void shouldAddTwoObjects_bilans(){

        CashMachine[] cashmachines = new CashMachine[] {
            new CashMachine(),
            new CashMachine()};

        cashmachines[0].payIn( 5000 );
        cashmachines[1].payIn( 5000 );
        cashmachines[0].payOut( 300 );
        cashmachines[1].payOut( 100 );

        Bank bank = new Bank(cashmachines);

        int blians = bank.bilans();
        assertEquals( 9600,bank.bilans() );

    }
        @Test
    public void shouldAddOneObjects_NotPayOutIfNoCashInAtm_bilans(){

        CashMachine[] cashmachines = new CashMachine[] {
                new CashMachine()};
        cashmachines[0].payOut( 1300 );

        Bank bank = new Bank(cashmachines);

        int blians = bank.bilans();
        assertEquals( 0,bank.bilans() );

    }
    @Test
    public void shouldAddOneObjects_CanNotPayInZero_bilans(){

        CashMachine[] cashmachines = new CashMachine[] {
                new CashMachine()};
        cashmachines[0].payIn( 0 );

        Bank bank = new Bank(cashmachines);

        int blians = bank.bilans();
        assertEquals( 0,bank.bilans() );

    }
    @Test
    public void shouldSixObjects_averagePayIn(){
        CashMachine[] cashmachines = new CashMachine[] {
                new CashMachine(),
                new CashMachine(),
                new CashMachine(),
                new CashMachine(),
                new CashMachine(),
                new CashMachine()};
        cashmachines[0].payIn( 5000 );
        cashmachines[1].payIn( 300 );
        cashmachines[2].payIn( 50 );
        cashmachines[3].payIn( 100 );
        cashmachines[4].payOut( 200 );
        cashmachines[5].payOut( 300 );

        Bank bank = new Bank(cashmachines);

       int averagePayIn = bank.averagePayIn();
       assertEquals( 1362,bank.averagePayIn() );

    }
    @Test
    public void shouldSixObjects_averagePayOut() {
        CashMachine[] cashmachines = new CashMachine[]{
                new CashMachine(),
                new CashMachine(),
                new CashMachine(),
                new CashMachine(),
                new CashMachine(),
                new CashMachine()};
        cashmachines[0].payIn( 5000 );
        cashmachines[1].payIn( 300 );
        cashmachines[2].payIn( 50 );
        cashmachines[3].payIn( 100 );
        cashmachines[4].payIn( 200 );
        cashmachines[5].payIn( 3000 );
        cashmachines[0].payOut( 500 );
        cashmachines[1].payOut( 300 );
        cashmachines[2].payOut( 50 );
        cashmachines[3].payOut( 100 );
        cashmachines[4].payOut( 200 );
        cashmachines[5].payOut( 300 );

        Bank bank = new Bank( cashmachines );

        int averagePayOut = bank.averagePayOut();
        assertEquals( -241, bank.averagePayOut() );
    }


}
