package com.kodilla.stream.abstracts;

public class Application {
    public static void main(String[] args) {

        /*Dog dog = new Dog();
        dog.giveVoice();*/

       Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Duck duck = new Duck();
        duck.giveVoice();

         }
    }

