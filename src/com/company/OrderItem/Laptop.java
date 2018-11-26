package com.company.OrderItem;

public class Laptop extends Item{
    private String genOfProcessor;

    public Laptop(String name, double price, String genOfProcessor) {
        super(name, price);
        this.genOfProcessor = genOfProcessor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "genOfProcessor='" + genOfProcessor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
