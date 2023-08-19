package com.toy.chapter10_state.step3_refactoring.state;

import com.toy.chapter10_state.step3_refactoring.GumballMachine;

import java.util.Random;

public abstract class State {
    Random randomWinner = new Random(System.currentTimeMillis());

    public void insertQuarter(GumballMachine gumballMachine) {
        throw new IllegalStateException("동전을 넣을 수 없습니다.");
    }

    public void ejectQuarter(GumballMachine gumballMachine) {
        throw new IllegalStateException("동전을 반환할 수 없습니다.");
    }

    public void turnCrank(GumballMachine gumballMachine) {
        if (!(gumballMachine.getState() instanceof HasQuarterState)) {
            throw new IllegalStateException("손잡이를 돌릴 수 없습니다.");
        }

        System.out.println("손잡이를 돌리셨습니다.");

        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense(GumballMachine gumballMachine) {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            System.out.println("매진되었습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    public abstract void refill(GumballMachine gumballMachine);
}
