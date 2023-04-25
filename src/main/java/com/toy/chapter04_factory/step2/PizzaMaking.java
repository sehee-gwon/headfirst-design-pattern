package com.toy.chapter04_factory.step2;

import com.toy.chapter04_factory.step2.factory.SimplePizzaFactory;
import com.toy.chapter04_factory.step2.pizza.PizzaStore;

public class PizzaMaking {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("pepperoni");
    }
}
