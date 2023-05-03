package com.toy.chapter04_factory.factory_method.step1;

import com.toy.chapter04_factory.factory_method.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("주문한 " + pizza.getName());
    }
}
