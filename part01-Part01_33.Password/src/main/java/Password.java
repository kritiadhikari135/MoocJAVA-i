
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String pass = String.valueOf(scan.nextLine());
        if (pass.equals("Caput Draconis")){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
