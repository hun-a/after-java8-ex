package io.huna.patterns.strategy;

import io.huna.patterns.strategy.attack.MageAttackStrategy;
import io.huna.patterns.strategy.attack.WarriorAttackStrategy;
import io.huna.patterns.strategy.character.Player;
import io.huna.patterns.strategy.move.MageMoveStrategy;
import io.huna.patterns.strategy.move.WarriorMoveStrategy;

public class Strategy {

    public static void main(String[] args) {
        Player warrior = new Player("Warrior");
        Player mage = new Player("Mage");

        warrior.setAttackStrategy(new WarriorAttackStrategy());
        warrior.setMoveStrategy(new WarriorMoveStrategy());

        mage.setAttackStrategy(new MageAttackStrategy());
        mage.setMoveStrategy(new MageMoveStrategy());

        warrior.introduce();
        warrior.attack();
        warrior.move();

        mage.introduce();
        mage.attack();
        mage.move();
    }
}
