package io.huna.stream;

import java.util.Arrays;
import java.util.List;

public class MapEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "DEF", "G", "HI", "J", "KL", "MNO");

        list.stream()
                .map(s -> s.length())
                .forEach(System.out::println);
        System.out.println();
        list.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
