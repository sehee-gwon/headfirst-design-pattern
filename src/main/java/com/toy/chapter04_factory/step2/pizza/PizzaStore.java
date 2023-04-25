package com.toy.chapter04_factory.step2.pizza;

import com.toy.chapter04_factory.step2.factory.SimplePizzaFactory;
import com.toy.chapter04_factory.step2.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
