package com.kodilla.stream.abstracts;

public class Duck extends Animal {

    public Duck() {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }

   /* public Duck(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }*/
}