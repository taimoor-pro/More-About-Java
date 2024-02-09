package PF.Loops.Basic;

public class JavaLoops {
    public static void main(String[] args) {
        // * While Loop
        int counter = 0;
        while (counter <= 10) {
            System.out.println("Hello World!");
            counter++;
        }
        System.out.println("Printed Hello World 10x");

        // * Do While Loop
        int d = 12;
        do {
            System.out.println("Hello World! ");
            d++;
        } while (d < 10);

        // * Break Statement */
        for (int l = 1; l <= 5; l++) {
            if (l == 3) {
                break;
            }
            System.out.println(l);
        }

    }
}
