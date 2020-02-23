package io.huna.patterns.decorator;

public abstract class Beverage {
    protected String description = "No title";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
