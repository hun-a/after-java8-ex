package io.huna.stream;

import io.huna.util.Utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 100, 23, 99, 68, 15, 10, 31, 88, 999);

        list.stream()
                .sorted()
                .forEach(Utils::print);

        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(Utils::print);
    }
}
