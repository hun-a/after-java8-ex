package io.huna.patterns.command.control.receiver;

import io.huna.patterns.command.control.Speed;

public class CeilingFan {
    private Speed speed;
    private String name;

    public CeilingFan(String name) {
        this.name = name;
        this.speed = Speed.OFF;
    }

    public void high() {
        this.speed = Speed.HIGH;
        System.out.println(name + " fan moves the highest speed.");
    }

    public void medium() {
        this.speed = Speed.MEDIUM;
        System.out.println(name + " fan moves medium speed.");
    }

    public void low() {
        this.speed = Speed.LOW;
        System.out.println(name + " fan moves so slow speed.");
    }

    public void off() {
        this.speed = Speed.OFF;
        System.out.println(name + " fan is off");
    }

    public Speed getSpeed() {
        return speed;
    }
}
