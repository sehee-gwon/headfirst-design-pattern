package com.toy.chapter01_strategy;

import com.toy.chapter01_strategy.animal.Duck;
import com.toy.chapter01_strategy.animal.MallardDuck;
import com.toy.chapter01_strategy.animal.ModelDuck;
import com.toy.chapter01_strategy.behavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
