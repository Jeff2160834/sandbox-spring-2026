package org.example.sandbox.recursion.fib;

import java.math.BigInteger;

public class FibonacciDriver {
    public static void main(String[] args) {

        FibonacciNumbers fn = new FibonacciNumbers();

        for (int i = 0; i < 100; i++) {
            BigInteger fib = fn.fib(i);
            System.out.println("fib (" + i + ") = " + fib);
        }


    }
}
