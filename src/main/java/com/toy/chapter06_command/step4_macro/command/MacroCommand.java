package com.toy.chapter06_command.step4_macro.command;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i=0; i<this.commands.length; i++) {
            this.commands[i].execute();
        }
    }
}
