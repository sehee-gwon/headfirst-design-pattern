package com.toy.chapter07_adapter_facade.adapter.step1_duck;

import java.util.concurrent.ThreadLocalRandom;

public class DuckAdapter implements Turkey {
    Duck duck;
    ThreadLocalRandom random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.random = ThreadLocalRandom.current();
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            this.duck.fly();
        }
    }
}
