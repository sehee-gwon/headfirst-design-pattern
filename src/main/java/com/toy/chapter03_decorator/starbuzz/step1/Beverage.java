package com.toy.chapter03_decorator.starbuzz.step1;

public abstract class Beverage {
    String description = "제목 없음";;

    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    double milkCost = .10;
    double soyCost = .15;
    double mochaCost = .20;
    double whipCost = .10;

    public String getDescription() {
        return description;
    }

    public double cost() {
        double conditionCost = 0.0;
        if (hasMilk()) conditionCost += milkCost;
        if (hasSoy()) conditionCost += soyCost;
        if (hasMocha()) conditionCost += mochaCost;
        if (hasWhip()) conditionCost += whipCost;
        return conditionCost;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
