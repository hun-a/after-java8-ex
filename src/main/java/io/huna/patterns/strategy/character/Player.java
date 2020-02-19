package io.huna.patterns.strategy.character;

import io.huna.patterns.strategy.attack.AttackStrategy;
import io.huna.patterns.strategy.move.MoveStrategy;

public class Player {
    private String name;
    private AttackStrategy attackStrategy;
    private MoveStrategy moveStrategy;

    public Player(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.printf("My job is %s.\n", this.name);
    }

    public void attack() {
        this.attackStrategy.attack();
    }

    public void move() {
        this.moveStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}
