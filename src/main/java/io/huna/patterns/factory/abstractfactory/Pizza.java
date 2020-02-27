package io.huna.patterns.factory.abstractfactory;

import io.huna.patterns.factory.abstractfactory.ingredient.*;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies vegges[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        return super.toString();
    }
}
