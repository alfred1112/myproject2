package com.tom;

public class SilverCustomer {
    String name;
    int price;

    public SilverCustomer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        int cut = (price / 1000) * 100;
        int sum = price - cut;
        int add = (price / 1000) * 100;
        System.out.println(name + "\t" + price + "\t" + sum +"("+ add+")");

    }
}

