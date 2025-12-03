package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int subj;
        System.out.println("Number of subjects: ");
        subj = sc.nextInt();
        
        int [] perc = new int[subj];
        
        for (int i = 0; i < subj; i++) {
            System.out.println("Enter Marks of Subject " + i + ": ");
            perc[i] = sc.nextInt();
        }
        
        for (int i = 0; i < subj; i++) {
            if (perc[i] < 40) {
                System.out.println("Fail");
            }
            else
            {
                System.out.println("Pass");
            }
        }
        
        
        sc.close();
    }
}