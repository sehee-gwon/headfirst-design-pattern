package com.toy.chapter04_factory.factory_method.pizza.california;

import com.toy.chapter04_factory.factory_method.pizza.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        name = "캘리포니아 스타일 소스와 페퍼로니 피자";
        dough = "얇은 크러스트 도우";
        sauce = "롱고바디 토마토홀 소스";

        toppings.add("둥글게 조각낸 페퍼로니");
        toppings.add("구운 마늘을 섞은 으깬 감자");
        toppings.add("바베큐 소스");
        toppings.add("미나리");
        toppings.add("키세스 초콜릿");
        toppings.add("땅콩");
    }
}
