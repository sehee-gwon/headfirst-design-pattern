package com.toy.chapter04_factory.step2.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("치즈 피자를 준비 중입니다.");
    }

    @Override
    public void bake() {
        System.out.println("치즈 피자를 굽는 중입니다.");
    }

    @Override
    public void cut() {
        System.out.println("치즈 피자를 자르는 중입니다.");
    }

    @Override
    public void box() {
        System.out.println("치즈 피자를 포장하는 중입니다.");
    }
}
