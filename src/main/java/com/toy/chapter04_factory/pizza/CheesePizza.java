package com.toy.chapter04_factory.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "치즈 피자";
        dough = "크러스트 도우";
        sauce = "토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }
}
