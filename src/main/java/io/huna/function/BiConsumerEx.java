package io.huna.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E");
        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5");
        consume(list1, list2, (a, b) -> System.out.println(a + b));
    }

    public static <T> void consume(List<T> list1, List<T> list2, BiConsumer<T, T> c) {
        for (int i = 0; i < list1.size(); i++) {
           c.accept(list1.get(i), list2.get(i));
        }
    }
}
