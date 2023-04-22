package com.toy.chapter03_decorator.starbuzz.step1;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "다크 로스트 커피";
    }

    public double cost() {
        return .99 + super.cost();
    }
}