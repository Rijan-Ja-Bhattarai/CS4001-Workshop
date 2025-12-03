package Week_3.week4;

import java.util.Scanner;
/**
 * Write a description of class GPAtoGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPAtoGrade
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float gpa = 0.0f;
        
        System.out.println("Enter GPA: ");
        gpa = sc.nextFloat();
        
        float percentage = 0.0f;
        percentage = (gpa/ 4.0f) * 100.0f;
        
        if (gpa > 0.0f && gpa < 4.0f) {
            if (percentage >= 80.0f) {
                System.out.println("A");
            }
            else if (percentage >= 60.0f && percentage <= 80.0f) {
                System.out.println("B");
            }
            else if (percentage >= 40.0f && percentage <= 60.0f) {
                System.out.println("C");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        else
        {
            System.out.println("Invalid GPA");
        }
        
        sc.close();
    }
}