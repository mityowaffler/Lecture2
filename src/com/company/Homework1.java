package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Enter a number");
        number = scan.nextInt();
        scan.close();

        int absoluteValue;
        if (number < 0) {
            absoluteValue = (number * (-1));
            System.out.println("The absolute value of the number: " +number + " is: " +absoluteValue);
        } else {
            System.out.println("The absolute value of the number: " + number + " is: " +number);
        }
    }
}





