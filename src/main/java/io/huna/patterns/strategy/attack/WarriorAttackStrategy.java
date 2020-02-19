package io.huna.patterns.strategy.attack;

public class WarriorAttackStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Sword!");
    }
}
