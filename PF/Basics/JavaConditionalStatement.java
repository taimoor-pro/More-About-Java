package PF.Basics;

import java.util.Scanner;

public class JavaConditionalStatement {
    public static void main(String[] args) {
        // * Question 1 : Write a Java program to get a number from the user and print
        // whether it is positive or negative!

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number to check your number is positive or
        // negative: ");

        // int nu = sc.nextInt();

        int nu = 12;

        if (nu > 0) {
            System.out.println("Positive Number " + nu);
        } else {
            System.out.println("Negative Number " + nu);
        }

        /*
         * Question 2 : Write a Java program to input week number(1-7) and print day of
         * week name using switch case.
         */
        int week = 5;
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("No Any Day!!");
                break;
        }

        /*
         * Question 3 : Write a Java program that takes a year from the user and print
         * whether that year is a leap year or not.
         */

        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
