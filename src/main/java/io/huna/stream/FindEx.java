package io.huna.stream;

import java.util.Arrays;
import java.util.List;

public class FindEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "DEF", "G", "HI", "J", "KL", "MNO");

        list.stream()
                .filter(s -> s.length() == 1)
                .limit(1)
                .forEach(System.out::println);
        System.out.println();
        System.out.println(
          list.stream()
                  .filter(s -> s.length() == 1)
                  .findFirst()
                  .get()
        );
    }
}
