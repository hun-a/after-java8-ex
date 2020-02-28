package io.huna.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateEx {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11, 13);
        List<Integer> list2 = Arrays.asList(13, 11, 9, 7, 5, 3, 1);
        List<Integer> list = testEach(list1, list2, BiPredicateEx::equals);

        System.out.println(list);
    }

    private static <T extends Number> List<T> testEach(List<T> list1, List<T> list2, BiPredicate<T, T> bi) {
        List<T> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (bi.test(list1.get(i), list2.get(i))) {
                result.add(list1.get(i));
            }
        }

        return result;
    }

    private static boolean equals(Integer a, Integer b) {
        return a.equals(b);
    }
}
