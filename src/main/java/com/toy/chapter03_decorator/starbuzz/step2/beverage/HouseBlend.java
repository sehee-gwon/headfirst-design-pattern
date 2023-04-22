package com.toy.chapter03_decorator.starbuzz.step2.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(Size size) {
        this.size = size;
        this.description = "하우스 블렌드 커피 (" + size + ")";
    }

    public double cost() {
        return .89;
    }
}
