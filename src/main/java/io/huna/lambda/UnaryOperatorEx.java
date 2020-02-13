package io.huna.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    public static void main(String[] args) {
        List<Long> list = map(
                Arrays.asList(10L, 20L, 30L, 40L, 50L),
                i -> i * i
        );
        System.out.println(list);
    }

    public static <T extends Number>  List<T> map(List<T> list, UnaryOperator<T> u) {
        List<T> result = new ArrayList<>();
        for (T t: list) {
            result.add(u.apply(t));
        }
        return result;
    }
}
