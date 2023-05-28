package com.toy.chapter06_command.step3_undo.command;

public interface Command {
    void execute();
    void undo();
}
