import java.util.Scanner;
import java.lang.Math;


public class pr_01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = src.nextInt();
        
        System.out.print("Enter 2nd number: ");
        int y = src.nextInt();
        
        System.out.println("Sum = " + (x + y));
        
        src.close();
    }
}