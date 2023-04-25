package com.toy.chapter04_factory.step3.factory;

import com.toy.chapter04_factory.step3.pizza.*;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new CaliforniaStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new CaliforniaStyleVeggiePizza();
        }

        return pizza;
    }
}
