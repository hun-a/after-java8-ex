package io.huna.patterns.command.control.invoker;

import io.huna.patterns.command.control.Command;

/**
 * The invoker
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
