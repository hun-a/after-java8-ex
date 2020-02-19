package io.huna.patterns.strategy.attack;

public class MageAttackStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Fire ball!");
    }
}
