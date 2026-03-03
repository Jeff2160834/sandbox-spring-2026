package org.example.sandbox.lambda;

import java.util.function.*;

import static java.lang.System.*;

public class LambdaDemo {

    // x -> x * 2

    // 4 classes
    // Predicate - takes an argument and returns a boolean
    Predicate<String> predicate = x -> x.startsWith("a");


    // Function - takes an argument and returns a value
    Function<String, Integer> function = x -> x.length();

    // Consumer - takes an argument and returns nothing


    // Supplier - takes no arguments and returns a value
    Supplier <String> supplier = () -> "Hello, World!";

    static void main(String[] args) {
        LambdaDemo demo = new LambdaDemo();

        out.println(demo.predicate.test("apple")); // true
        out.println(demo.predicate.test("banana")); // false

        out.println(demo.function.apply("Hello")); // 5
        out.println(demo.function.apply("World")); // 5

        out.println(demo.supplier.get()); // Hello, World!

    }

    // Consumer - takes an argument and returns nothing

}
