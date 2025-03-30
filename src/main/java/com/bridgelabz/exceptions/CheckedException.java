package com.bridgelabz.exceptions;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error Occured");
        }
    }
}
