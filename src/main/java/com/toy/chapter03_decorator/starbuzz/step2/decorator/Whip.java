package com.toy.chapter03_decorator.starbuzz.step2.decorator;

import com.toy.chapter03_decorator.starbuzz.step2.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        double cost = this.beverage.cost();
        if (this.beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (this.beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (this.beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
