package com.toy.chapter07_adapter_facade.facade;

public class Amplifier {
    StreamingPlayer player;
    Tuner tuner;

    public void on() {
        System.out.println("앰프가 켜졌습니다.");
    }

    public void off() {
        System.out.println("앰프가 꺼졌습니다.");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
        System.out.println("앰프를 스트리밍 플레이어와 연결합니다.");
    }

    public void setStereoSound() {
        System.out.println("앰프를 서라운드 모드로 설정합니다(5.1채널).");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("앰프를 튜너와 연결합니다.");
    }

    public void setVolume(int volume) {
        System.out.println("앰프 볼륨을 " + volume + "로 설정합니다.");
    }
}