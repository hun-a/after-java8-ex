package io.huna.lambda;

import io.huna.data.Apple;
import io.huna.data.Color;

import java.util.Arrays;
import java.util.List;

public class SimpleCompareToModern {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 70),
                new Apple(Color.RED, 160),
                new Apple(Color.RED, 180),
                new Apple(Color.GREEN, 50)
        );

        // Modern version
        list.stream()
                .peek(System.out::println)
                .sorted((a, b) -> a.getWeight().compareTo(b.getWeight()))
                .forEach(System.out::print);
    }
}
