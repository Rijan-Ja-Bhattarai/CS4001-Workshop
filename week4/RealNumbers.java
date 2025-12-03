package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class RealNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RealNumbers
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int Num;
        System.out.println("Enter Number: ");
        Num = sc.nextInt();
        
        if (Num > 0) {
            System.out.println("Positive");
        }
        else if (Num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("zero");
        }
        
        sc.close();
    }
}