package com.toy.chapter04_factory.pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "뉴욕 스타일 소스와 야채 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("싱싱한 야채");
    }
}
