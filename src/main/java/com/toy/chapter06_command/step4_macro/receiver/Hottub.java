package com.toy.chapter06_command.step4_macro.receiver;

public class Hottub {
    int temperature;

    public void on() {
        System.out.println("현재 욕조 온도: " + this.temperature + "도");
    }

    public void off() {
        setTemperature(36);
    }
    
    public void circulate() {
        System.out.println("욕조의 물이 순환됩니다.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("욕조 온도를 " + this.temperature + "도로 설정합니다.");
    }
}
