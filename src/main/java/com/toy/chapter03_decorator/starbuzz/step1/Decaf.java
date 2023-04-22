package com.toy.chapter03_decorator.starbuzz.step1;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "디카페인 커피";
    }

    public double cost() {
        return 1.05 + super.cost();
    }
}
