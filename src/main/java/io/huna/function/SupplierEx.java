package io.huna.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<Integer> randomGenerator = () -> new Random().nextInt(100);
        List<Integer> list = generateList(10, randomGenerator);

        for (Integer i: list) {
            System.out.println(i);
        }
    }

    public static List<Integer> generateList(int size, Supplier<Integer> supplier) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
