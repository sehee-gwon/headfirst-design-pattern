package com.toy.chapter04_factory.step3;

import com.toy.chapter04_factory.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}