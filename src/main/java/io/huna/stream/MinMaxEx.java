package io.huna.stream;

import java.util.Arrays;
import java.util.List;

public class MinMaxEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 100, 23, 99, 68, 15, 10, 31, 88, 999);

        System.out.println(
                list.stream()
                        .max(Integer::compareTo)
                        .orElse(0)
        );

        System.out.println(
                list.stream()
                        .min(Integer::compareTo)
                        .orElse(0)
        );
    }
}
