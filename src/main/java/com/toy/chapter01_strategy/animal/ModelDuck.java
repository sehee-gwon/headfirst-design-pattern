package com.toy.chapter01_strategy.animal;

import com.toy.chapter01_strategy.behavior.FlyNoWay;
import com.toy.chapter01_strategy.behavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}
