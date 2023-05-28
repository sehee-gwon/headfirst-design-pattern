package com.toy.chapter06_command.step2_normal.receiver;

public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " 조명이 켜졌습니다.");
    }

    public void off() {
        System.out.println(this.location + " 조명이 꺼졌습니다.");
    }
}
