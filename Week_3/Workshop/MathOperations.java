package Week_3.Workshop;

import java.util.Scanner;
import java.lang.Math;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        
        int a,b = 0;
        
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        
        System.out.print("Enter first number: ");
        a = sc.nextInt(); 
        
        System.out.println("Sum: "+ (a + b));
        System.out.println("Difference: "+ (a - b));
        System.out.println("Multiplication: "+ (a * b));
        System.out.println("Division: "+ (a / b));
        System.out.println("Remainder: "+ (a % b));
        
        sc.close();
    }
}