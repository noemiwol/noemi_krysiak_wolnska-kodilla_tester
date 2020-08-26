package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{
    private int speedAudi;


    public Audi(int speedAudi) {
        this.speedAudi = speedAudi;

    }


    @Override
    public int getSpeed() {

        return speedAudi;

    }

    @Override
    public void  increaseSpeed() {
        int increaseSpeed = 0;
        for (int i = 0; i < speedAudi; i++){

            increaseSpeed++;
            increaseSpeed += speedAudi;
        }

        System.out.println("The Audi accelerates to speed: " + increaseSpeed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed  = speedAudi;
        for (int i = 0; i < decreaseSpeed; i++){

            decreaseSpeed--;
        }
        System.out.println("The Audi slows down to speed: "+ decreaseSpeed + " km/h");
    }

}
