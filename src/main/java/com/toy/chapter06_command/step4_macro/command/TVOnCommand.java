package com.toy.chapter06_command.step4_macro.command;

import com.toy.chapter06_command.step4_macro.receiver.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
        this.tv.setInputChannel("DVD");
    }
}
