package week5;

import java.util.Scanner;
/**
 * Write a description of class fibonacci_series here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci_series
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a =0, b= 1, c = 0;
        int num;
        System.out.println("Enter n'th term: ");
        num = sc.nextInt();
        System.out.println(a + "\n" + b);
        for (int i = 1; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        sc.close();
    }
}