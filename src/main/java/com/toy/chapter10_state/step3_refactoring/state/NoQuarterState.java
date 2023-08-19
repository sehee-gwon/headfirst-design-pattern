package com.toy.chapter10_state.step3_refactoring.state;

import com.toy.chapter10_state.step3_refactoring.GumballMachine;

public class NoQuarterState extends State {
    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("동전을 넣으셨습니다.");
    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        // not implements
    }

    @Override
    public String toString() {
        return "동전 투입 대기중";
    }
}
