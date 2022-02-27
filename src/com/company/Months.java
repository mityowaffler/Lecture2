package com.company;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        int month;
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year");
        year = scan.nextInt();

        System.out.println("1 = January\n2 = February\n3 = March\n4 = April\n5 = May\n6 = June\n7 = July\n8 = August\n9 = September\n10 = October\n11 = November\n12 = December\nPlease enter a valid number to select a month:");
        month = scan.nextInt();
        scan.close();

        if(month == 1) {
            System.out.println("January " +year + " has 31 days.");
        } else if(month==2) {
            if((year%400==0) || ((year%100!=0) && (year%4==0))) {
                System.out.println("February " +year +" has 29 days.");
            } else {
                System.out.println("February " + year + " has 28 days.");
            }
        } else if (month==3) {
            System.out.println("March " +year +" has 31 days.");
        } else if (month==4) {
            System.out.println("April " +year +" has 30 days.");
        } else if (month==5) {
            System.out.println("May " +year +" has 31 days.");
        } else if (month==6) {
            System.out.println("June " +year +" has 30 days.");
        } else if (month==7) {
            System.out.println("July " +year +" has 31 days.");
        } else if (month==8) {
            System.out.println("August " +year +" has 31 days.");
        } else if (month==9) {
            System.out.println("September " +year +" has 30 days.");
        } else if (month==10) {
            System.out.println("October " +year +" has 31 days.");
        } else if (month==11) {
            System.out.println("November " +year +" has 30 days.");
        } else if (month==12) {
            System.out.println("December " +year +" has 31 days.");
        }
    }
}
