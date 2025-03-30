package com.bridgelabz.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            divide(num1,num2);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number can't be divided by zero");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter an integer value");
        } finally {
            sc.close();
        }
    }
    public static void divide(int n1, int n2) {
        int ans = n1/n2;
        System.out.println("Result: " + ans);
    }
}
