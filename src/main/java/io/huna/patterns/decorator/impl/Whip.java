package io.huna.patterns.decorator.impl;

import io.huna.patterns.decorator.Beverage;
import io.huna.patterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
