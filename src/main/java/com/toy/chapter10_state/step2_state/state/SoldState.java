package com.toy.chapter10_state.step2_state.state;

import com.toy.chapter10_state.step2_state.GumballMachine;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            System.out.println("매진되었습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    public String toString() {
        return "알맹이 내보내는중";
    }
}
