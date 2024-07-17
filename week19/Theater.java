import java.util.*;

public class Theater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] seats = {
            {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000},
            {800, 800, 800, 800, 1000, 1000, 800, 800, 800, 800},
            {750, 750, 800, 800, 900, 900, 800, 800, 750, 750},
            {600, 700, 750, 700, 800, 800, 700, 750, 700, 600},
            {500, 500, 500, 500, 500, 500, 500, 500, 500, 500},
        };
        int [][] seatsOriginal = {
            {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000},
            {800, 800, 800, 800, 1000, 1000, 800, 800, 800, 800},
            {750, 750, 800, 800, 900, 900, 800, 800, 750, 750},
            {600, 700, 750, 700, 800, 800, 700, 750, 700, 600},
            {500, 500, 500, 500, 500, 500, 500, 500, 500, 500},
        };

        int totalCost = 0;
        int rowPicked;
        int colPicked;

        boolean done = false;
        String choice;
        System.out.println("Theater Seats");
        while (done != true) {
            System.out.println("G - Show Theater Gride");
            System.out.println("S - Seat Pricing");
            System.out.println("P - Purchase Seat");
            System.out.println("R - Revenue");
            System.out.println("U - Revenue");
            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "G":
                    for (int row = 0; row < seats.length; row++) {
                        for (int col = 0; col <

                        seats[row].length; col++) {
                            System.out.print(row + " - " + col  + ", ");
                        }
                        System.out.println();
                  }
                    break;
                case "S":
                for (int[] innerArray: seats) {
                    for (int val : innerArray) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                }
                break;
                case "P":
                    System.out.println("what row would you like?");
                    rowPicked = in.nextInt();
                    in.nextLine();
                    System.out.println("what column would you like?");
                    colPicked = in.nextInt();
                    in.nextLine();
                    if (rowPicked > seats.length || colPicked > seats[0].length) {
                        System.out.println("that seat does not exist");
                    } else {
                        if (seats[rowPicked][colPicked] != -1) {
                            totalCost = totalCost + seats[rowPicked][colPicked];
                            seats[rowPicked][colPicked] = -1;
                        } else if (seats[rowPicked][colPicked] == -1) {
                            System.out.println("that seat is already reserved");
                        }
                    }


                break;
                case "R":
                    System.out.println("the revenue is " + totalCost);
                break;
                case "U":
                    System.out.println("what row would you like?");
                    rowPicked = in.nextInt();
                    in.nextLine();
                    System.out.println("what column would you like?");
                    colPicked = in.nextInt();
                    in.nextLine();
                    if (rowPicked > seats.length || colPicked > seats[0].length) {
                        System.out.println("that seat does not exist");
                    } else {
                        if (seats[rowPicked][colPicked] == -1) {
                            totalCost = totalCost - seatsOriginal[rowPicked][colPicked];
                            seats[rowPicked][colPicked] = seatsOriginal[rowPicked][colPicked];
                        } else if (seats[rowPicked][colPicked] != -1) {
                            System.out.println("that seat is still available");
                        }
                    }
                    break;
                case "Q":
                    System.out.println("Quit");
                    done = true;
                break;
             }
        }
    }
}