import java.util.*;

public class Battleship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // pieces can be either horizontal or vertical
        // Carriers are 7 elements - use C
        // Submarines are 5 elements - use S
        // Destroyers are 6 elements - use D

        String [][] grid = {
            {"-", "3", "-", "-", "4", "4", "4", "4", "-", "-"},
            {"-", "3", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "3", "5", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "5", "-", "-", "-", "2", "-", "-", "-"},
            {"-", "-", "5", "-", "-", "-", "2", "-", "-", "-"},
            {"-", "-", "5", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "5", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "3", "3", "3", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
        };

        boolean destroyerSunk = false;
        boolean submarineSunk = false;
        boolean carrierSunk = false;

        boolean done = false;
        String choice;
        System.out.println("Battleship Game");
        while (done != true) {
            System.out.println("P - Play");
            System.out.println("G - Reveal Grid");
            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "G":
                    for (int row = 0; row < grid.length; row++) {
                        for (int col = 0; col < grid[row].length; col++) {
                            System.out.print(grid[row][col] + " ");
                        }
                        System.out.println();
                    }
                break;
                case "P":

                break;
                case "Q":
                    System.out.println("Quitting!");
                    done = true;
                break;
            }
        }
    }
    // public void hitSearch(int rowI, int colI) {
    //     int edgerRow;
    //     int edgeCol;
    //     String lengthS;
    //     int length;

    //     if (grid[rowI][colI].equals("-") || grid[rowI][colI].equals("x")) {
    //         System.out.println("This is just water");
    //     } else {
    //         length = Integer.valueOf(grid[rowI][colI]);
    //         lengthS = grid[rowI][colI];
    //         if (grid[rowI-1][colI] != lengthS && grid[rowI][colI-1] != lengthS) {
    //             edgeRow = rowI;
    //             edgeCol = colI;
    //         } else if (grid[rowI-1][colI] != lengthS && grid[rowI+1][colI] != lengthS) {
    //             while (!(grid[rowI-1][colI] != lengthS && grid[rowI][colI-1] != lengthS)) {
    //                 rowI = rowI - 1;
    //             }
    //         } else if (grid[rowI-1][colI] != lengthS && grid[rowI+1][colI] != lengthS) {
    //             while (!(grid[rowI-1][colI] != lengthS && grid[rowI][colI-1] != lengthS)) {
    //                 rowI = rowI - 1;
    //             }
    //         }
    //         //orientation is horizontal
    //         if (grid[edgeRow+1][edgeCol] == lengthS) {

    //         }
    //         //orientation is
    //         if (grid[edgeRow][edgeCol+1] == lengthS) {

    //         }
    //     }
    // }
}