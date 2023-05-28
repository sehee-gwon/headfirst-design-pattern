package com.toy.chapter06_command.step3_undo.invoke;

import com.toy.chapter06_command.step3_undo.command.Command;
import com.toy.chapter06_command.step3_undo.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ 리모컨 ------\n");

        for (int i=0; i<this.onCommands.length; i++) {
            sb.append("[slot " + i + "] " + this.onCommands[i].getClass().getName() +
                    "    " + this.offCommands[i].getClass().getName() + "\n");
        }

        return sb.toString();
    }
}
