
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int number = Integer.valueOf(scanner.next());
        System.out.println("Where from?");
        int num = Integer.valueOf(scanner.next());
        for (int i = num ; i<=number; i++){
            System.out.println(i);
        }
    }
}
