package PF.Basics;

import java.util.Scanner;

public class JavaBasicProblems {
    public static void main(String[] args) {
        // * VARIABLES & DATA TYPES QUESTIONS
        /*
         * Question 1 : In a program, input 3 numbers : A, B and C. You have to output
         * the average of these 3 numbers.
         * (Hint : Average of N numbers is sum of those numbers divided by N)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three number next by next:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c) / 3;

        System.out.println("Average : " + average);

        /*
         * Question 2: In a program, input the side of a square. You have to output the
         * area of the square.
         * (Hint : area of a square is (side x side))
         */

        System.out.println("Enter a sides: ");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int square = sideA * sideB;
        System.out.println("Square is : " + square);

        /*
         * Question 3: Enter cost of 3 items from the user (using float data type) - a
         * pencil, a pen and an eraser. You have to output the total cost of the items
         * back to the user as their bill.
         * (Add on : You can also try adding 18% gst tax to the items in the bill as an
         * advanced problem)
         */

        float pencil = 12;
        float pen = 10;
        float eraser = 5;

        float total_cost = pencil + pen + eraser;

        System.out.println("Bill is : " + total_cost);
        // Add on - with 18% tax
        float newTotal = total_cost + (total_cost * 0.18F);
        System.out.println("Total cost of your Pen, Pencil & Eraser with 18% GST is: " + newTotal);

        /*
         * Question 4: What will be the type of result in the following Java code?
         * (Hint : Look at the largest data type among these)
         * 
         * byte b = 4;
         * char c = 'a';
         * short s = 512;
         * int i = 1000;
         * float f = 3.14F;
         * double d = 99.995F;
         * 
         * result = (f * b) + (i % c) - (d * s);
         */

        byte bb = 4;
        char cc = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14F;
        double d = 99.995F;
        int result = (int) ((f * bb) + (i % cc) - (d * s));

        // ^ Answer: In the mentioned code, the result variable will be of double type
        // because of type conversion.
        
    }
}