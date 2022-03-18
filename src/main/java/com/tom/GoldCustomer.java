package com.tom;

public class GoldCustomer extends SilverCustomer {
    public GoldCustomer(String name, int price) {
        super(name,price);
    }
    @Override
    public void print(){
        int cut = (price / 1000) * 200;
        int sum = price - cut;
        int add = (price / 1000) * 200;
        System.out.println(name + "\t" + price + "\t" + sum +"("+ add+")");
    }
}
