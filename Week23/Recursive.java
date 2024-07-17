public class Recursive {

    // message method

    public static void message (int n) {
        if (n > 0) {
            System.out.println("This is a recursive method");
            message(n-1);
        }
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void printStars2(int n) {
        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("*");
            System.out.println("*");
        } else if (n == 3) {
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
        } // etc
    }

    public static void printStars3(int n) {
        // base case
        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("*");
            printStars3(1);
        } else if (n == 3) {
            System.out.println("*");
            printStars3(2);
        } // etc
    }

    public static void printStars4(int n) {
        // base case
        if (n == 1) {
            System.out.println("*");
        // recursive case
        } else {
            System.out.println("*");
            printStars4(n-1);
        }
    }

    public static void printStars5(int n) {
        // base case
        if (n == 0) {
            System.out.println("*");
        // recursive case
        } else {
            System.out.println("*");
            printStars5(n-1);
        }
    }

    // mystery1 method




}