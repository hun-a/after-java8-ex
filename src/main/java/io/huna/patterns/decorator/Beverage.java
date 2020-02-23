package io.huna.patterns.decorator;

public abstract class Beverage {
    String description = "No title";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
