package io.huna.patterns.command.control;

/**
 * The invoker
 */
public class SImpleRemoteControl {

    Command slot;

    public SImpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
