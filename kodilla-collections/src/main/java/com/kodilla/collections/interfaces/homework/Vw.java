package com.kodilla.collections.interfaces.homework;

public class Vw implements Car{

    private int speedVw;

    public Vw(int speedVw) {
        this.speedVw = speedVw;

    }

    @Override
    public int getSpeed() {

        return speedVw;

    }

    @Override
    public void  increaseSpeed() {
        int increaseSpeed = 0;
        for (int i = 0; i < speedVw; i++){

            increaseSpeed++;
            increaseSpeed += speedVw;
        }

        System.out.println("The Vw accelerates to speed: " + increaseSpeed + " km/h");
    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed  = speedVw;
        for (int i = 0; i < decreaseSpeed; i++){

            decreaseSpeed--;
        }
        System.out.println("The Vw slows down to speed: "+ decreaseSpeed + " km/h");
    }

}
