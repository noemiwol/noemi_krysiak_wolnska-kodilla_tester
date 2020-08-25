package com.kodilla.bank.homework;

public class CashMachine {
/*
    Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia, jeśli użytkownik wpłacił
    pieniądze, ujemna jeśli użytkownik wypłacił pieniądze). Dodaj metody zwracające saldo bankomatu
    oraz liczbę wykonanych transakcji
*/


    public int[] completedTransactions;
    public int size;

    public CashMachine() {
        this.size = 0;
        this.completedTransactions = new int[0];
    }

    public int[] getCompletedTransactions() {

        return completedTransactions;
    }

    public void payIn(int amount) {
        if (amount <= 0)
            return;

        donate( amount );
    }

    private void donate(int amount) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy( completedTransactions, 0, newTab, 0, completedTransactions.length );
        newTab[newTab.length - 1] = amount;
        this.completedTransactions = newTab;
    }

    public void payOut(int amount) {
        if (amount <= 0)
            return;

        if (balance() < amount)
            return;

        donate( -amount );
    }

    public int balance() {
        int balance = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            balance += completedTransactions[i];
        }
        return balance;
    }


    public int transactionCounter() {

        return completedTransactions.length;
    }

    public int numberOfPayOut() {
        int numberOfPayOut = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (completedTransactions[i] < 0){
                numberOfPayOut++;
            }
        }
        return numberOfPayOut;
    }
    public int sumOfPayOut() {
        int sumOfPayOut = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (completedTransactions[i] < 0)
                sumOfPayOut += completedTransactions[i];
        }
        return sumOfPayOut;
    }

    public int numberOfPayIn() {
        int numberOfPayIn = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (completedTransactions[i] > 0){
                numberOfPayIn++;
            }
        }
        return numberOfPayIn;
    }
    public int sumOfPayIn() {
        int sumOfPayIn = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (completedTransactions[i] > 0)
                sumOfPayIn += completedTransactions[i];
        }
        return sumOfPayIn;
    }
}




