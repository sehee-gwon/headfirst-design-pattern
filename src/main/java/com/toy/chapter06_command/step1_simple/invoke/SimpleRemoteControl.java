package com.toy.chapter06_command.step1_simple.invoke;

import com.toy.chapter06_command.step1_simple.command.Command;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
