
package com.toy.chapter03_decorator.starbuzz.step1;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "에스프레소";
    }

    public double cost() {
        return 1.99 + super.cost();
    }
}
