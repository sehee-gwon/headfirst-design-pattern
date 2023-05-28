package com.toy.chapter06_command.step3_undo;

import com.toy.chapter06_command.step3_undo.command.LightOffCommand;
import com.toy.chapter06_command.step3_undo.command.LightOnCommand;
import com.toy.chapter06_command.step3_undo.invoke.RemoteControlWithUndo;
import com.toy.chapter06_command.step3_undo.receiver.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomRight = new Light("거실");

        LightOnCommand livingRoomRightOn = new LightOnCommand(livingRoomRight);
        LightOffCommand livingRoomRightOff = new LightOffCommand(livingRoomRight);

        remoteControl.setCommand(0, livingRoomRightOn, livingRoomRightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
