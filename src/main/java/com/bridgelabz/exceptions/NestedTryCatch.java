package com.bridgelabz.exceptions;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            try {
                int value = arr[index];
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                }
                catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
        }
    }
}

