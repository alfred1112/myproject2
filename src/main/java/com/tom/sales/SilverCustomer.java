package com.tom.sales;

public class SilverCustomer extends Customer{
    public SilverCustomer(String name, int price) {
        super(name,price);

    }
    @Override
    public void print(){
        int cut = (price / 1000) * 100;
        int sum = price - cut;
        int add = cut;
        System.out.println(name + "\t" + price + "\t" + sum +"("+ add+")");
    }
}

