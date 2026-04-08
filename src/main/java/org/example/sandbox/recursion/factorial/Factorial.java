package org.example.sandbox.recursion.factorial;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("factorial (" + i + ") = " + factorial(i));
        }
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;              // ← BASE CASE: stop here
        return n * factorial(n - 1);       // ← recursive case
    }
}


