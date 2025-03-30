package com.bridgelabz.exceptions;

public class InterestCalculator {
    public static void main(String[] args) {
        try {
            double interest = calculateInterest(2000, -1, 2);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }
}