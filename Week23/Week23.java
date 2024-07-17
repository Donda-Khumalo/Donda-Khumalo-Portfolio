import java.util.*;

public class Week23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myName = "Donda"; // Add your name
        int week = 23; // What week is it?
        System.out.println("Welcome to Week " + week);
        System.out.println("Name: " + myName);
        // menu variables
        boolean done = false;
        String choice;

        do {
            System.out.println("E1 - Example 1");
            System.out.println("E5 - Hanoi solver");
            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "E1":
                    System.out.println("Example 1");
                    Recursive.message(5);
                    break;
                case "E2":
                    System.out.println("Example 2");
                    System.out.println("printStars()");
                    Recursive.printStars(3);
                    System.out.println("printStars3()");
                    Recursive.printStars3(3);
                    System.out.println("printStars4()");
                    Recursive.printStars4(3);
                    System.out.println("printStars5()");
                    Recursive.printStars5(3);
                    break;
                case "m1":
                    mystery1(1,11);
                    break;
                case "m2":
                    System.out.println("test 1");
                    System.out.println(mystery2(111));
                    System.out.println("test 2");
                    System.out.println(mystery2(44444));
                    System.out.println("test 3");
                    System.out.println(mystery2(222));
                    break;
                case "m3":
                    mystery3("hello");
                    mystery3("Donda");
                    break;
                case "E3":
                    System.out.println("Example 3");
                    System.out.println(sumOf(10));
                    break;
                case "E4":
                    System.out.println("Example 4");
                    System.out.println(factorial(5));
                    break;
                case "E5":
                    System.out.println("Example 5");
                    Hanoi towersOfHanoi = new Hanoi(3);
                    break;
                case "A1":
                    sign(3);
                    break;
                case "A2":
                    counting(1, 10);
                    break;
                // quit and default cases
                case "Q":
                    System.out.println("Quit");
                    done = true;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (!done);
    }
    public static void mystery1 (int a, int b) {
        System.out.println(a);
        if (a<b) {
            mystery1(a+1, b);
        }
    }
    public static int mystery2 (int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n /10;
            System.out.println(n+ " " + "a: " + a);
            int b = n % 10;
            System.out.println(n+ " " + "b: " + b);

            return mystery2(a+b);
        }
    }
    public static void mystery3 (String str) {
        if (str.length() > 0) {
            mystery3(str.substring(1));
            System.out.print(str.substring(0,1));
        }
    }
    public static int sumOf (int n) {
        if (n == 0) {
            return 1;
        } else {
            return sumOf(n-1) + n;
        }
    }
    public static int factorial (int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
    public static void sign(int n) {
        // base case
        if (n == 1) {
            System.out.println("No Parking");
        // recursive case
        } else {
            System.out.println("No Parking");
            sign(n-1);
        }
    }
    public static void counting (int a, int b) {
        System.out.print(a);
        if (a<b) {
            mystery1(a+1, b);
            System.out.print(", ");
        }
    }

}

