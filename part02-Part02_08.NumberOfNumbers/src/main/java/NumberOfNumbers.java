
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =0;
        while(true){
            System.out.print("Give a number: ");
            int  value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;   
            }
            number = number + 1;  
        }
        System.out.println("Number of numbers: " + number);

    }
}
