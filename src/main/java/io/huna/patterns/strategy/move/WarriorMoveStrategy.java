package io.huna.patterns.strategy.move;

public class WarriorMoveStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Just walk or run!");
    }

}
