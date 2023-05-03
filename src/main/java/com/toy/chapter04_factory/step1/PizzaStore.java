package com.toy.chapter04_factory.step1;

import com.toy.chapter04_factory.pizza.CheesePizza;
import com.toy.chapter04_factory.pizza.GreekPizza;
import com.toy.chapter04_factory.pizza.PepperoniPizza;
import com.toy.chapter04_factory.pizza.Pizza;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}