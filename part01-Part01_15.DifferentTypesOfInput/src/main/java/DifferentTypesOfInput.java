
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double secnumber = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+ text);
        System.out.println("You gave the integer "+ number);
        System.out.println("You gave the double "+ secnumber);
        System.out.println("You gave the boolean "+ value);

        // Write your program here

    }
}
