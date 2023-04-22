
package com.toy.chapter03_decorator.starbuzz.step2.beverage;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        this.size = size;
        this.description = "에스프레소 (" + size + ")";
    }

    public double cost() {
        return 1.99;
    }
}
