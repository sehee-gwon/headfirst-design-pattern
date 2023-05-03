package com.toy.chapter04_factory.abstract_factory;

import com.toy.chapter04_factory.abstract_factory.pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza.getName());
    }
}
