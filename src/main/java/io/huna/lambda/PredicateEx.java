package io.huna.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "", "Banana", "Cheese", "");
        Predicate<String> nonEmptyStringPredicate = s -> !s.isEmpty();
        List<String> nonEmpty = filter(list, nonEmptyStringPredicate);

        for (String s: nonEmpty) {
            System.out.println(s);
        }
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t: list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

}
