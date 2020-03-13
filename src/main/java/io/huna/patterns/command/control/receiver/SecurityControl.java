package io.huna.patterns.command.control.receiver;

public class SecurityControl {

    public void arm() {
        System.out.println("The security alarm is ready");
    }

    public void disarm() {
        System.out.println("The security alarm is disabled");
    }
}
