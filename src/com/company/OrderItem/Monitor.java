package com.company.OrderItem;

public class Monitor extends Item{
    private double diagonal;

    public Monitor(String name, double price, double diagonal) {
        super(name, price);
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
