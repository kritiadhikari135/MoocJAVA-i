
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("GIve point[0-100]:");
        double point = Double.valueOf(scan.nextLine());
        if(point < 0){
            System.out.println("impossible!");
        }else if(point <= 49){
            System.out.println("failed");
        }else if(point <=59){
            System.out.println("1");
        }else if(point <= 69){
            System.out.println("2");
        }else if (point <= 79){
            System.out.println("3");
        }else if (point <= 89){
            System.out.println("4");
        }else if(point <= 100){
            System.out.println("5");
        }else{
            System.out.println("incredible!");
        }


    }
}
