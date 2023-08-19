package com.toy.chapter10_state.step2_state.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
