package com.toy.chapter03_decorator.starbuzz.step1;

public class StarBuzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage.setMocha(true);
        beverage.setWhip(true);
        System.out.println("주문하신 " + beverage.getDescription() + " 나왔습니다. 가격은 $" + beverage.cost() + " 입니다.");
    }
}
