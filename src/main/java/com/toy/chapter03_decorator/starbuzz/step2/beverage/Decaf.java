package com.toy.chapter03_decorator.starbuzz.step2.beverage;

public class Decaf extends Beverage {
    public Decaf(Size size) {
        this.size = size;
        this.description = "디카페인 커피 " + size + ")";
    }

    public double cost() {
        return 1.05;
    }
}
