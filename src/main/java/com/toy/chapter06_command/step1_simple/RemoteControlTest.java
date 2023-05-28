package com.toy.chapter06_command.step1_simple;

import com.toy.chapter06_command.step1_simple.invoke.SimpleRemoteControl;
import com.toy.chapter06_command.step1_simple.receiver.GarageDoor;
import com.toy.chapter06_command.step1_simple.receiver.Light;
import com.toy.chapter06_command.step1_simple.command.GarageDoorOpenCommand;
import com.toy.chapter06_command.step1_simple.command.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(garageDoorOpen);
        remoteControl.buttonWasPressed();
    }
}
