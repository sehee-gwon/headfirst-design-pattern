package com.toy.chapter01_strategy.behavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다");
    }
}
