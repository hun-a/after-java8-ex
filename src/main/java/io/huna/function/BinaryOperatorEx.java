package io.huna.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class BinaryOperatorEx {

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        Long sum = reduce(list, Long::sum);
        System.out.println(sum);

        modernReduce();
    }

    public static <T extends Number> T reduce(List<T> list, BinaryOperator<T> b) {
        T acc = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            acc = b.apply(acc, list.get(i));
        }
        return acc;
    }

    public static void modernReduce() {
        Long result = Stream.iterate(1L, l -> l + 1)
                .limit(10)
                .collect(Collectors.reducing(Long::sum))
                .get();
        System.out.println(result);

        long primitiveResult = LongStream.rangeClosed(1L, 10L)
                .reduce(Long::sum)
                .orElse(0L);
        System.out.println(primitiveResult);

        long anotherPrimitiveResult = LongStream.rangeClosed(1L, 10L).sum();    // Awesome!!
        System.out.println(anotherPrimitiveResult);
    }
}
