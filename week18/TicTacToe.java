import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] tictactoe = {
            {7,7,7},
            {7,7,7},
            {7,7,7}
        };
        int[][] showtictactoe;
        int[] player1 = {0,0};
        int row;
        int col;
        int turn = 1;
        int[] player2 = {0,0};
        int[][] grid = {
            {0,0,7},
            {0,7,0},
            {0,0,0}
        };

        boolean done = false;
        String choice;
        System.out.println("Tic-Tac-Toe Game");
        while (done != true) {
            // print the values of the 2D array
            System.out.println("P1 - Player 1 O");
            System.out.println("P2 - Player 2 X");
            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            while (turn > 9) {
                if (turn % 2 == 0) {
                    System.out.println("Player 1 pick");
                    // ask the user for the row
                    System.out.println("Pick your row");
                    row = in.nextInt();

                    // ask the user for the column
                    System.out.println("Pick your column");
                    col = in.nextInt();
                    in.nextLine();

                    // assign the value to the location
                    tictactoe[row][col] = 1;
                } else {
                    System.out.println("Player 2 pick");
                    // ask the user for the row
                    System.out.println("Pick your row");
                    row = in.nextInt();

                    // ask the user for the column
                    System.out.println("Pick your column");
                    col = in.nextInt();
                    in.nextLine();

                    // assign the value to the location
                    tictactoe[row][col] = 2;
                }
                    convert(grid, 7, 0);
                    System.out.println(grid[0][2]);
                turn++;
                }

                if (turn > 9) {
                        System.out.println("draw");

                }
            }
        }
    }
    public static void convert (int[][] grid, int target, int newValue) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == target)
                {
                    grid[row][col] = newValue;
                }
            }
        }
    }
}



// (int[][] arr, int targetInt, int newInt) {
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//             if (arr[i][j] == targetInt) {
//                 arr[i][j] = newInt;
//             }
//         }
//     }
// }