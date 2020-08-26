package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {

    private int speedBmw;

    public Bmw(int speedBmw) {
        this.speedBmw = speedBmw;


    }

    @Override
    public int getSpeed() {

        return speedBmw;

    }

    @Override
    public void  increaseSpeed() {
         int increaseSpeed = 0;
         for (int i = 0; i < speedBmw; i++){

             increaseSpeed++;
             increaseSpeed += speedBmw;
         }

        System.out.println("The Bmw accelerates to speed: " + increaseSpeed + " km/h");
        }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed  = speedBmw;
        for (int i = 0; i < decreaseSpeed; i++){

            decreaseSpeed--;
        }
        System.out.println("The Bmw slows down to speed: "+ decreaseSpeed + " km/h");
    }

}
