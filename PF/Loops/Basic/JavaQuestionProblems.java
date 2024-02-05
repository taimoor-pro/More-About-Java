package PF.Loops.Basic;

import java.util.Scanner;

public class JavaQuestionProblems {
    public static void main(String[] args) {
        // * Question 1 : How many times 'Hello' is printed?

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }

        // Answer: Hello (2)

        // * Question 2 : Write a program that reads a set of integers, and then prints
        // the sum of the even and odd integers.
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                System.out.println(i + " even");
            } else {
                oddSum += i;
                System.out.println(i + " odd");
            }
        }

        System.out.println("Sum of the even numbers is: " + evenSum);
        System.out.println("Sum of the odd numbers is: " + oddSum);

        // * Question 3 : Write a program to find the factorial of any number entered by
        // the user.
        // (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and
        // exists for positive numbers
        // only. We write factorial as n!
        // So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
        // Note - Please do not confuse factorial with NOT EQUAL TO operator, they are
        // not the same)

        int n = 0, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

        // * Question 4 : Write a program to print the multiplication table of a number
        // N, entered by the user.
        int N = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " X " + i + " = " + N * i);
        }

        // * */ Question 5 : What is wrong in the following program?

        // for (int i = 0; i <= 5; i++) {
        // System.out.println("i = " + i);
        // }

        // System.out.println("i after the loop = " + i);

        // ! I OUTSIDE THE LOOP IS NOT ACCEPTABLE IN A PROGRAMMING

    }

}
