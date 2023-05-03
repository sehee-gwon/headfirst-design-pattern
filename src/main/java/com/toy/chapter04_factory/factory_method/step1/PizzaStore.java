package com.toy.chapter04_factory.factory_method.step1;

import com.toy.chapter04_factory.factory_method.pizza.CheesePizza;
import com.toy.chapter04_factory.factory_method.pizza.PepperoniPizza;
import com.toy.chapter04_factory.factory_method.pizza.Pizza;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
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