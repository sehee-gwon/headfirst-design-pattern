package com.toy.chapter01_strategy.animal;

import com.toy.chapter01_strategy.behavior.FlyWithWings;
import com.toy.chapter01_strategy.behavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 붉은머리 오리입니다");
    }
}
