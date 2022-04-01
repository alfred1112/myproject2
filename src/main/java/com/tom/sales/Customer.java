package com.tom.sales;

public class Customer {
    String name;
    int price;

     float off = 0.1f;
    public Customer(String name, int price) {
        this.name = name;
        this.price = price;
    }
     public float backmoney(){
        return(price/1000)*100;
    }

        public void print(){
        int cut = (price/1000)*100;
        int sum = price - cut;
        System.out.println(name+"\t"+price+"\t"+sum);

    }
}
