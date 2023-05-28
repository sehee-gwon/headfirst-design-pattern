package com.toy.chapter06_command.step4_macro;

import com.toy.chapter06_command.step4_macro.command.*;
import com.toy.chapter06_command.step4_macro.invoke.RemoteControl;
import com.toy.chapter06_command.step4_macro.receiver.Hottub;
import com.toy.chapter06_command.step4_macro.receiver.Light;
import com.toy.chapter06_command.step4_macro.receiver.Stereo;
import com.toy.chapter06_command.step4_macro.receiver.TV;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("거실");
        TV tv = new TV("거실");
        Stereo stereo = new Stereo("거실");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
        Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- 매크로 ON ---");
        remoteControl.onButtonWasPushed(0);

        System.out.println("--- 매크로 OFF ---");
        remoteControl.offButtonWasPushed(0);
    }
}
