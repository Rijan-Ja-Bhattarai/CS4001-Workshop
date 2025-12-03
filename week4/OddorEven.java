package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class OddorEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddorEven
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int Num;
        
        System.out.print("Enter Number: ");
        Num = sc.nextInt();
        
        if (Num % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        
        sc.close();
    }
}