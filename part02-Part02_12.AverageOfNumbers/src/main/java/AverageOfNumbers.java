
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double av;
        int number;

        while (true){
            System.out.println("Give a number: ");
            number = Integer.valueOf(scanner.nextLine());

            if(number ==0){
                break;
            }
            count = count + 1;
            sum = sum + number;
            // av = (double)sum/number;
        }
        av = (double) sum/count;
        System.out.println("Average of the numbers: "+ av);


    }
}
