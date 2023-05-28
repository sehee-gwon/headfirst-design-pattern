package com.toy.chapter06_command.step3_undo.command;

public class NoCommand implements Command {
    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
