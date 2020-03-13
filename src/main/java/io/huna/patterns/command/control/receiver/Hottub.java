package io.huna.patterns.command.control.receiver;

public class Hottub {

    public void circulate() {
        System.out.println("Circulate the hot tub");
    }

    public void jetsOn() {
        System.out.println("Jets on to the hot tub");
    }

    public void jetsOff() {
        System.out.println("Jets off");
    }

    public void setTemperature(int temperature) {
        System.out.println("Set the temperature to the " + temperature);
    }
}
