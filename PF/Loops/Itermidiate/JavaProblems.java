package PF.Loops.Itermidiate;

class JavaProblems {
    public static void main(String[] args) {
        // * Print Reverse of a number using while loop
        int n = 435223, lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10; // Give last Digit
            System.out.print(lastDigit);
            n /= 10; // Remove Last digit
        }
        System.out.println();
        // System.out.print(lastDigit); // only 4

        // ^ Print Reverse of given number
        // it means original number ka reverse
        // means ap out side sout kerwa skho apny reverse ko

        int nn = 213155, rev = 0, LD = 0;
        while (nn > 0) {
            LD = nn % 10;
            rev = (rev * 10) + LD;
            nn /= 10; 
        }

        System.out.println("Reverse Number of Original Number " + rev );

        // * */ Reverse a string
        // string = "taimoor" --> roomait

        String name = "taimoor", nstr = "";
        char ch;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            nstr = ch + nstr;
            // System.out.println(nstr);
        }

        System.out.println();
        System.out.println(nstr);

    }
}