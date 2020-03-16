package io.huna.patterns.command.control.invoker;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.impl.NoCommand;

/**
 * The invoker
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];


        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append(String.format("[slot %d] %s %s\n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
        }
        return sb.toString();
    }
}
