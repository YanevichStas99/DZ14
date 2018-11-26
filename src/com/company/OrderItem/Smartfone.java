package com.company.OrderItem;

public class Smartfone extends Item {
    private String androidVersion;

    public Smartfone(String name, double price, String androidVersion) {
        super(name, price);
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        return "Smartfone{" +
                "androidVersion='" + androidVersion + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
