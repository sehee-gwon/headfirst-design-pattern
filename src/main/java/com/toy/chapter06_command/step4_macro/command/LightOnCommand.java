package com.toy.chapter06_command.step4_macro.command;

import com.toy.chapter06_command.step4_macro.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
