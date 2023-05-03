package com.toy.chapter04_factory.factory_method.step3;

import com.toy.chapter04_factory.factory_method.pizza.*;
import com.toy.chapter04_factory.factory_method.pizza.chicago.ChicagoStyleCheesePizza;
import com.toy.chapter04_factory.factory_method.pizza.chicago.ChicagoStyleClamPizza;
import com.toy.chapter04_factory.factory_method.pizza.chicago.ChicagoStylePepperoniPizza;
import com.toy.chapter04_factory.factory_method.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
