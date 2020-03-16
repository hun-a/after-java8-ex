package io.huna.patterns.command.control.impl;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.Speed;
import io.huna.patterns.command.control.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {

    private CeilingFan fan;
    private Speed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        fan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH:
                fan.high();
                return;
            case MEDIUM:
                fan.medium();
                return;
            case LOW:
                fan.low();
                return;
            case OFF:
                fan.off();
        }
    }
}
