package io.huna.patterns.strategy.move;

public class MageMoveStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("I can fly!");
    }
}
