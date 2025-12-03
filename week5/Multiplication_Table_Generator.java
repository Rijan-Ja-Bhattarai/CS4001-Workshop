package week5;

import java.util.Scanner;
/**
 * Write a description of class Multiplication_Table_Generator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplication_Table_Generator
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num, mul = 1;
        
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(num + " * " + i + " = " + mul);
        }
    }
}