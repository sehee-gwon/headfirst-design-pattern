package com.toy.chapter06_command.step4_macro.command;

import com.toy.chapter06_command.step4_macro.receiver.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.off();
    }
}
