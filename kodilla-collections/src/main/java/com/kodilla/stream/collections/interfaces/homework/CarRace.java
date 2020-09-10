package com.kodilla.stream.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Bmw bmw = new Bmw( 10);
        doRace( bmw );
        Vw vw = new Vw(15);
        doRace( vw );
        Audi audi = new Audi(20);
        doRace( audi );


    }
    private static void  doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();

    }
}
