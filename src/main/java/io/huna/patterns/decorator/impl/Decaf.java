package io.huna.patterns.decorator.impl;

import io.huna.patterns.decorator.Beverage;

public class Decaf extends Beverage {

    private String message;

    public Decaf() {
        message = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
