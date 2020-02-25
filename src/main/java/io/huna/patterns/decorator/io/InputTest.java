package io.huna.patterns.decorator.io;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        String path = "src/main/java/io/huna/patterns/decorator/io/input.txt";
        try (InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream(path)))) {
            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException e) {

        }
    }
}
