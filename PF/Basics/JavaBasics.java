package PF.Basics;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        // Output in java
        System.out.println("This is my first output with next line");

        System.out.print("JavaBasics.main()");
        System.out.print("\t No Second Line)");

        // * Variables in JAVA
        int a = 10;
        int b = 15;
        int c = a + b;
        System.out.println("\n" + c);

        String name = "Taimoor Nawaz";
        System.out.println(name);

        // * Datatype in JAVA
        byte n = -127; // 127 to -128 limit of size
        System.out.println("My N value is: " + n);

        byte intSizeinBits = Byte.SIZE;
        System.out.println(intSizeinBits);

        // Input
        // * Sum of nu1 & nu2
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

        // * Area of circle
        float radius = sc.nextInt();
        float area = 3.14F * radius * radius;
        System.out.println(area);

        // * Type conversion/ weding conversion / implicite conversion;

        int number = 23;
        float number2 = number;
        System.out.println(number2);

        // number = number2; //* lossy conversion float to int */
        // System.out.println(number);

        // * Type casting/ Explicite/ Narrowing
        // data loos hony doo mujhy chota number chiyan
        long nu = 10;
        int ba = (int) nu; // wesy lossy convertion hai because long to int
        System.out.println(ba);

        float bab = 22.9F;
        int ac = (int) bab;
        System.out.println(ac);

        char ch = 'a';
        int chtoInt = ch;
        System.out.println("My Converted Number: " + chtoInt);

        // * Type Promotion
        // * Type Promotion sirf expression kai saat hi hota hai
        char aa = 'a'; // first Java converts automaticaly int
        char bb = 'b'; // first Java converts automaticaly int

        System.out.println(aa - bb);
        System.out.println(bb - aa);
        
    }
}
