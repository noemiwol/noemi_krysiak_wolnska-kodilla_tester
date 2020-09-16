package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {
    String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Nr zamówienie " +
                "" + number + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(getNumber(), order.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}
