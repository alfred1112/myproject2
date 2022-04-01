package com.tom.sales;

public class PlatinumCustomer extends GoldCustomer{
    public PlatinumCustomer(String name,int price){
        super(name, price);
        off = 0.7f;
    }
    public float  sum(){
        return price*off;
    }
    public float backmoney(){
        off = 0.2f;
        return price*off;
    }

    @Override
    public void print(){
      int sum = price;
      System.out.println(name+"\t"+price+"\t"+sum()+"("+backmoney()+")");
    }
}



// 白金級會員 30%off+20%point (7折+20%還元金)