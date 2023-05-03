package com.toy.chapter03_decorator.starbuzz.step2.decorator;

import com.toy.chapter03_decorator.starbuzz.step2.beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        setSize(beverage.getSize());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        double cost = this.beverage.cost();
        if (this.beverage.getSize() == Size.TALL) {
            cost += .15;
        } else if (this.beverage.getSize() == Size.GRANDE) {
            cost += .20;
        } else if (this.beverage.getSize() == Size.VENTI) {
            cost += .25;
        }
        return cost;
    }
}
