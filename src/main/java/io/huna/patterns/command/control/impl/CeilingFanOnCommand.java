package io.huna.patterns.command.control.impl;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }
}
