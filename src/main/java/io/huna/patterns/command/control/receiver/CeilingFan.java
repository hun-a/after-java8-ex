package io.huna.patterns.command.control.receiver;

public class CeilingFan {

    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void high() {
        System.out.println(name + " fan moves the highest speed.");
    }

    public void medium() {
        System.out.println(name + " fan moves medium speed.");
    }

    public void low() {
        System.out.println(name + " fan moves so slow speed.");
    }

    public void off() {
        System.out.println(name + " fan is off");
    }

    public void getSpeed() {
        System.out.println(name + " fan increases speed.");
    }
}
