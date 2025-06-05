
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int sum = number+number2;

        double squareRootOfSum = Math.sqrt(sum);
        System.out.println(squareRootOfSum);

    }
}
