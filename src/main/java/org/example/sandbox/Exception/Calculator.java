package org.example.sandbox.Exception;

public class Calculator {

    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return a / b;
    }

    public int safeDivide(int a, int b) {
        try {
            return divide(a, b);
        } catch (DivideByZeroException e) {
            System.err.println(e.getMessage());
            return 0; // or some default value
        }
    }

    static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.safeDivide(10, 2);
        System.out.println("Result of 10 / 2: " + result1);

        int result2 = calculator.safeDivide(10, 0);
        System.out.println("Result of 10 / 0: " + result2);
    }
}