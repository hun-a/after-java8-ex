package io.huna.patterns.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
