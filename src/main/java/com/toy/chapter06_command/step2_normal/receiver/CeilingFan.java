package com.toy.chapter06_command.step2_normal.receiver;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void on() {
        System.out.println(this.location + " 선풍기가 켜졌습니다.");
        this.speed = MEDIUM;
    }

    public void off() {
        System.out.println(this.location + " 선풍기가 꺼졌습니다.");
        this.speed = OFF;
    }
    
    public void high() {
        System.out.println(this.location + " 선풍기의 속도가 높게 설정되었습니다.");
        this.speed = HIGH;
    }

    public void medium() {
        System.out.println(this.location + " 선풍기의 속도가 중간으로 설정되었습니다.");
        this.speed = MEDIUM;
    }

    public void low() {
        System.out.println(this.location + " 선풍기의 속도가 낮게 설정되었습니다.");
        this.speed = LOW;
    }

    public int getSpeed() {
        return this.speed;
    }
}
