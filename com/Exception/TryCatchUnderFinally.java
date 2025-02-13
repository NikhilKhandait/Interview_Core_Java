package com.Exception;
public class TryCatchUnderFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            // Simulating an exception
            int result = 10 / 0; // This will throw ArithmeticException
            
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
           
        } finally {
            System.out.println("Inside finally block");
            try {
                // Code that may throw another exception
                String str = null;
                System.out.println(str.length()); // This will throw NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Caught an exception in finally: " + e.getMessage());
            }
        }
    }
}