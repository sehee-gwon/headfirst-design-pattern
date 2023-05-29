package com.toy.chapter07_adapter_facade.facade;

public class Tuner {
    public void on() {
        System.out.println("라디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println("라디오가 꺼졌습니다.");
    }

    public void setAm() {
        System.out.println("라디오의 주파수를 AM으로 설정했습니다.");
    }

    public void setFm() {
        System.out.println("라디오의 주파수를 FM으로 설정했습니다.");
    }

    public void setFrequency(int frequency) {
        System.out.println("라디오의 주파수를 " + frequency + "로 설정했습니다.");
    }
}
