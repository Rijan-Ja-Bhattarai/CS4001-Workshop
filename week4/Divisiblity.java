package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class Divisiblity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisiblity
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int Num;
        System.out.println("Enter number: ");
        Num = sc.nextInt();
        
        if (Num % 3 == 0 && Num % 7 == 0) {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not Divisible");
        }
        sc.close();
    }
}