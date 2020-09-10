package com.kodilla.optional.homework;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" +
                "Nauczyciel:'" + name + '\'' +
                '}';
    }
}
