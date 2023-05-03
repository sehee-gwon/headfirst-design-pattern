package com.toy.chapter04_factory.pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "야채 피자";
        dough = "크러스트 도우";
        sauce = "토마토 소스";

        toppings.add("싱싱한 야채");
    }
}
