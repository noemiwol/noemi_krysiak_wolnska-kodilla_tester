package com.kodilla.stream.collections.interfaces.homework;


import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0;n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car: cars)
            CarUtils.describeCar( car );

    }

    private static Car drawCar(){
        Random random = new Random();
        int drawCar = random.nextInt(16);
        int a = (int) (random.nextDouble() * 100 + 1);
        int b = (int) (random.nextDouble() * 100 + 1);
        int c = (int) (random.nextDouble() * 100 + 1);

        if (drawCar== 0)
            return new Bmw( a );
        else if (drawCar == 1)
            return new Vw( b );
        else
            return new Audi( c );

    }
}
