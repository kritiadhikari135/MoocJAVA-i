
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        if(speed > 120){
            System.out.println("speeding ticket!");
        }
        

        // Write your program here. 
    }
}
