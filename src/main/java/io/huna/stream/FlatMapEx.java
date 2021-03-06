package io.huna.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A", "B", "C", "D"),
                Arrays.asList("E", "F", "G", "H"),
                Arrays.asList("I", "J", "K", "L")
        );

        System.out.println(list);

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
