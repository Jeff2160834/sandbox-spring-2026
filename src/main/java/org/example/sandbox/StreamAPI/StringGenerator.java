package org.example.sandbox.StreamAPI;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    Random random = new Random();
    char[] letters = "012345678ABCDEF".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }
}
