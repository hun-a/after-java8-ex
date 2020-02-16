package io.huna.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionEx {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("AB", "CD", "EF");
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<String> result = listCombiner(list1, list2, (a, b) -> a + b);

        for (String s: result) {
            System.out.println(s);
        }
    }

    public static <T, U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> bi) {
        List<R> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            result.add(bi.apply(list1.get(i), list2.get(i)));
        }
        return result;
    }
}
