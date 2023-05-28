package com.toy.chapter06_command.step4_macro.command;

import com.toy.chapter06_command.step4_macro.receiver.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
    }
}
