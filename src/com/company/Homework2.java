package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int classesHeld;
        int classesAttended;

        System.out.println("Please enter the number of all classes held");
        classesHeld = scan.nextInt();

        System.out.println("Please enter the number of all classes attended");
        classesAttended = scan.nextInt();

        scan.close();

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.#", otherSymbols);

        double attended = ((double)classesAttended / classesHeld) *100;

        if (attended < 75) {
            System.out.println("Attended: " +(df.format(attended)) +"% of all classes held\n" + "You aren't able to attend the exam!");
        } else {
            System.out.println("Attended: " +(df.format(attended)) +"% of all classes held\n" +"You are able to attend the exam!");
        }

    }
}
