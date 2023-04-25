package com.toy.chapter04_factory.step3;

import com.toy.chapter04_factory.step3.factory.NYPizzaStore;
import com.toy.chapter04_factory.step3.factory.PizzaStore;

public class PizzaMaking {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("veggie");
    }
}
