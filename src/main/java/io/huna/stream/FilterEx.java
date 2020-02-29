package io.huna.stream;

import java.util.Arrays;
import java.util.List;

public class FilterEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "DEF", "G", "HI", "J", "KL", "MNO");

        // Using Lambda
        list.stream()
                .filter(s -> s.length() == 2)
                .forEach(System.out::println);

        // Using Method reference
        list.stream()
                .filter(FilterEx::lengthIsTwo)
                .forEach(System.out::println);
    }

    public static boolean lengthIsTwo(String str) {
            return str.length() == 2;
    }
}
