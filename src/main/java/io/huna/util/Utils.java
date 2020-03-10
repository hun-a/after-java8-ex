package io.huna.util;

import java.util.List;

public class Utils {

    public static void printList(List list) {
        for (Object o: list) {
            System.out.printf("%s, ", o.toString());
        }
        System.out.println();
    }

    public static void printList(String message, List list) {
        System.out.println(message);
        printList(list);
    }

    public static <T> void print(T t) {
        System.out.print(t + " ");
    }
}
