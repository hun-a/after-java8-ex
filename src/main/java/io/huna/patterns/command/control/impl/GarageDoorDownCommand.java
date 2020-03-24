package io.huna.patterns.command.control.impl;

import io.huna.patterns.command.control.Command;
import io.huna.patterns.command.control.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

    GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up();
    }

    @Override
    public void undo() {

    }
}
