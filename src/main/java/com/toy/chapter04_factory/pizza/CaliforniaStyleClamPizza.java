package com.toy.chapter04_factory.pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "캘리포니아 스타일 소스와 조개 피자";
        dough = "얇은 크러스트 도우";
        sauce = "롱고바디 토마토홀 소스";

        toppings.add("해물향이 물씬 나는 조갯살");
        toppings.add("구운 마늘을 섞은 으깬 감자");
        toppings.add("바베큐 소스");
        toppings.add("미나리");
        toppings.add("키세스 초콜릿");
        toppings.add("땅콩");
    }
}
