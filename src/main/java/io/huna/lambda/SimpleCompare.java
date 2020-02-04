package io.huna.lambda;

import io.huna.data.Apple;
import io.huna.data.Color;
import io.huna.util.Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleCompare {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 70),
                new Apple(Color.RED, 160),
                new Apple(Color.RED, 180),
                new Apple(Color.GREEN, 50)
        );

        // Old Java
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        };

        Utils.printList(">>>> Original:", list);
        Collections.sort(list, byWeight);
        Utils.printList(">>>> Old version sort:", list);

        System.out.println("-----------------------------------------------------------------------------------------");

        list = Arrays.asList(
                new Apple(Color.GREEN, 100),
                new Apple(Color.GREEN, 70),
                new Apple(Color.RED, 160),
                new Apple(Color.RED, 180),
                new Apple(Color.GREEN, 50)
        );

        // Modern Java
        Comparator<Apple> byWeightAsLambda = (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());

        Utils.printList(">>>> Original:", list);
        Collections.sort(list, byWeightAsLambda);
        Utils.printList(">>>> Modern version sort:", list);
    }
}
