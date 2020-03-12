package io.huna.patterns.command.impl;

import io.huna.patterns.command.Potion;

public class BluePotion implements Potion {

    @Override
    public void drink() {
        System.out.println("Restored 50 mana.");
    }
}
