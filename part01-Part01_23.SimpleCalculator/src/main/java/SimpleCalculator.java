
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        double result = (double)first/second;
        System.out.println(first + " + " + second + " = "+(first+second));
        System.out.println(first + " - " + second + " = "+(first-second));
        System.out.println(first + " * " + second + " = "+(first*second));
        System.out.println(first + " / " + second + " = "+ result);

        // Write your program here

    }
}
