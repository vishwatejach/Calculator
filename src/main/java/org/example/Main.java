package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*****************************");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Logarithm");
            System.out.println("4. Power");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + squareRoot(num1));
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    int factorialNum = scanner.nextInt();
                    System.out.println("Result: " + factorial(factorialNum));
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + naturalLogarithm(num1));
                    break;

                case 4:
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + power(num1, num2));
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 8.");
            }
        }
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLogarithm(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is undefined for non-positive numbers.");
        }
        return Math.log(x);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
