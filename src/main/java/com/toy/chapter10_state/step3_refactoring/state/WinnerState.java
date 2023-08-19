package com.toy.chapter10_state.step3_refactoring.state;

import com.toy.chapter10_state.step3_refactoring.GumballMachine;

public class WinnerState extends State {
    @Override
    public void dispense(GumballMachine gumballMachine) {
        super.dispense(gumballMachine);
        System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
        super.dispense(gumballMachine);
    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        // not extends
    }

    @Override
    public String toString() {
        return "당첨";
    }
}
