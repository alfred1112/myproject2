package com.tom.sales;

public class money {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        SilverCustomer c3 = new SilverCustomer("0003",2000);
        GoldCustomer c4 = new GoldCustomer("0004",2500);
        DiscountCustomer c5 = new DiscountCustomer("0005",900);
        PlatinumCustomer c6 = new PlatinumCustomer("0006",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        c6.print();
     }
}

// 一般會員 滿千送百
// 銀級會員 滿千送百 + 百元還元金
// 金級會員 滿千送兩百 + 兩百元還元金
// 折扣會員 全額10%off (9折)
// 白金級會員 30%off+20%point (7折+20%還元金)