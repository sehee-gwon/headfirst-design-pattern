package com.toy.chapter03_decorator.starbuzz.step2.decorator;

import com.toy.chapter03_decorator.starbuzz.step2.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
