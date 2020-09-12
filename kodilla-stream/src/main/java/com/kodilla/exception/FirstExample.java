package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
       /* String username = "Alicja Klucz";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);*/

        String username = null;
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
    }
}
