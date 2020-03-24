package io.huna.patterns.command.control.impl;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.receiver.Stereo;

public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
