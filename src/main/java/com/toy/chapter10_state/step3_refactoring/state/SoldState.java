package com.toy.chapter10_state.step3_refactoring.state;

import com.toy.chapter10_state.step3_refactoring.GumballMachine;

public class SoldState extends State {
    @Override
    public void refill(GumballMachine gumballMachine) {
        // not implements
    }

    @Override
    public String toString() {
        return "알맹이 내보내는중";
    }
}
