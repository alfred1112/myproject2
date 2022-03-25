package com.tom.sales;

public class Customer  {
        String name;
        int price ;
        public Customer(String name,int price) {
            this.name = name;
            this.price = price;
        }

        public void print(){
        int cut = (price/1000)*100;
        int sum = price - cut;
        System.out.println(name+"\t"+price+"\t"+sum);

    }
}
