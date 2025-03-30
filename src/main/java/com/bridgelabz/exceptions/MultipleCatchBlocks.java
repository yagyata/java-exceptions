package com.bridgelabz.exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = new int[5];
//            int[] arr = null;
            System.out.print("Enter five elements in the array: ");
            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the index you want to check: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
