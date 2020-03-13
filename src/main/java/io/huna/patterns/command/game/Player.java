package io.huna.patterns.command.game;

public class Player {
    private Potion potion;

    public void pickUpThePotion(Potion potion) {
        this.potion = potion;
    }

    public void usePotion() {
        potion.drink();
    }
}
