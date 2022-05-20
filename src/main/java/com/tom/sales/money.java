package com.tom.sales;

import java.util.ArrayList;
import java.util.List;

public class money {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003",2000));
        customers.add(new GoldCustomer("0004",2500));
        customers.add(new DiscountCustomer("0005",900));
        customers.add(new PlatinumCustomer("0006",5000));

        for (int i = 0; i < 6; i++) {
            customers.get(i).print();
        }
     }
}

// 一般會員 滿千送百
// 銀級會員 滿千送百 + 百元還元金
// 金級會員 滿千送兩百 + 兩百元還元金
// 折扣會員 全額10%off (9折)
// 白金級會員 30%off+20%point (7折+20%還元金)

// Graphical User Interface,GUI