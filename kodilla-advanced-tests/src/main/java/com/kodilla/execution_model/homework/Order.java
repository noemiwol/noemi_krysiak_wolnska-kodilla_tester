    package com.kodilla.execution_model.homework;

    import java.time.LocalDate;
    import java.util.Objects;

    public class Order {
    private double orderValue;
    private LocalDate data;
    private String login;

    public Order(double orderValue, LocalDate data, String login) {
        this.orderValue = orderValue;
        this.data = data;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getData() {
        return data;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", data=" + data +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getOrderValue(), getOrderValue()) == 0 &&
                Objects.equals(getData(), order.getData()) &&
                Objects.equals(getLogin(), order.getLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderValue(), getData(), getLogin());
    }
    }
