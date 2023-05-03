package com.toy.chapter04_factory.factory_method.pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "페퍼로니 피자";
        dough = "크러스트 도우";
        sauce = "토마토 소스";

        toppings.add("둥글게 조각낸 페퍼로니");
    }
}
