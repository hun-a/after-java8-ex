package io.huna.patterns.command.control.impl;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {

    }
}
