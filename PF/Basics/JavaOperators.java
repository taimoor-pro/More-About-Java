package PF.Basics;

public class JavaOperators {

    public static void main(String[] args) {
        /*
         * Question : What will be the output of the following programs :
         */
        // ^ 1

        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , "); // 5 
        System.out.print(exp2); // 4 

        // ^2
        int a = 200, b = 50, c = 100;
        if (a > b && b > c) {
            System.out.println("Hello");
        }
        if (c > b && c < a) {
            System.out.println(" \n Java"); // JAVA
        }
        if ((b + 200) < a && (b + 150) < c) {
            System.out.println("Hello Java");
        }

        // ^3
        int r, s, t;
        r = s = t = 2;
        r += s;
        s -= t;
        t /= (r + s);
        System.out.println(r + " " + s + " " + t); // 4 0 0

        // ^4
        int d = 9, f = 12;
        int v = 2, w = 4, h = 6; 
        int exp = 4 / 3 * (d + 34) + 9 * (v + w * h) + (3 + f * (2 + v)) / (v + w * f);

        System.out.println(exp); 

        // ^ 5
        int k = 10, l = 5;
        int exp4 = (l * (k / l + k / l));
        int exp5 = (l * k / l + l * k / l);
        System.out.println(exp4);
        System.out.println(exp5);
    }
}
