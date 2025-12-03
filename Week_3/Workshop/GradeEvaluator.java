package Week_3.Workshop;

import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int Grade = 0;
        String Result;
        // Take input
        System.out.println("Enter grade: ");
        Grade = sc.nextInt();
        
        // Check condition
        Result = (Grade >= 40) ? "Pass" : "Fail";
        System.out.println(Result);
        sc.close();
    }
}
