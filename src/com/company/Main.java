package com.company;

import com.company.OrderItem.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items=new ArrayList<>();
        Order order1=new Order(Order.Status.NEW,"26.11.18",items);
        order1.addItem(new Monitor("Sony 65", 5000, 55.5));
        order1.addItem(new Laptop("Apple 8D",8999.99,"7th Gen"));
        order1.addItem(new Smartfone("Huawei X",7500,"6th Android"));
        order1.addItem(new Monitor("Sony 30", 3000, 33));
        order1.addItem(new Laptop("Apple Iphone",11999,"8th Gen"));
        order1.addItem(new Smartfone("Huawei 5",2000,"5th Android"));
        order1.addItem(new Monitor("Sony 90", 20000, 120));
        order1.addItem(new Laptop("Sony",6500,"7th Gen"));
        order1.addItem(new Smartfone("Huawei XX",10000,"7th Android"));
        order1.addItem(new Laptop("HP 1000",18000,"7th Gen"));
        order1.check();
    }
}
