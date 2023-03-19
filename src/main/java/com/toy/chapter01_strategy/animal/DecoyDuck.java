package com.toy.chapter01_strategy.animal;

import com.toy.chapter01_strategy.behavior.FlyNoWay;
import com.toy.chapter01_strategy.behavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 가짜 오리입니다");
    }
}
