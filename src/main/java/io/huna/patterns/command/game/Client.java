package io.huna.patterns.command.game;

import io.huna.patterns.command.game.impl.BluePotion;
import io.huna.patterns.command.game.impl.RedPotion;

public class Client {

    public static void main(String[] args) {
        // NOTE: Strategy Pattern is a special kind of the Command Pattern.
        Player huna = new Player();

        Potion redPotion = new RedPotion();
        Potion bluePotion = new BluePotion();

        huna.pickUpThePotion(redPotion);
        huna.usePotion();

        // After a while...

        huna.pickUpThePotion(bluePotion);
        huna.usePotion();
    }
}