package com.toy.chapter03_decorator.starbuzz.step2.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        this.size = size;
        this.description = "다크 로스트 커피 (" + size + ")";
    }

    public double cost() {
        return .99;
    }
}