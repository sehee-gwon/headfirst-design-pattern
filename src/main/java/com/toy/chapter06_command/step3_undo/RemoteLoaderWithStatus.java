package com.toy.chapter06_command.step3_undo;

import com.toy.chapter06_command.step3_undo.command.CeilingFanHighCommand;
import com.toy.chapter06_command.step3_undo.command.CeilingFanMediumCommand;
import com.toy.chapter06_command.step3_undo.command.CeilingFanOffCommand;
import com.toy.chapter06_command.step3_undo.invoke.RemoteControlWithUndo;
import com.toy.chapter06_command.step3_undo.receiver.CeilingFan;

public class RemoteLoaderWithStatus {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("거실");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
