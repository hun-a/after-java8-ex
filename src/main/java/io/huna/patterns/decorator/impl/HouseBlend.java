package io.huna.patterns.decorator.impl;

import io.huna.patterns.decorator.Beverage;

public class HouseBlend extends Beverage {

    private String description;

    public HouseBlend() {
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
