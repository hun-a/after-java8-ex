package io.huna.patterns.command.game.impl;

import io.huna.patterns.command.game.Potion;

public class RedPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("Healed 50 health.");
    }
}
