package com.toy.chapter10_state.step3_refactoring.state;

import com.toy.chapter10_state.step3_refactoring.GumballMachine;

public class HasQuarterState extends State {
    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        // not implements
    }

    @Override
    public String toString() {
        return "동전 있음";
    }
}
