package com.toy.chapter06_command.step3_undo.invoke;

import com.toy.chapter06_command.step3_undo.command.Command;
import com.toy.chapter06_command.step3_undo.command.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }

        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ 리모컨 ------\n");

        for (int i=0; i<this.onCommands.length; i++) {
            sb.append("[slot " + i + "] " + this.onCommands[i].getClass().getName() +
                    "    " + this.offCommands[i].getClass().getName() + "\n");
        }

        sb.append("[undo] " + this.undoCommand.getClass().getName() + "\n");

        return sb.toString();
    }
}
