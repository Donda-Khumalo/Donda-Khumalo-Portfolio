import java.util.*;

public class week19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myName = "Donda"; // Add your name
        int week = 19; // What week is it?
        System.out.println("Welcome to Week " + week);
        System.out.println("Name: " + myName);
        // menu variables
        boolean done = false;
        String choice;

        // create 2D arrays
        String [][] letters = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"}
        };
        Boolean bools[][] = {
            {true, false, true},
            {false, true, false},
            {true, false, true}
        };

        do {
            System.out.println("E1 - Example 1");
            System.out.println("E2 - Example 2");
            System.out.println("E3 - Example 3");
            System.out.println("E4 - Example 4");
            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "E1":
                    System.out.println("Example 1");
                    for (int col = 0; col < letters[0].length; col++) {
                        for (int row = 0; row < letters.length;row++) {
                            System.out.print(letters[row][col] + " ");
                        }
                        System.out.println();
                    }

                    break;
                case "E2":
                    System.out.println("Example 2");
                    for (Boolean[] innerArray: bools) {
                        for (Boolean val : innerArray) {
                            System.out.print(val + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "E3":
                    System.out.println("Example 3");


                    break;
                case "E4":
                    System.out.println("Example 4");


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

    // add search method
    

}