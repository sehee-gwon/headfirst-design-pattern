package com.toy.chapter03_decorator.starbuzz.step2.decorator;

import com.toy.chapter03_decorator.starbuzz.step2.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        double cost = this.beverage.cost();
        if (this.beverage.getSize() == Size.TALL) {
            cost += .20;
        } else if (this.beverage.getSize() == Size.GRANDE) {
            cost += .25;
        } else if (this.beverage.getSize() == Size.VENTI) {
            cost += .30;
        }
        return cost;
    }
}
