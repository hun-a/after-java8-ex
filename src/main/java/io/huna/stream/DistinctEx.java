package io.huna.stream;

import io.huna.data.Apple;
import io.huna.data.Color;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class DistinctEx {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                Apple.builder()
                        .weight(150)
                        .color(Color.RED)
                        .build(),
                Apple.builder()
                        .weight(90)
                        .color(Color.GREEN)
                        .build(),
                Apple.builder()
                        .weight(70)
                        .color(Color.GREEN)
                        .build(),
                Apple.builder()
                        .weight(140)
                        .color(Color.RED)
                        .build(),
                Apple.builder()
                        .weight(120)
                        .color(Color.YELLOW)
                        .build(),
                Apple.builder()
                        .weight(110)
                        .color(Color.YELLOW)
                        .build()
        );

        list.stream()
                .distinct() // Hm... I want to get distinct by a specific property on the Object at the Java 8
                .forEach(System.out::println);

        System.out.println();

        // Like this!
        list.stream()
                .filter(distinctByKey(Apple::getColor))
                .forEach(System.out::println);
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
