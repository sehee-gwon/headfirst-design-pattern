package com.toy.chapter06_command.step2_normal;

import com.toy.chapter06_command.step2_normal.invoke.RemoteControl;
import com.toy.chapter06_command.step2_normal.receiver.CeilingFan;
import com.toy.chapter06_command.step2_normal.receiver.GarageDoor;
import com.toy.chapter06_command.step2_normal.receiver.Light;
import com.toy.chapter06_command.step2_normal.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");
        CeilingFan ceilingFan = new CeilingFan("거실");
        GarageDoor garageDoor = new GarageDoor("차고");
        Stereo stereo = new Stereo("거실");

        remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        remoteControl.setCommand(2,
                () -> {
                    ceilingFan.on();
                    ceilingFan.high();
                },
                () -> ceilingFan.off()
        );
        remoteControl.setCommand(3, () -> garageDoor.up(), () -> garageDoor.down());
        remoteControl.setCommand(4,
                () -> {
                    stereo.on();
                    stereo.setCD();
                    stereo.setVolume(11);
                },
                () -> stereo.off()
        );

        System.out.println(remoteControl);

        for (int i=0; i<5; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
    }
}
