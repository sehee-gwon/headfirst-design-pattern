package com.toy.chapter04_factory.factory_method.pizza.chicago;

import com.toy.chapter04_factory.factory_method.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "시카고 스타일 딥 디쉬 야채 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("싱싱한 야채");
    }

    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
