import java.util.*;

public class Week15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myName = "Donda"; // Add your name
        int week = 15; // What week is it?
        System.out.println("Welcome to Week " + week);
        System.out.println("Name: " + myName);
        SpellChecker sc = new SpellChecker();
        // menu variables
        boolean done = false;
        String choice;



        // add friends array
        String[] friends = {"Devin", "Riley", "Teddi"};

        do {
            System.out.println("E1 - Example 1");
            System.out.println("E2 - Example 2");
            System.out.println("E3 - Example 3");
            System.out.println("E4 - Example 4");
            // Add additional menu items


            System.out.println("Q - Quit");
            System.out.print("Choice: ");
            choice = in.nextLine();
            switch (choice) {
                case "E1":
                    System.out.println("Example 1");
                    System.out.println(friends[0]);
                    for (int i = 0; i < friends.length; i++) {
                        System.out.println(friends[i]);
                    }

                    break;
                case "E2":
                    System.out.println("Example 2");
                    for (String f: friends) {
                        System.out.println(f);
                    }

                    break;
                case "E3":
                    System.out.println("Example 3");
                    int[] nums = {1,2,3,4,5};
                    int value = 0;
                    mystery(nums, value);
                    for (int n : nums) {
                        System.out.println(n + value);
                    }

                    break;
                case "E4":
                    System.out.println("Example 4");
                    Student devin = new Student("Devin", 17, "USA");
                    Student riley = new Student("Riley", 16, "Canada");
                    Student teddi = new Student("Teddi", 17, "China");
                    Student[] studentArray = {devin, riley, teddi};
                    System.out.println(studentArray[0]);

                    break;
                // next case(s)
                case "P1":


                    if (sc.spellCheck("able")) {
                        System.out.println("able is spelt correctly");
                    } else {
                        System.out.println("able is spelt incorrectly");
                    }
                    break;
                case "P2":
                    Student[] studentList = new Student[10];
                    studentList[0] = new Student("Ronan",17,"South Africa");
                    studentList[1] = new Student("Julian",15,"Australia");
                    studentList[2] = new Student("Ali",16,"UAE");
                    studentList[3] = new Student("Ricane",18,"China");
                    studentList[4] = new Student("Donda",16,"South Africa");
                    studentList[5] = new Student("Doris",17,"Vietnam");
                    studentList[6] = new Student("Ruihan",16,"China");
                    studentList[7] = new Student("Hao",18,"Singapore");
                    studentList[8] = new Student("Tshegofatso",16,"South Africa");
                    studentList[9] = new Student();
                    System.out.println("Search by country");
                    String searchTerm=in.nextLine();
                    for (Student student: studentList) {
                        if (student.getCountry().equals(searchTerm)) {
                            System.out.println(student.getName());
                        }
                    }
                    System.out.println("");
                    System.out.println("Search by age");
                    int searchAge=in.nextInt();
                    in.nextLine();
                    for (Student student: studentList) {
                        if (student.getAge()==searchAge) {
                            System.out.println(student.getName());
                        }
                    }
                    System.out.println("");
                    break;

                case "P3":
                    int[] arr = {1,2,3,4,5,6};
                    System.out.println(divBySum(arr,2));

                    break;

                case "P4":
                    int[] numList = new int[100];
                    randomFill(numList);
                    System.out.println(maxNum(numList));
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

    // mystery method
    public static void mystery(int[] list, int num) {
        for (int x = 0; x < list.length; x++) {
            list[x] = 0;
        }
    }

    public static int divBySum (int[] arr, int num) {
        int sum = 0;
        for (int i=0; i <= arr.length-1;i++) {
            if ((arr[i] % num)==0) {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static int maxNum(int[] arr) {
        int max = 0;
        for (int num: arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
    public static void randomFill(int[] arr) {
        for (int num: arr) {
            num=(int)(20*Math.random());
        }
    }
}