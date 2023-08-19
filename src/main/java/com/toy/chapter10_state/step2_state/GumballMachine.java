package com.toy.chapter10_state.step2_state;

import com.toy.chapter10_state.step2_state.state.*;

public class GumballMachine {
    State soldState;
    State soldOutState;
    State hasQuarterState;
    State noQuarterState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            this.state = noQuarterState;
        } else {
            this.state = soldOutState;
        }
    }

    // 동전 투입
    public void insertQuarter() {
        state.insertQuarter();
    }

    // 동전 반환
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // 손잡이 돌림
    public void turnCrank() {
        state.turnCrank();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void releaseBall() {
        if (count > 0) {
            count -= 1;
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n주식회사 왕뽑기\n");
        sb.append("자바로 돌아가는 최신형 뽑기 기계\n");
        sb.append("남은 개수: ").append(count).append("개\n");
        sb.append(state);
        return sb.append("\n").toString();
    }
}
