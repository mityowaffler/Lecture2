package com.company;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        int number;
        System.out.println("Enter an Integer number:");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if ( number % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}