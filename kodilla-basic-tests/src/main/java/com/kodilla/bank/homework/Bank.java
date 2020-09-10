package com.kodilla.bank.homework;

public class Bank {
 /*Utwórz klasę Bank, która będzie zawierać tablicę bankomatów. Bank powinien mieć metody zwracające:
 całkowity bilans ze wszystkich bankomatów,
 liczbę transakcji związanych z wypłatą,
 liczbę transakcji związaną z wpłatą pieniędzy,
 średnią wartość wypłaty,
 średnią wartość wpłaty.*/


 public CashMachine[] cashMachines;

 public Bank(CashMachine[] cashMachine) {
  this.cashMachines = cashMachine;
 }


 public int bilans() {
  int bilans = 0;
  for (int i = 0; i < cashMachines.length; i++) {
   bilans += cashMachines[i].balance();
  }
  return bilans;
 }


 public int averagePayIn() {
  int averagePayIn = 0;
  int counter = 0;
  for (int i = 0; i < cashMachines.length; i++) {
   if (cashMachines[i].numberOfPayIn() > 0){
   counter++;
   }
   averagePayIn += cashMachines[i].sumOfPayIn();
  }

  return averagePayIn / counter;
 }

public int averagePayOut() {
 int averagePayOut= 0;
 int counter = 0;
 for (int i = 0; i < cashMachines.length; i++) {
   counter += cashMachines[i].numberOfPayOut();
  averagePayOut += cashMachines[i].sumOfPayOut();
 }

 return averagePayOut / counter;
}



}