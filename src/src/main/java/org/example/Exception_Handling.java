package org.example;

public class Exception_Handling {

        static int staticCounter = 0;
        final int MAX_LIMIT = 100;

        static void staticMethod() {
            System.out.println("This is a static method.");
        }

        final void finalMethod() {
            System.out.println("This is a final method.");
        }

        void divideNumbers(int a, int b) {
            try {
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } finally {
                System.out.println("Division operation completed.");
            }
        }

        public static void main(String[] args) {

            System.out.println("Initial staticCounter: " + Exception_Handling.staticCounter);
            Exception_Handling.staticMethod();

            Exception_Handling example = new Exception_Handling();
            System.out.println("MAX_LIMIT: " + example.MAX_LIMIT);

            example.finalMethod();
            example.divideNumbers(10, 2);
            example.divideNumbers(10, 0);

            Exception_Handling.staticCounter++;
            System.out.println("Updated staticCounter: " + Exception_Handling.staticCounter);
        }

}
