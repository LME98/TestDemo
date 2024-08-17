package org.example;

public class Java_loops {

        public static void main(String[] args) {
            int age = 25;

            if (age >= 18 && age <= 65) {
                System.out.println("You are an adult.");
            } else if (age > 65) {
                System.out.println("You are a senior.");
            } else {
                System.out.println("You are a minor.");
            }

            System.out.println("For loop to print even numbers:");
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even number: " + i);
            }


            System.out.println("While loop to print odd numbers:");
            int oddNumber = 1;
            while (oddNumber <= 9) {
                System.out.println("Odd number: " + oddNumber);
                oddNumber += 2;
            }

            System.out.println("Do-While loop to countdown:");
            int countdown = 5;
            do {
                System.out.println("Countdown: " + countdown);
                countdown--;
            } while (countdown > 0);
        }

}
