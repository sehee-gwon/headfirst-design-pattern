package com.toy.chapter07_adapter_facade.facade;

public class StreamingPlayer {
    String movie;

    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }

    public void pause() {
        System.out.println("스트리밍 플레이어가 멈췄습니다.");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("스트리밍 플레이어에서 \"" + this.movie + "\"를 재생합니다.");
    }

    public void setSurroundAudio() {
        System.out.println("스트리밍 플레이어를 서라운드 모드로 설정합니다(5.1채널).");
    }

    public void setTwoChannelAudio() {
        System.out.println("스트리밍 플레이어를 투 채널 모드로 설정합니다.");
    }

    public void stop() {
        System.out.println("스트리밍 플레이어에서 \"" + this.movie + "\"재생을 종료합니다.");
    }
}
