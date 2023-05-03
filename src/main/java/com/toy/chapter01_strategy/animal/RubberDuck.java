package com.toy.chapter01_strategy.animal;

import com.toy.chapter01_strategy.behavior.FlyNoWay;
import com.toy.chapter01_strategy.behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("저는 고무 오리입니다");
    }
}
