package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class NestedIf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedIf
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int Num;
        System.out.println("Enter number: ");
        Num = sc.nextInt();
        
        if (Num % 3 == 0) {
            if(Num % 5 == 0) {
                System.out.println("Divisible by both 3 and 5");
            }
            else {
            System.out.println("Not divisible");
            }
        }
        else {
            System.out.println("Not divisible");
        }
        sc.close();
    }
}