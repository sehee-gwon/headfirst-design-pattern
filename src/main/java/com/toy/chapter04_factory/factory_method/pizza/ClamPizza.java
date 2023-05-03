package com.toy.chapter04_factory.factory_method.pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "조개 피자";
        dough = "크러스트 도우";
        sauce = "토마토 소스";

        toppings.add("해물향이 물씬 나는 조갯살");
    }
}
