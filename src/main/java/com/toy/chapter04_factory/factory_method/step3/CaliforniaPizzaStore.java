package com.toy.chapter04_factory.factory_method.step3;

import com.toy.chapter04_factory.factory_method.pizza.*;
import com.toy.chapter04_factory.factory_method.pizza.california.CaliforniaStyleCheesePizza;
import com.toy.chapter04_factory.factory_method.pizza.california.CaliforniaStyleClamPizza;
import com.toy.chapter04_factory.factory_method.pizza.california.CaliforniaStylePepperoniPizza;
import com.toy.chapter04_factory.factory_method.pizza.california.CaliforniaStyleVeggiePizza;

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
