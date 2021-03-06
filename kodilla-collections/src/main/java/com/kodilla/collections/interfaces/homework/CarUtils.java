package com.kodilla.collections.interfaces.homework;



public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("----------------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " +car.getSpeed());
    }

    private static String getCarName(Car car){

        if (car instanceof Bmw)
            return "Bmw";
        else if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Vw)
            return "Vw";
        else
            return "Unknown car name";

    }
}
