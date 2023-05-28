package com.toy.chapter06_command.step2_normal.receiver;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(this.location + " 문이 열렸습니다.");
    }

    public void down() {
        System.out.println(this.location + " 문이 닫혔습니다.");
    }

    public void stop() {
        System.out.println(this.location + " 문이 멈췄습니다.");
    }

    public void lightOn() {
        System.out.println(this.location + " 조명이 켜졌습니다.");
    }

    public void lightOff() {
        System.out.println(this.location + " 조명이 꺼졌습니다.");
    }
}
