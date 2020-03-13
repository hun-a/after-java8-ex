package io.huna.patterns.command.control.receiver;

public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCd() {
        System.out.println("Set the CD on the " + name + " stereo");
    }

    public void setDvd() {
        System.out.println("Set the DVD on the " + name + " stereo");
    }

    public void setRadio() {
        System.out.println("Set the radio on the " + name + " stereo");
    }

    public void setVolume(int volume) {
        System.out.println("Set the volume to the " + volume + " on the " + name + " stereo");
    }
}
