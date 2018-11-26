package com.company.OrderItem;

import java.util.List;

public class Order {
    public enum  Status{
        NEW,PAID,CANCELED
    }
    private Status status;
    private String data;
    private List<Item> items;
    public void addItem(Item item){
        this.items.add(item);
    }
    public double getSumPrice(){
        double sum=0;
        for (int i = 0; i <this.items.size() ; i++) {
            Item item=this.items.get(i);
            sum=sum+item.getPrice();
        }
        return sum;
    }
    public Order(Status status, String data, List<Item> items) {
        this.status = status;
        this.data = data;
        this.items = items;
    }

    public Order(String data, Status status ) {
        this.data = data;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", data='" + data + '\'' +
                ", items=" + items +
                '}';
    }

    public void check(){
        System.out.println("CHECK");
        for (int i = 0; i <this.items.size() ; i++) {
            Item item=this.items.get(i);
            System.out.println(item.getName()+": "+item.getPrice());
        }
        System.out.println("At all: "+getSumPrice());
    }
}
