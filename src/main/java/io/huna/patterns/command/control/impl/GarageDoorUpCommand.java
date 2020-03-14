package io.huna.patterns.command.control.impl;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {

    GarageDoor door;

    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
