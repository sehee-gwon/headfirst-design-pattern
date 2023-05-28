package com.toy.chapter06_command.step4_macro.receiver;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " TV가 켜졌습니다.");
    }

    public void off() {
        System.out.println(this.location + " TV가 꺼졌습니다.");
    }

    public void setInputChannel(String channel) {
        System.out.println(this.location + " TV에서 " + channel + "를 재생합니다.");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " TV의 볼륨이 " + volume + "로 설정되었습니다.");
    }
}
