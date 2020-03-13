package io.huna.patterns.command.control;

import io.huna.patterns.command.control.impl.LightOnCommand;

/**
 * The client
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SImpleRemoteControl remote = new SImpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
