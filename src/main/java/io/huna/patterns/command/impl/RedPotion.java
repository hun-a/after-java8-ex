package io.huna.patterns.command.impl;

import io.huna.patterns.command.Potion;

public class RedPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("Healed 50 health.");
    }
}
