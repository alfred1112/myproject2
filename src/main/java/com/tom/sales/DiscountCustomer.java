package com.tom.sales;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String name,int price){
        super(name, price);
    }
    public float  sum(){
        off= 0.9f;
    return price*off;
    }
    @Override
    public void print(){
        System.out.println(name+"\t"+price+"\t"+sum());
    }
}


//    折扣會員 全額10%off (9折)