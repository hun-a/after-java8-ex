package io.huna.patterns.command.control.receiver;

public class TV {

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel(int channel) {
        System.out.println("Set the channel to the " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("Set the volume to the " + volume);
    }
}
