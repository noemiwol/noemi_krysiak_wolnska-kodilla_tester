package com.kodilla.inheritance;

public class Convertible extends Car{
    public void openRoof(){
        System.out.println("Openig roof...");
    }

    public void closeRoof(){
        System.out.println("Closing roof...");
    }
    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }

    public Convertible() {
        super();
        System.out.println("Convertible constructor");
    }
    public Convertible(int wheels, int seats) {
        super(wheels, seats);
    }
}
