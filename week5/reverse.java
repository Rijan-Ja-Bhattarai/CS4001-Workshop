package week5;

import java.util.Scanner;
/**
 * Write a description of class reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverse
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int t = 0, s = 0, r = 0;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        int temp = num;
        while (num != 0) {
            r = num % 10;
            s = s * 10 + r;
            num /= 10;
        }
        if (temp == s) {
            System.out.println(s + " is a palindrome number");
        }
        else {
            System.out.print(s + " is not a palindrome number");
        }
    }
}