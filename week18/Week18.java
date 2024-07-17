import java.util.*;

public class Week18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myName = "Donda"; // Add your name
        int week = 18; // What week is it?
        System.out.println("Welcome to Week " + week);
        System.out.println("Name: " + myName);
        // menu variables
        boolean done = false;
        String choice;

        // create 2D array named numbers
        double[][] scores = new double[3][4];
        int[][] numbers = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] grid = {
            {0,0,7},
            {0,7,0},
            {0,0,0}
        };




        do {
            System.out.println("E1 - Example 1");
            System.out.println("E2 - Example 2");
            System.out.println("E3 - Example 3");
            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "E1":
                    System.out.println("Example 1");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("i = " + i + " ");
                            System.out.print("j = " + j + "\t");
                        }
                        System.out.println();
                    }

                    break;
                case "E2":
                    System.out.println("Example 2");
                    for (int row = 0; row < numbers.length; row++) {
                        for (int col = 0; col < numbers[row].length; col++) {
                            System.out.print(numbers[row][col] + " ");
                        }
                        System.out.println();
                    }




                    break;
                case "E3":
                    System.out.println("Example 3");
                    System.out.println("Rows: " + numbers.length);
                    System.out.println("Columns: " + numbers[0].length);
                    convert(grid);
                    System.out.println(grid[0][2]);

                    break;
                case "E4":
                    System.out.println(search(numbers,9));
                    System.out.println(search(numbers,10));
                    break;
                case "A1":
                    String[][] populationStr = {
                        {"Africa","107", "133", "767", "1766"},
                        {"Asia","635", "947", "3634", "5268"},
                        {"Australia","2","6","30","46"},
                        {"Europe","203","408","729","628"},
                        {"N. America","7","82","307","392"},
                        {"S. America","24","74","511","809"}
                    };
                    int[][] populationInt = {
                        {107, 133, 767, 1766},
                        {635, 947, 3634, 5268},
                        {2,6,30,46},
                        {203,408,729,628},
                        {7,82,307,392},
                        {24,74,511,809}
                    };
                    String[] continents = {"Africa", "Asia", "Australia", "Europe", "N. America", "S. America"};
                    // System.out.println("\t1800\t1900\t2000\t2050");
                    // for (int row = 0; row < populationStr.length; row++) {
                    //     for (int col = 0; col < populationStr[row].length; col++) {
                    //         System.out.print(populationStr[row][col] + "\t");
                    //     }
                    //     System.out.println();
                    // }
                    System.out.println("Population per continent (in millions)");
                    System.out.println("\t1800\t1900\t2000\t2050");
                    for (int row = 0; row < continents.length; row++) {
                        System.out.print(continents[row] + "\t");
                        for (int col = 0; col < populationInt[row].length; col++) {
                            System.out.print(populationInt[row][col] + "\t");
                         }
                         System.out.println();
                    }

                    System.out.println("What was the total number of people in 1800?");
                    int total1800 = 0;
                    for (int row = 0; row < populationInt.length; row++ ) {
                        total1800 = total1800 + populationInt[row][0];
                        System.out.println(total1800);
                    }
                    System.out.println(total1800 + " 000 000");
                    System.out.println("What was the total number of people in 1900?");
                    int total1900 = 0;
                    for (int row = 0; row < populationInt.length; row++ ) {
                        total1900 = total1900 + populationInt[row][1];
                        System.out.println(total1900);
                    }
                    System.out.println(total1900 + " 000 000");
                    System.out.println("What was the total number of people in 2000?");
                    int total2000 = 0;
                    for (int row = 0; row < populationInt.length; row++ ) {
                        total2000 = total2000 + populationInt[row][2];
                        System.out.println(total2000);
                    }
                    System.out.println(total2000 + " 000 000");
                    System.out.println("What is the projected number of people in 2050?");
                     int total2050 = 0;
                    for (int row = 0; row < populationInt.length; row++ ) {
                        total2050 = total2050 + populationInt[row][3];
                        System.out.println(total2050);
                    }
                    System.out.println(total2050 + " 000 000");
                    break;

                case "A2":
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
    public static boolean search(int[][] array, int value) {
        boolean found = false;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length;col++) {
                if (array[row][col] == value)
                {
                    found = true;
                    return found;
                }
            }
        }
        return found;
    }
    public static void convert (int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 7)
                {
                    grid[row][col] = 0;
                }
            }
        }
    }
}