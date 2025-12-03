package week5;

import java.util.Scanner;
/**
 * Write a description of class PrimeOrNot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeOrNot
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(num + " is a composite Number");
        }
        else {
            System.out.println(num + " is a Prime Number");
        }
    }
}