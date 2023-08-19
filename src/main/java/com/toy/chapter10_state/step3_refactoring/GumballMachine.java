package com.toy.chapter10_state.step3_refactoring;

import com.toy.chapter10_state.step3_refactoring.state.*;

public class GumballMachine {
    private static final State SOLD_STATE;
    private static final State SOLD_OUT_STATE;
    private static final State HAS_QUARTER_STATE;
    private static final State NO_QUARTER_STATE;
    private static final State WINNER_STATE;

    State state;
    int count;

    static {
        SOLD_STATE = new SoldState();
        SOLD_OUT_STATE = new SoldOutState();
        HAS_QUARTER_STATE = new HasQuarterState();
        NO_QUARTER_STATE = new NoQuarterState();
        WINNER_STATE = new WinnerState();
    }

    public GumballMachine(int numberGumballs) {
        count = numberGumballs;
        if (numberGumballs > 0) {
            state = NO_QUARTER_STATE;
        } else {
            state = SOLD_OUT_STATE;
        }
    }

    // 동전 투입
    public void insertQuarter() {
        state.insertQuarter(this);
    }

    // 동전 반환
    public void ejectQuarter() {
        state.ejectQuarter(this);
    }

    // 손잡이 돌림
    public void turnCrank() {
        state.turnCrank(this);
        state.dispense(this);
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("뽑기 기계에 알맹이가 리필되었습니다. 현재 개수: " + this.count);
        state.refill(this);
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

    public State getSoldState() {
        return SOLD_STATE;
    }

    public State getSoldOutState() {
        return SOLD_OUT_STATE;
    }

    public State getHasQuarterState() {
        return HAS_QUARTER_STATE;
    }

    public State getNoQuarterState() {
        return NO_QUARTER_STATE;
    }

    public State getWinnerState() {
        return WINNER_STATE;
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
