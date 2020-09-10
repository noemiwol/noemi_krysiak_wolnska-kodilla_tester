package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int theYearOfPublishment;

    public OperatingSystem(int theYearOfPublishment) {
        this.theYearOfPublishment = theYearOfPublishment;
    }

    public int getTheYearOfPublishment(){
        return theYearOfPublishment;
    }

    public void turnOn(){
        System.out.println("The computer is turned on.");
    }

   public void turnOff(){
       System.out.println("The computer is turned off.");
    }

    public void displayYearOperatingSystem() {
        System.out.println("Year of publishment operating system: " + theYearOfPublishment);
    }

       public OperatingSystem(){
        System.out.println(theYearOfPublishment);
    }
}
