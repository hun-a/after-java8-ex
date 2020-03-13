package io.huna.patterns.command.control.receiver;

public class GardenLight {

    public void setDuskTime(int time) {
        System.out.println("Set the dusk time to the " + time);
    }

    public void setDawnTime(int time) {
        System.out.println("Set the dawn time to the " + time);
    }

    public void manualOn() {
        System.out.println("Manual is on");
    }

    public void manualOff() {
        System.out.println("Manual is off");
    }
}
