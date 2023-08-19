package com.toy.chapter10_state.step3_refactoring.state;

import com.toy.chapter10_state.step3_refactoring.GumballMachine;

public class SoldOutState extends State {
    @Override
    public void refill(GumballMachine gumballMachine) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "매진";
    }
}
