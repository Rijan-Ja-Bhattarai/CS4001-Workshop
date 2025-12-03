package week5;

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
        int odd_count = 0, even_count = 0, num;
        int r = 0;
        System.out.println("Enter number: ");
        num = sc.nextInt();

        while (num != 0) {
            r = num % 10;
            if (r % 2== 0) {
                even_count += 1;
            }
            else {
                odd_count += 1;
            }
            num /= 10;
        }
        System.out.println("Odd digit count: "+ odd_count);
        System.out.println("Even digit count: "+ even_count);

    }
}