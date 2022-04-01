package com.tom.sales;

public class GoldCustomer extends SilverCustomer {
    public GoldCustomer(String name, int price) {
        super(name,price);
        off = 0.2f;
    }
    @Override
    public void print(){
        int cut = (price / 1000) * 200;
        int sum = price - cut;
        int add = (price / 1000) * 200;
        System.out.println(name + "\t" + price + "\t" + sum +"("+ add+")");
    }
}
