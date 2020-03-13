package io.huna.patterns.command.game.impl;

import io.huna.patterns.command.game.Potion;

public class BluePotion implements Potion {

    @Override
    public void drink() {
        System.out.println("Restored 50 mana.");
    }
}
