package io.huna.stream;

import io.huna.data.Apple;
import io.huna.data.Color;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEx {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                Apple.builder()
                        .color(Color.GREEN)
                        .weight(100)
                        .build(),
                Apple.builder()
                        .color(Color.RED)
                        .weight(150)
                        .build(),
                Apple.builder()
                        .color(Color.RED)
                        .weight(160)
                        .build(),
                Apple.builder()
                        .color(Color.YELLOW)
                        .weight(15)
                        .build(),
                Apple.builder()
                        .color(Color.GREEN)
                        .weight(95)
                        .build(),
                Apple.builder()
                        .color(Color.GREEN)
                        .weight(110)
                        .build()
        );

        System.out.println(
                list.stream()
                        .collect(
                                Collectors.groupingBy(Apple::getColor)
                        )
        );

        System.out.println();

        System.out.println(
                list.stream()
                        .collect(
                                Collectors.partitioningBy(apple -> apple.getWeight() > 100)
                        )
        );

        System.out.println();

        System.out.println(
                list.stream()
                        .map(Apple::getWeight)
                        .collect(Collectors.toCollection(LinkedList::new))
                        .toString()
        );

        System.out.println();

        System.out.println(
                list.stream()
                        .map(Apple::getWeight)
                        .collect(Collectors.summarizingInt(Integer::valueOf))
        );
    }
}

