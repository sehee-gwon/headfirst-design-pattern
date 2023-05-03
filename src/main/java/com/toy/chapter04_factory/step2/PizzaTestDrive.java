package com.toy.chapter04_factory.step2;

import com.toy.chapter04_factory.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("주문한 " + pizza.getName());
    }
}
