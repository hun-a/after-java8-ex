package io.huna.patterns.command.control.receiver;

public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " garage door is up");
    }

    public void down() {
        System.out.println(name + " garage door is down");
    }

    public void stop() {
        System.out.println(name + " garage door stops");
    }

    public void lightOn() {
        System.out.println(name + " light on the garage is on");
    }

    public void lightOff() {
        System.out.println(name + " light on the garage is off");
    }
}
