package io.huna.patterns.command.control;

import io.huna.patterns.command.control.impl.LightOnCommand;
import io.huna.patterns.command.control.invoker.SimpleRemoteControl;
import io.huna.patterns.command.control.receiver.Light;

/**
 * The client
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Test");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
