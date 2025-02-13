package com.Exception;
public class ReturnInExceptionExample {
    
    public static void main(String[] args) {
        System.out.println("Result: " + divideNumbers(10, 2));
    }
    
    public static String divideNumbers(int num1, int num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            int result = num1 / num2;
            return "Result: " + result;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
            return "Error: Division by zero is not allowed!";
        } finally {
            System.out.println("This is the finally block, always executed!");
        }
    }
}
