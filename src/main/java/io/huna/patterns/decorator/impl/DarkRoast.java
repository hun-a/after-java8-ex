package io.huna.patterns.decorator.impl;

import io.huna.patterns.decorator.Beverage;

public class DarkRoast extends Beverage {

    private String description;

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
