package com.toy.chapter01_strategy.behavior;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
