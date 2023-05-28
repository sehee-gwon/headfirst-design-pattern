package com.toy.chapter06_command.step4_macro.command;

import com.toy.chapter06_command.step4_macro.receiver.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.setTemperature(40);
        this.hottub.on();
    }
}
