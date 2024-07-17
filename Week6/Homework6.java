import java.util.*;

public class Homework6 {
    public static void main (String [] args) {
        System.out.println("Give me a word that I will turn into pig latin");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output =  input.substring(1) + input.substring(0, 1) + "ay";
        System.out.println("In pig latin, that word is " + output);
    }
}