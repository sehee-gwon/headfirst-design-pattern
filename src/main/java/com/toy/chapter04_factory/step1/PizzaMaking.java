package com.toy.chapter04_factory.step1;

import com.toy.chapter04_factory.step1.pizza.PizzaStore;

public class PizzaMaking {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
