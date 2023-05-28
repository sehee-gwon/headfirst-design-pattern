package com.toy.chapter06_command.step1_simple.command;

import com.toy.chapter06_command.step1_simple.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
