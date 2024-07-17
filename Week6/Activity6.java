import java.util.*;

public class Activity6 {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        Comparer c = new Comparer();

        System.out.println(c.compareFirst("Tom","Harry"));
        System.out.println(c.compareFirst("Tom","Tomato"));
        System.out.println(c.compareFirst("church","Churchill"));
        System.out.println(c.compareFirst("car maker","carburetor"));
        System.out.println(c.compareFirst("Harry","hairy"));
        System.out.println(c.compareFirst("C++","c++"));
        System.out.println(c.compareFirst("Tom"," Tom"));
        System.out.println(c.compareFirst("car","bar"));
        System.out.println(c.compareFirst("Java","j++"));
        System.out.println(c.compareFirst("Java 1.0","Java 2.0"));

        System.out.println("");
        System.out.println("Problem 2");
        System.out.println("Give me two strings");
        String first = in.nextLine();
        String second = in.nextLine();
        System.out.println(c.compareFirst(first, second) + " is first");
        System.out.println(c.compareSecond(first, second) + " is second");

        System.out.println("");
        System.out.println("Problem 3");
        System.out.println("Give me three strings");
        first = in.nextLine();
        second = in.nextLine();
        String third = in.nextLine();
        System.out.println("First is " + c.orderThree(first, second, third, "one"));
        System.out.println("Second is " + c.orderThree(first, second, third, "two"));
        System.out.println("Third is " + c.orderThree(first, second, third, "three"));
        System.out.println("");
        System.out.println("Problem 4");
        System.out.println("Did you pass the driver's knowledge test?");
        String input = in.nextLine();
        input = input.toLowerCase();
        boolean knowledgePass = input.equals("yes");
        System.out.println("Did you pass the road test?");
        input = in.nextLine();
        input = input.toLowerCase();
        boolean roadPass = input.equals("yes");

        if (knowledgePass && roadPass) {
            System.out.println("You can drive!");
        } else {
            System.out.println("Not yet!");
        }

        System.out.println("");
        System.out.println("Problem 5");
        System.out.println("Did you pass the driver's knowledge test?");
        input = in.nextLine();
        input = input.toLowerCase();
        knowledgePass = input.equals("yes");
        System.out.println("Did you pass the road test?");
        input = in.nextLine();
        input = input.toLowerCase();
        roadPass = input.equals("yes");
        System.out.println("how old are you?");
        int age = in.nextInt();
        in.nextLine();
        if (knowledgePass && roadPass && age >= 16) {
            System.out.println("You can drive!");
        } else {
            System.out.println("Not yet!");
        }

        System.out.println("");
        System.out.println("Problem 6");
        System.out.println("Which zone are you going to?");
        int zone = in.nextInt();
        in.nextLine();
        System.out.println("Are you a child?");
        String isChildRaw = in.nextLine();
        isChildRaw = isChildRaw.toLowerCase();
        boolean isChild = isChildRaw.equals("yes");
        float price;
        if (zone == 1 && isChild) {
            price = 0.85f;
        } else if (zone == 2 && isChild) {
            price = 1.55f;
        } else if (zone == 3 && isChild) {
            price = 2.05f;
        }else if (zone == 4 && isChild) {
            price = 2.7f;
        }else if (zone == 5 && isChild) {
            price = 3.2f;
        }else if (zone == 1 && isChild == false) {
            price = 1.85f;
        }else if (zone == 2 && isChild == false) {
            price = 3.50f;
        }else if (zone == 3 && isChild == false) {
            price = 4.50f;
        }else if (zone == 4 && isChild == false) {
            price = 6.00f;
        }else if (zone == 5 && isChild == false) {
            price = 7f;
        } else {
            price = 0;
        }
        System.out.println("The price fair is $" + price);




    }
}