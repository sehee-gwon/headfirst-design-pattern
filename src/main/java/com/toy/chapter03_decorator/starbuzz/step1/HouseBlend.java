package com.toy.chapter03_decorator.starbuzz.step1;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "하우스 블렌드 커피";
    }

    public double cost() {
        return .89 + super.cost();
    }
}
